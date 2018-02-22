package com.ivaneye.intellijweb2.controller

import com.ivaneye.intellijweb2.model.Orders
import com.ivaneye.intellijweb2.param.OrdersParam
import com.ivaneye.intellijweb2.service.OrdersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

/**
 * Created by wangyifan on 18-2-19.
 */
@RestController
@RequestMapping
class OrdersController {

    @Autowired
    private lateinit var ordersService: OrdersService

    @RequestMapping(value = "/orders/{recId}", method = [(RequestMethod.GET)])
    operator fun get(@PathVariable("recId") recId: Long): ResponseEntity<*> {
        return try {
            val orders = ordersService.find(recId)
            ResponseEntity.ok(orders)
        } catch (e: Exception) {
            ResponseEntity.status(500).body<String>(e.message)
        }
    }

    @RequestMapping(value = "/orders", method = [(RequestMethod.POST)])
    fun create(@RequestBody @Validated param: OrdersParam, bindingResult: BindingResult): ResponseEntity<*> {
        return try {
            //验证失败
            if (bindingResult.hasErrors()) {
                throw RuntimeException(bindingResult.fieldError.defaultMessage)
            }
            val recId = ordersService.create(param)
            ResponseEntity.ok(recId)
        } catch (e: Exception) {
            ResponseEntity.status(500).body<String>(e.message)
        }
    }

}