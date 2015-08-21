package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_goods_category")
@Inheritance(strategy = InheritanceType.JOINED)

public class GoodsCategory {

	@Id
	@Column(name = "goods_cat_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	
	private String goods_cat_id;
	public String getGoods_cat_id() {
		return goods_cat_id;
	}
	public void setGoods_cat_id(String goods_cat_id) {
		this.goods_cat_id = goods_cat_id;
	}

	@Column(name = "goods_cat_name", length = 30)
	private String goods_cat_name;
	@Column(name = "goods_cat_link", length = 100)
	private String goods_cat_link;
	@Column(name = "goods_cat_father_id", length = 32)
	private String goods_cat_father_id;
	@Column(name = "goods_cat_layer", length = 32)
	private String goods_cat_layer;
	
	
	public String getGoods_cat_name() {
		return goods_cat_name;
	}
	public void setGoods_cat_name(String goods_cat_name) {
		this.goods_cat_name = goods_cat_name;
	}
	
	
	public String getGoods_cat_link() {
		return goods_cat_link;
	}
	public void setGoods_cat_link(String goods_cat_link) {
		this.goods_cat_link = goods_cat_link;
	}
	
	
	public String getGoods_cat_father_id() {
		return goods_cat_father_id;
	}
	public void setGoods_cat_father_id(String goods_cat_father_id) {
		this.goods_cat_father_id = goods_cat_father_id;
	}
	
	public String getGoods_cat_layer() {
		return goods_cat_layer;
	}
	public void setGoods_cat_layer(String goods_cat_layer) {
		this.goods_cat_layer = goods_cat_layer;
	}
	
}
