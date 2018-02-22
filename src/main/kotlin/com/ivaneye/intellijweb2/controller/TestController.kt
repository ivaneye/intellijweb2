package com.ivaneye.intellijweb2.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wangyifan on 18-2-18.
 */

@RestController
class TestController {

    @RequestMapping("/")
    fun home(): String {
        return "Hello Worsd!"
    }
}