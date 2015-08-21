package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @Title: PMPromotionGoods.java
 * @Package com.ivhhs.demo.hb
 * @Description: TODO
 * @author 王立立
 * @date 2015年8月20日
 * @version V1.0
 */
@Entity
@Table(name = "bt_promotion_goods")
public class PMPromotionGoods {
	private String uuid;

	@Id
	@Column(name = "uuid", unique = true, nullable = false, length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	
	private PromotionManager promotionId;

	
	private Goods goodsId;

	@OneToOne
	@JoinColumn(name = "promotion_id", foreignKey = @ForeignKey(name = "fk_promotion_id"))
	public PromotionManager getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(PromotionManager promotionId) {
		this.promotionId = promotionId;
	}

	@OneToOne
	@JoinColumn(name = "goods_id", foreignKey = @ForeignKey(name = "fk_goods_id"))
	public Goods getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Goods goodsId) {
		this.goodsId = goodsId;
	}

}
