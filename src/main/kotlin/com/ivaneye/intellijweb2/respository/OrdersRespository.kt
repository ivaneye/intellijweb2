package com.ivaneye.intellijweb2.respository

import com.ivaneye.intellijweb2.mapper.OrdersMapper
import com.ivaneye.intellijweb2.param.OrdersParam

/**
 * Created by wangyifan on 18-2-19.
 */
interface OrdersRespository : OrdersMapper {
    fun insertAndGet(param: OrdersParam)
}