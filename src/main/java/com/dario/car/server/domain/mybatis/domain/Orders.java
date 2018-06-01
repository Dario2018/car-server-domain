package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.Id;
import java.util.Date;

public class Orders {
    /**
     * 订单编号
     */
    @Id
    private Integer oid;

    /**
     * 服务选择
     */
    private String service;

    /**
     * 车型新属性
     */
    private String property;

    /**
     * 支付方式
     */
    private String payment;

    /**
     * 消费金额
     */
    private Long consume;

    /**
     * 订单所属会员(外键:一对多)
     */
    private Integer associatorid;

    /**
     * 0已退单、1已支付
     */
    private Integer ostatus;

    /**
     * 开单日期
     */
    private Date orderdate;

    /**
     * 订单备注
     */
    private String remarks;

    /**
     * 获取订单编号
     *
     * @return oid - 订单编号
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 设置订单编号
     *
     * @param oid 订单编号
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 获取服务选择
     *
     * @return service - 服务选择
     */
    public String getService() {
        return service;
    }

    /**
     * 设置服务选择
     *
     * @param service 服务选择
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * 获取车型新属性
     *
     * @return property - 车型新属性
     */
    public String getProperty() {
        return property;
    }

    /**
     * 设置车型新属性
     *
     * @param property 车型新属性
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * 获取支付方式
     *
     * @return payment - 支付方式
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 设置支付方式
     *
     * @param payment 支付方式
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * 获取消费金额
     *
     * @return consume - 消费金额
     */
    public Long getConsume() {
        return consume;
    }

    /**
     * 设置消费金额
     *
     * @param consume 消费金额
     */
    public void setConsume(Long consume) {
        this.consume = consume;
    }

    /**
     * 获取订单所属会员(外键:一对多)
     *
     * @return associatorid - 订单所属会员(外键:一对多)
     */
    public Integer getAssociatorid() {
        return associatorid;
    }

    /**
     * 设置订单所属会员(外键:一对多)
     *
     * @param associatorid 订单所属会员(外键:一对多)
     */
    public void setAssociatorid(Integer associatorid) {
        this.associatorid = associatorid;
    }

    /**
     * 获取0已退单、1已支付
     *
     * @return ostatus - 0已退单、1已支付
     */
    public Integer getOstatus() {
        return ostatus;
    }

    /**
     * 设置0已退单、1已支付
     *
     * @param ostatus 0已退单、1已支付
     */
    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }

    /**
     * 获取开单日期
     *
     * @return orderdate - 开单日期
     */
    public Date getOrderdate() {
        return orderdate;
    }

    /**
     * 设置开单日期
     *
     * @param orderdate 开单日期
     */
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * 获取订单备注
     *
     * @return remarks - 订单备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置订单备注
     *
     * @param remarks 订单备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}