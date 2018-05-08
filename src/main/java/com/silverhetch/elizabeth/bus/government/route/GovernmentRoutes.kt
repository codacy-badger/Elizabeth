package com.silverhetch.elizabeth.bus.government.route

import com.silverhetch.clotho.connection.TargetImpl
import com.silverhetch.elizabeth.arch.Factory
import com.silverhetch.elizabeth.arch.HttpSource
import com.silverhetch.elizabeth.arch.connection.Get
import com.silverhetch.elizabeth.bus.Routes
import com.silverhetch.elizabeth.bus.government.Config
import com.silverhetch.elizabeth.bus.government.GovAuthHeaders
import com.silverhetch.elizabeth.bus.government.Timestamp
import sun.security.ssl.SSLSocketFactoryImpl

class GovernmentRoutes(private val config: Config) : Factory<Routes> {
    override fun instance(): Routes {
        return JsonRoutes(
            HttpSource(
                Get(
                    TargetImpl("http://ptx.transportdata.tw/MOTC/v2/Bus/Route/City/Taipei?top=30&format=JSON", SSLSocketFactoryImpl()),
                    GovAuthHeaders(config, Timestamp())
                )
            )
        )
    }
}