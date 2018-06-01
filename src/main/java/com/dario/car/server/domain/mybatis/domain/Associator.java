package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.Id;

public class Associator {
    /**
     * 会员编号
     */
    @Id
    private Integer aid;

    /**
     * 会员名字
     */
    private String aname;

    /**
     * 会员性别（1为男，0为女）
     */
    private Integer asex;

    /**
     * 会员联系方式
     */
    private String aphone;

    /**
     * 所属门店
     */
    private String store;

    /**
     * 注册来源（微信、QQ、微博、其他）
     */
    private String registr;

    /**
     * 备注
     */
    private String detail;

    /**
     * 获取会员编号
     *
     * @return aid - 会员编号
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置会员编号
     *
     * @param aid 会员编号
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取会员名字
     *
     * @return aname - 会员名字
     */
    public String getAname() {
        return aname;
    }

    /**
     * 设置会员名字
     *
     * @param aname 会员名字
     */
    public void setAname(String aname) {
        this.aname = aname;
    }

    /**
     * 获取会员性别（1为男，0为女）
     *
     * @return asex - 会员性别（1为男，0为女）
     */
    public Integer getAsex() {
        return asex;
    }

    /**
     * 设置会员性别（1为男，0为女）
     *
     * @param asex 会员性别（1为男，0为女）
     */
    public void setAsex(Integer asex) {
        this.asex = asex;
    }

    /**
     * 获取会员联系方式
     *
     * @return aphone - 会员联系方式
     */
    public String getAphone() {
        return aphone;
    }

    /**
     * 设置会员联系方式
     *
     * @param aphone 会员联系方式
     */
    public void setAphone(String aphone) {
        this.aphone = aphone;
    }

    /**
     * 获取所属门店
     *
     * @return store - 所属门店
     */
    public String getStore() {
        return store;
    }

    /**
     * 设置所属门店
     *
     * @param store 所属门店
     */
    public void setStore(String store) {
        this.store = store;
    }

    /**
     * 获取注册来源（微信、QQ、微博、其他）
     *
     * @return registr - 注册来源（微信、QQ、微博、其他）
     */
    public String getRegistr() {
        return registr;
    }

    /**
     * 设置注册来源（微信、QQ、微博、其他）
     *
     * @param registr 注册来源（微信、QQ、微博、其他）
     */
    public void setRegistr(String registr) {
        this.registr = registr;
    }

    /**
     * 获取备注
     *
     * @return detail - 备注
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置备注
     *
     * @param detail 备注
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}