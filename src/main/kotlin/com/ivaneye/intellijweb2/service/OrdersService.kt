package com.ivaneye.intellijweb2.service

import com.ivaneye.intellijweb2.controller.TestController
import com.ivaneye.intellijweb2.mapper.OrdersMapper
import com.ivaneye.intellijweb2.model.Orders
import com.ivaneye.intellijweb2.param.OrdersParam
import com.ivaneye.intellijweb2.respository.OrdersRespository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.annotation.Resource

/**
 * Created by wangyifan on 18-2-19.
 */
@Service
@Transactional
open class OrdersService {

    @Autowired
    open lateinit var ordersRespository: OrdersRespository

    fun find(recId: Long): Orders {
        return ordersRespository!!.selectByPrimaryKey(recId)
    }

    fun create(param: OrdersParam): Long? {
        ordersRespository!!.insertAndGet(param)
        return param.recId
    }

}