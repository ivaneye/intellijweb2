package com.ivaneye.intellijweb2.mapper

import com.ivaneye.intellijweb2.model.Orders
import org.apache.ibatis.annotations.Param

/**
 * Created by wangyifan on 18-2-19.
 */
interface OrdersMapper {
    fun selectByPrimaryKey(@Param("recId") recId: Long): Orders
}