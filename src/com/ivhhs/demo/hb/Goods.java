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
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_goods")
@Inheritance(strategy = InheritanceType.JOINED)

public class Goods {

	@Id
	@Column(name = "goods_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")	
	private String goods_id;
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	@Column(name = "goods_sn", length = 10)
	private String goods_sn;
	@Column(name = "goods_ISBN", length = 13)
	private String goods_ISBN;
	@Column(name = "goods_QRcode", length = 30)
	private String goods_QRcode;
	
	//@OneToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "goods_cat_id")
	//private GoodsCategory goodsCategory;
	
	@Column(name = "goods_cat_id", length = 10)
	private String goods_cat_id;
	@Column(name = "goods_title", length = 100)
	private String goods_title;
	@Column(name = "goods_price", precision = 10)
	private BigDecimal goods_price;
	@Column(name = "goods_mprice", precision = 10)
	private BigDecimal goods_mprice;
	@Column(name = "goods_weight", precision = 10)
	private BigDecimal goods_weight;
	@Column(name = "goods_stock", precision = 10)
	private BigDecimal goods_stock;
	@Column(name = "goods_virtual_csale", precision = 10)
	private BigDecimal goods_virtual_csale;
	@Column(name = "goods_real_csale", precision = 10)
	private BigDecimal goods_real_csale;
	@Column(name = "goods_img", length = 100)
	private String goods_img;
	@Column(name = "goods_introduce", length = 500)
	private String goods_introduce;
	@Column(name = "goods_Inventory_count", length = 8)
	private Integer goods_Inventory_count;
	@Column(name = "goods_isOnSale", length = 8)
	private String goods_isOnSale;
	@Column(name = "goods_OffSaleOnTime", length = 10)
	private String goods_OffSaleOnTime;
	@Column(name = "googs_OffSaleTime", length = 20)
	private String googs_OffSaleTime;
	@Column(name = "goods_OnSaleOnTime", length = 8)
	private String goods_OnSaleOnTime;
	@Column(name = "googs_OnSaleTime", length = 20)
	private String googs_OnSaleTime;
	@Column(name = "goods_isRecommended", length = 8)
	private String goods_isRecommended;
	@Column(name = "goods_limit_buy_number", length = 10)
	private String goods_limit_buy_number;
	@Column(name = "goods_sequence", length = 10)
	private BigDecimal goods_sequence;
	@Column(name = "goods_first_distribution_commission", precision = 10)
	private BigDecimal goods_first_distribution_commission;
	@Column(name = "goods_sales_commission", precision = 10)
	private BigDecimal goods_sales_commission;
	@Column(name = "goods_second_distribution_commission", precision = 10)
	private BigDecimal goods_second_distribution_commission;
	
	public String getGoods_sn() {
		return goods_sn;
	}
	public void setGoods_sn(String goods_sn) {
		this.goods_sn = goods_sn;
	}
	
	
	public String getGoods_ISBN() {
		return goods_ISBN;
	}
	public void setGoods_ISBN(String goods_ISBN) {
		this.goods_ISBN = goods_ISBN;
	}
	
	
	public String getGoods_QRcode() {
		return goods_QRcode;
	}
	public void setGoods_QRcode(String goods_QRcode) {
		this.goods_QRcode = goods_QRcode;
	}

//	public GoodsCategory getGoodsCategory() {
//		return goodsCategory;
//	}
//	public void setGoodsCategory(GoodsCategory goodsCategory) {
//		this.goodsCategory = goodsCategory;
//	}
	
	public String getGoods_title() {
		return goods_title;
	}
	public void setGoods_title(String goods_title) {
		this.goods_title = goods_title;
	}
	
	public BigDecimal getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(BigDecimal goods_price) {
		this.goods_price = goods_price;
	}
	
	public BigDecimal getGoods_mprice() {
		return goods_mprice;
	}
	public void setGoods_mprice(BigDecimal goods_mprice) {
		this.goods_mprice = goods_mprice;
	}
	
	public BigDecimal getGoods_weight() {
		return goods_weight;
	}
	public void setGoods_weight(BigDecimal goods_weight) {
		this.goods_weight = goods_weight;
	}
	
	public BigDecimal getGoods_stock() {
		return goods_stock;
	}
	public void setGoods_stock(BigDecimal goods_stock) {
		this.goods_stock = goods_stock;
	}
	
	public BigDecimal getGoods_virtual_csale() {
		return goods_virtual_csale;
	}
	public void setGoods_virtual_csale(BigDecimal goods_virtual_csale) {
		this.goods_virtual_csale = goods_virtual_csale;
	}
	
	public BigDecimal getGoods_real_csale() {
		return goods_real_csale;
	}
	public void setGoods_real_csale(BigDecimal goods_real_csale) {
		this.goods_real_csale = goods_real_csale;
	}
	
	public String getGoods_img() {
		return goods_img;
	}
	public void setGoods_img(String goods_img) {
		this.goods_img = goods_img;
	}
	
	public String getGoods_introduce() {
		return goods_introduce;
	}
	public void setGoods_introduce(String goods_introduce) {
		this.goods_introduce = goods_introduce;
	}
	
	public Integer getGoods_Inventory_count() {
		return goods_Inventory_count;
	}
	public void setGoods_sn(Integer goods_Inventory_count) {
		this.goods_Inventory_count = goods_Inventory_count;
	}
	
	public String getGoods_isOnSale() {
		return goods_isOnSale;
	}
	public void setGoods_isOnSale(String goods_isOnSale) {
		this.goods_isOnSale = goods_isOnSale;
	}
	
	public String getGoods_OffSaleOnTime() {
		return goods_OffSaleOnTime;
	}
	public void setGoods_OffSaleOnTime(String goods_OffSaleOnTime) {
		this.goods_OffSaleOnTime = goods_OffSaleOnTime;
	}
	
	public String getGoogs_OffSaleTime() {
		return googs_OffSaleTime;
	}
	public void setGoogs_OffSaleTime(String googs_OffSaleTime) {
		this.googs_OffSaleTime = googs_OffSaleTime;
	}
	
	public String getGoods_OnSaleOnTime() {
		return goods_OnSaleOnTime;
	}
	public void setGoods_OnSaleOnTime(String goods_OnSaleOnTime) {
		this.goods_OnSaleOnTime = goods_OnSaleOnTime;
	}
	
	public String getGoogs_OnSaleTime() {
		return googs_OnSaleTime;
	}
	public void setGoogs_OnSaleTime(String googs_OnSaleTime) {
		this.googs_OnSaleTime = googs_OnSaleTime;
	}
	
	public String getGoods_isRecommended() {
		return goods_isRecommended;
	}
	public void setGoods_isRecommended(String goods_isRecommended) {
		this.goods_isRecommended = goods_isRecommended;
	}
	
	public String getGoods_limit_buy_number() {
		return goods_limit_buy_number;
	}
	public void setGoods_limit_buy_number(String goods_limit_buy_number) {
		this.goods_limit_buy_number = goods_limit_buy_number;
	}
	
	public BigDecimal getGoods_sequence() {
		return goods_sequence;
	}
	public void setGoods_sequence(BigDecimal goods_sequence) {
		this.goods_sequence = goods_sequence;
	}
	
	public BigDecimal getGoods_first_distribution_commission() {
		return goods_first_distribution_commission;
	}
	public void setGoods_first_distribution_commission(BigDecimal goods_first_distribution_commission) {
		this.goods_first_distribution_commission = goods_first_distribution_commission;
	}
	
	public BigDecimal getGoods_sales_commission() {
		return goods_sales_commission;
	}
	public void setGoods_sales_commission(BigDecimal goods_sales_commission) {
		this.goods_sales_commission = goods_sales_commission;
	}
	
	public BigDecimal getGoods_second_distribution_commission() {
		return goods_second_distribution_commission;
	}
	public void setGoods_second_distribution_commission(BigDecimal goods_second_distribution_commission) {
		this.goods_second_distribution_commission = goods_second_distribution_commission;
	}
}
