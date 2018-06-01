package com.dario.car.server.domain.mybatis.domain;

import javax.persistence.*;

@Table(name = "oders_goods")
public class OdersGoods {
    /**
     * 个数编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单id（外键，与商品形成多对多关系）
     */
    @Column(name = "oders_id")
    private Integer odersId;

    /**
     * 商品编号（外键，与订单形成多对多的关系）
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 获取个数编号
     *
     * @return id - 个数编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置个数编号
     *
     * @param id 个数编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单id（外键，与商品形成多对多关系）
     *
     * @return oders_id - 订单id（外键，与商品形成多对多关系）
     */
    public Integer getOdersId() {
        return odersId;
    }

    /**
     * 设置订单id（外键，与商品形成多对多关系）
     *
     * @param odersId 订单id（外键，与商品形成多对多关系）
     */
    public void setOdersId(Integer odersId) {
        this.odersId = odersId;
    }

    /**
     * 获取商品编号（外键，与订单形成多对多的关系）
     *
     * @return goods_id - 商品编号（外键，与订单形成多对多的关系）
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品编号（外键，与订单形成多对多的关系）
     *
     * @param goodsId 商品编号（外键，与订单形成多对多的关系）
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}