package com.ivaneye.intellijweb2.service;

import com.ivaneye.intellijweb2.model.Orders;
import com.ivaneye.intellijweb2.respository.OrdersRespository;
import com.ivaneye.intellijweb2.param.OrdersParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyifan
 * @since 2018-02-12
 */
@Service
@Transactional
public class OrdersService {

    @Autowired
    private OrdersRespository ordersRespository;

    public Orders find(Long recId){
        return ordersRespository.selectByPrimaryKey(recId);
    }

    public Long create(OrdersParam param) {
        ordersRespository.insertAndGet(param);
        return param.getRecId();
    }

}
