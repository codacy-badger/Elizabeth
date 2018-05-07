package com.silverhetch.elizabeth.bus.government

import com.silverhetch.clotho.connection.TargetImpl
import com.silverhetch.elizabeth.arch.Factory
import com.silverhetch.elizabeth.arch.HttpSource
import com.silverhetch.elizabeth.arch.connection.Get
import com.silverhetch.elizabeth.arch.connection.Headers
import com.silverhetch.elizabeth.arch.encryption.Base64Encode
import com.silverhetch.elizabeth.arch.encryption.HmacSHA1
import sun.security.ssl.SSLSocketFactoryImpl

class GovernmentBuses(private val config: Config) : Factory<Buses> {
    override fun instance(): Buses {
        Timestamp().fetch().let { timestamp ->
            return JsonBuses(
                HttpSource(
                    Get(
                        TargetImpl("http://ptx.transportdata.tw/MOTC/v2/Bus/Route/City/Taipei?top=30&format=JSON", SSLSocketFactoryImpl()),
                        object : Headers {
                            override fun values(): Map<String, String> {
                                return hashMapOf(
                                    "Accept" to "application/json",
                                    "x-date" to timestamp,
                                    "Authorization" to AuthString(
                                        config,
                                        Base64Encode(HmacSHA1(XDateString(timestamp), config.appKey()))
                                    ).fetch()
                                )
                            }
                        }
                    )
                )
            )
        }
    }
}