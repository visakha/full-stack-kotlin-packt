package com.packtpub.service

import org.springframework.stereotype.Service

/**
 * @author Vamsi Vegi
 * @date 7/4/2018
 */

@Service
class HelloService {
    fun sayHello(): String {
        return "Hello World - using Annotation @Service"
    }
}