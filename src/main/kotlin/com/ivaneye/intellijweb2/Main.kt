package com.ivaneye.intellijweb2

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * Created by wangyifan on 18-2-19.
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.ivaneye.intellijweb2.mapper", "com.ivaneye.intellijweb2.respository")
@ComponentScan("com.ivaneye.intellijweb2")
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}