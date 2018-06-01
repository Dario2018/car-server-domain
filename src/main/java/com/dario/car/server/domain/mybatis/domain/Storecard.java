package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.Id;
import java.util.Date;

public class Storecard {
    /**
     * 储存值卡编号
     */
    @Id
    private Integer sid;

    /**
     * 绑定车牌号(外键：一对一)
     */
    private String csid;

    /**
     * 卡片种类
     */
    private String species;

    /**
     * 卡片余额
     */
    private Double balance;

    /**
     * 卡片折扣
     */
    private Double discount;

    /**
     * 办理日期
     */
    private Date transactdate;

    /**
     * 过期日期
     */
    private Date overdue;

    /**
     * 绑定店铺
     */
    private String bindstore;

    /**
     * 获取储存值卡编号
     *
     * @return sid - 储存值卡编号
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置储存值卡编号
     *
     * @param sid 储存值卡编号
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取绑定车牌号(外键：一对一)
     *
     * @return csid - 绑定车牌号(外键：一对一)
     */
    public String getCsid() {
        return csid;
    }

    /**
     * 设置绑定车牌号(外键：一对一)
     *
     * @param csid 绑定车牌号(外键：一对一)
     */
    public void setCsid(String csid) {
        this.csid = csid;
    }

    /**
     * 获取卡片种类
     *
     * @return species - 卡片种类
     */
    public String getSpecies() {
        return species;
    }

    /**
     * 设置卡片种类
     *
     * @param species 卡片种类
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * 获取卡片余额
     *
     * @return balance - 卡片余额
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置卡片余额
     *
     * @param balance 卡片余额
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 获取卡片折扣
     *
     * @return discount - 卡片折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * 设置卡片折扣
     *
     * @param discount 卡片折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 获取办理日期
     *
     * @return transactdate - 办理日期
     */
    public Date getTransactdate() {
        return transactdate;
    }

    /**
     * 设置办理日期
     *
     * @param transactdate 办理日期
     */
    public void setTransactdate(Date transactdate) {
        this.transactdate = transactdate;
    }

    /**
     * 获取过期日期
     *
     * @return overdue - 过期日期
     */
    public Date getOverdue() {
        return overdue;
    }

    /**
     * 设置过期日期
     *
     * @param overdue 过期日期
     */
    public void setOverdue(Date overdue) {
        this.overdue = overdue;
    }

    /**
     * 获取绑定店铺
     *
     * @return bindstore - 绑定店铺
     */
    public String getBindstore() {
        return bindstore;
    }

    /**
     * 设置绑定店铺
     *
     * @param bindstore 绑定店铺
     */
    public void setBindstore(String bindstore) {
        this.bindstore = bindstore;
    }
}