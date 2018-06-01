package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "solr_goods")
public class SolrGoods {
    /**
     * 商品主键（商品编号）
     */
    @Id
    @Column(name = "goods_id")
    private String goodsId;

    /**
     * 商品名称
     */
    private String proname;

    /**
     * 售价
     */
    private Long pricein;

    /**
     * 销售提成
     */
    private Long sale;

    /**
     * 库存
     */
    private Integer digits;

    /**
     * 1-上架、0-下架
     */
    private Integer state;

    /**
     * 所属分类
     */
    private String classfiy;

    /**
     * 商品描述
     */
    private String detail;

    /**
     * 商品添加时间
     */
    private Date gdate;

    /**
     * 获取商品主键（商品编号）
     *
     * @return goods_id - 商品主键（商品编号）
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品主键（商品编号）
     *
     * @param goodsId 商品主键（商品编号）
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品名称
     *
     * @return proname - 商品名称
     */
    public String getProname() {
        return proname;
    }

    /**
     * 设置商品名称
     *
     * @param proname 商品名称
     */
    public void setProname(String proname) {
        this.proname = proname;
    }

    /**
     * 获取售价
     *
     * @return pricein - 售价
     */
    public Long getPricein() {
        return pricein;
    }

    /**
     * 设置售价
     *
     * @param pricein 售价
     */
    public void setPricein(Long pricein) {
        this.pricein = pricein;
    }

    /**
     * 获取销售提成
     *
     * @return sale - 销售提成
     */
    public Long getSale() {
        return sale;
    }

    /**
     * 设置销售提成
     *
     * @param sale 销售提成
     */
    public void setSale(Long sale) {
        this.sale = sale;
    }

    /**
     * 获取库存
     *
     * @return digits - 库存
     */
    public Integer getDigits() {
        return digits;
    }

    /**
     * 设置库存
     *
     * @param digits 库存
     */
    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    /**
     * 获取1-上架、0-下架
     *
     * @return state - 1-上架、0-下架
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置1-上架、0-下架
     *
     * @param state 1-上架、0-下架
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取所属分类
     *
     * @return classfiy - 所属分类
     */
    public String getClassfiy() {
        return classfiy;
    }

    /**
     * 设置所属分类
     *
     * @param classfiy 所属分类
     */
    public void setClassfiy(String classfiy) {
        this.classfiy = classfiy;
    }

    /**
     * 获取商品描述
     *
     * @return detail - 商品描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品描述
     *
     * @param detail 商品描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取商品添加时间
     *
     * @return gdate - 商品添加时间
     */
    public Date getGdate() {
        return gdate;
    }

    /**
     * 设置商品添加时间
     *
     * @param gdate 商品添加时间
     */
    public void setGdate(Date gdate) {
        this.gdate = gdate;
    }
}