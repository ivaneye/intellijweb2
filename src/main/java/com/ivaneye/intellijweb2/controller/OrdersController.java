package com.ivaneye.intellijweb2.controller;

import com.ivaneye.intellijweb2.model.Orders;
import com.ivaneye.intellijweb2.param.OrdersParam;
import com.ivaneye.intellijweb2.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangyifan
 * @since 2018-02-12
 */
@RestController
@RequestMapping
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping(value = "/orders/{recId}",method = RequestMethod.GET)
    public ResponseEntity get(@PathVariable("recId") Long recId){
        try {
            Orders orders = ordersService.find(recId);
            return ResponseEntity.ok(orders);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody @Validated OrdersParam param, BindingResult bindingResult) {
        try {
            //验证失败
            if (bindingResult.hasErrors()) {
                throw new RuntimeException(bindingResult.getFieldError().getDefaultMessage());
            }
            Long recId = ordersService.create(param);
            return ResponseEntity.ok(recId);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

}