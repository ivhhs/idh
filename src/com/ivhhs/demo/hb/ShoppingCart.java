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

@Entity(name = "bt_shopping_cart")
@Inheritance(strategy = InheritanceType.JOINED)

public class ShoppingCart {

	@Id
	@Column(name = "sp_car_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	
	private String sp_car_id;
	public String getSp_car_id() {
		return sp_car_id;
	}
	public void setSp_car_id(String sp_car_id) {
		this.sp_car_id = sp_car_id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goods_id")
	private Goods goods;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private MemberRegister member;
	@Column(name = "goods_specifications_id", length = 32)
	private String goods_specifications_id;
	@Column(name = "sp_quantity", precision = 10)
	private BigDecimal sp_quantity;
	@Column(name = "sum_money", precision = 10)
	private BigDecimal sum_money;
	
	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
	public MemberRegister getMember() {
		return this.member;
	}

	public void setGoods(MemberRegister member) {
		this.member = member;
	}
	
	public String getGgoods_specifications_id() {
		return goods_specifications_id;
	}
	public void setGoods_specifications_id(String goods_specifications_id) {
		this.goods_specifications_id = goods_specifications_id;
	}
	
	
	public BigDecimal getSp_quantity() {
		return sp_quantity;
	}
	public void setSp_quantity(BigDecimal sp_quantity) {
		this.sp_quantity = sp_quantity;
	}
	
	public BigDecimal getSum_money() {
		return sum_money;
	}
	public void setSum_money(BigDecimal sum_money) {
		this.sum_money = sum_money;
	}
}
