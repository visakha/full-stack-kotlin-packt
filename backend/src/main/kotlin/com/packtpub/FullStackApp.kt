package com.packtpub

import com.packtpub.runner.AppRunnerOne
import com.packtpub.service.HelloService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

/**
 * @author Vamsi Vegi
 * @date 7/4/2018
 */

@SpringBootApplication
@ComponentScan(basePackages = ["com.packtpub.config", "com.packtpub.runner", "com.packtpub.service"])
class FullStackAppDev

fun main(args: Array<String>){
    runApplication<FullStackAppDev>(*args)
}

