package com.packtpub.runner

import com.packtpub.service.HelloService
import com.packtpub.service.NoAnnoHelloService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * @author Vamsi Vegi
 * @date 7/4/2018
 */

@Component
class AppRunnerOne(
        private val helloService: HelloService,
        private val noAnnoHelloService: NoAnnoHelloService
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println(helloService.sayHello())
        println(noAnnoHelloService.sayHello())

    }
}