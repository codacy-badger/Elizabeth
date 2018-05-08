package com.silverhetch.elizabeth.bus.government.stop

import com.silverhetch.clotho.connection.TargetImpl
import com.silverhetch.elizabeth.arch.Factory
import com.silverhetch.elizabeth.arch.HttpSource
import com.silverhetch.elizabeth.arch.connection.Get
import com.silverhetch.elizabeth.bus.Stops
import com.silverhetch.elizabeth.bus.government.Config
import com.silverhetch.elizabeth.bus.government.GovAuthHeaders
import com.silverhetch.elizabeth.bus.government.Timestamp
import sun.security.ssl.SSLSocketFactoryImpl

class GovernmentStops(private val config: Config) : Factory<Stops> {
    override fun instance(): Stops {
        Timestamp().compute().let { timestamp ->
            return JsonStops(
                HttpSource(
                    Get(
                        TargetImpl("http://ptx.transportdata.tw/MOTC/v2/Bus/Station/City/Taipei?top=30&format=JSON", SSLSocketFactoryImpl()),
                        GovAuthHeaders(config, Timestamp())
                    )
                )
            )
        }
    }
}