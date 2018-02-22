package com.ivaneye.intellijweb2.param

import com.ivaneye.intellijweb2.model.Orders
import javax.validation.constraints.NotNull

/**
 * Created by wangyifan on 18-2-19.
 */
class OrdersParam : Orders() {

    override var title: String?
        @NotNull(message = "title不能为空")
        get() = super.title
        set(value: String?) {
            super.title = value
        }
}