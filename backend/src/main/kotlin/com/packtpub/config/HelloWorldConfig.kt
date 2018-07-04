package com.packtpub.config

import com.packtpub.runner.AppRunnerOne
import com.packtpub.service.HelloService
import com.packtpub.service.NoAnnoHelloService
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

/**
 * @author Vamsi Vegi
 * @date 7/4/2018
 */

@Configuration
open class HelloWorldConfig(ctx: GenericApplicationContext){
    init {
        println("----------------------------  beans init : start ---------------------------")
        beans {
            bean<NoAnnoHelloService>()
        }.initialize(ctx)
        println("----------------------------  beans init : complete ---------------------------")
    }
}