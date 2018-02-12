package com.ivaneye.intellijweb2.param;

import com.ivaneye.intellijweb2.model.Orders;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * OrdersParam
 * </p>
 *
 * @author wangyifan
 * @since 2018-02-12
 */
public class OrdersParam extends Orders {

    @Override
    @NotNull(message = "title不能为空")
    public String getTitle() {
        return super.getTitle();
    }
}
