package com.packtpub.service

import org.springframework.stereotype.Service

/**
 * @author Vamsi Vegi
 * @date 7/4/2018
 */

// No Annotation using Kotlin DSL for Spring def : @Service
class NoAnnoHelloService {
    fun sayHello(): String {
        return "Hello World - using Kotlin Bean DSL - No Annotation"
    }
}