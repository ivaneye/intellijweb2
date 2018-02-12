package com.ivaneye.intellijweb2.mapper;

import com.ivaneye.intellijweb2.model.Orders;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyifan
 * @since 2018-02-12
 */
public interface OrdersMapper {
    Orders selectByPrimaryKey(Long recId);
}
