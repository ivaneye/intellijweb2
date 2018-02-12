package com.ivaneye.intellijweb2.respository;

import com.ivaneye.intellijweb2.mapper.OrdersMapper;
import com.ivaneye.intellijweb2.param.OrdersParam;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyifan
 * @since 2018-02-12
 */
public interface OrdersRespository extends OrdersMapper {

    void insertAndGet(OrdersParam param);
}
