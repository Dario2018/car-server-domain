package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "orders_employees")
public class OrdersEmployees {
    @Id
    private Integer employeesid;

    /**
     * 第三张表
     */
    @Id
    private Integer ordersid;

    /**
     * @return employeesid
     */
    public Integer getEmployeesid() {
        return employeesid;
    }

    /**
     * @param employeesid
     */
    public void setEmployeesid(Integer employeesid) {
        this.employeesid = employeesid;
    }

    /**
     * 获取第三张表
     *
     * @return ordersid - 第三张表
     */
    public Integer getOrdersid() {
        return ordersid;
    }

    /**
     * 设置第三张表
     *
     * @param ordersid 第三张表
     */
    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }
}