package com.ivhhs.demo.hb;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_goods_specifications")
@Inheritance(strategy = InheritanceType.JOINED)

public class GoodsSpecifications {

	@Id
	@Column(name = "goods_specifications_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	
	private String goods_specifications_id;
	public String getGoods_specifications_id() {
		return goods_specifications_id;
	}
	public void setGoods_specifications_id(String goods_specifications_id) {
		this.goods_specifications_id = goods_specifications_id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goods_id")
	private Goods goods;
	@Column(name = "goods_specifications_name", length = 30)
	private String goods_specifications_name;
	@Column(name = "goods_specifications_sn", length = 10)
	private String goods_specifications_sn;
	@Column(name = "goods_specifications_price", precision = 10)
	private BigDecimal goods_specifications_price;
	@Column(name = "goods_specifications_stock", precision = 10)
	private BigDecimal goods_specifications_stock;
	
	
	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public String getGoods_specifications_name() {
		return goods_specifications_name;
	}
	public void setGoods_specifications_name(String goods_specifications_name) {
		this.goods_specifications_name = goods_specifications_name;
	}
	
	
	public String getGoods_specifications_sn() {
		return goods_specifications_sn;
	}
	public void setGoods_cat_father_id(String goods_specifications_sn) {
		this.goods_specifications_sn = goods_specifications_sn;
	}
	
	public BigDecimal getGoods_specifications_price() {
		return goods_specifications_price;
	}
	public void setGoods_specifications_price(BigDecimal goods_specifications_price) {
		this.goods_specifications_price = goods_specifications_price;
	}
	
	public BigDecimal getGoods_specifications_stock() {
		return goods_specifications_stock;
	}
	public void setGoods_specifications_stock(BigDecimal goods_specifications_stock) {
		this.goods_specifications_stock = goods_specifications_stock;
	}
}
