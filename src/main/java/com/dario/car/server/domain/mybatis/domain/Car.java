package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.Id;
import java.util.Date;

public class Car {
    /**
     * 车牌号
     */
    @Id
    private String platenumber;

    @Id
    private Integer cid;

    /**
     * 车型品牌
     */
    private String brand;

    /**
     * 车型号
     */
    private String version;

    /**
     * 行驶证
     */
    private String vlicense;

    /**
     * 行驶旅程
     */
    private Float ctravel;

    /**
     * 指导价
     */
    private Double guiprice;

    /**
     * 系列
     */
    private String series;

    /**
     * 发动机型号
     */
    private String engineno;

    /**
     * 车架号
     */
    private String classisno;

    /**
     * 购买年份
     */
    private Date purchasedate;

    /**
     * 保险到期日
     */
    private Date insurancedate;

    /**
     * 汽车所属会员（一对多）
     */
    private Integer acid;

    /**
     * 获取车牌号
     *
     * @return platenumber - 车牌号
     */
    public String getPlatenumber() {
        return platenumber;
    }

    /**
     * 设置车牌号
     *
     * @param platenumber 车牌号
     */
    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取车型品牌
     *
     * @return brand - 车型品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置车型品牌
     *
     * @param brand 车型品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取车型号
     *
     * @return version - 车型号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置车型号
     *
     * @param version 车型号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取行驶证
     *
     * @return vlicense - 行驶证
     */
    public String getVlicense() {
        return vlicense;
    }

    /**
     * 设置行驶证
     *
     * @param vlicense 行驶证
     */
    public void setVlicense(String vlicense) {
        this.vlicense = vlicense;
    }

    /**
     * 获取行驶旅程
     *
     * @return ctravel - 行驶旅程
     */
    public Float getCtravel() {
        return ctravel;
    }

    /**
     * 设置行驶旅程
     *
     * @param ctravel 行驶旅程
     */
    public void setCtravel(Float ctravel) {
        this.ctravel = ctravel;
    }

    /**
     * 获取指导价
     *
     * @return guiprice - 指导价
     */
    public Double getGuiprice() {
        return guiprice;
    }

    /**
     * 设置指导价
     *
     * @param guiprice 指导价
     */
    public void setGuiprice(Double guiprice) {
        this.guiprice = guiprice;
    }

    /**
     * 获取系列
     *
     * @return series - 系列
     */
    public String getSeries() {
        return series;
    }

    /**
     * 设置系列
     *
     * @param series 系列
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * 获取发动机型号
     *
     * @return engineno - 发动机型号
     */
    public String getEngineno() {
        return engineno;
    }

    /**
     * 设置发动机型号
     *
     * @param engineno 发动机型号
     */
    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }

    /**
     * 获取车架号
     *
     * @return classisno - 车架号
     */
    public String getClassisno() {
        return classisno;
    }

    /**
     * 设置车架号
     *
     * @param classisno 车架号
     */
    public void setClassisno(String classisno) {
        this.classisno = classisno;
    }

    /**
     * 获取购买年份
     *
     * @return purchasedate - 购买年份
     */
    public Date getPurchasedate() {
        return purchasedate;
    }

    /**
     * 设置购买年份
     *
     * @param purchasedate 购买年份
     */
    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    /**
     * 获取保险到期日
     *
     * @return insurancedate - 保险到期日
     */
    public Date getInsurancedate() {
        return insurancedate;
    }

    /**
     * 设置保险到期日
     *
     * @param insurancedate 保险到期日
     */
    public void setInsurancedate(Date insurancedate) {
        this.insurancedate = insurancedate;
    }

    /**
     * 获取汽车所属会员（一对多）
     *
     * @return acid - 汽车所属会员（一对多）
     */
    public Integer getAcid() {
        return acid;
    }

    /**
     * 设置汽车所属会员（一对多）
     *
     * @param acid 汽车所属会员（一对多）
     */
    public void setAcid(Integer acid) {
        this.acid = acid;
    }
}