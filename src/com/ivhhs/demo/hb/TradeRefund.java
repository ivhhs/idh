package com.ivhhs.demo.hb;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bt_trade_refund")
public class TradeRefund implements java.io.Serializable {

	private String refundId;
	private String orderGoodsId;
	private String refundType;
	private String receiveGoods;
	private String refundGoods;
	private String refundWay;
	private BigDecimal refundAmount;
	private String createTime;
	private String refundDesc;
	private String operator;
	private String operateTime;
	private String status;

	@Id
	@Column(name = "refund_id", unique = true, nullable = false, length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	public String getRefundId() {
		return this.refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	@Column(name = "order_goods_id", length = 32)
	public String getOrderGoodsId() {
		return this.orderGoodsId;
	}

	public void setOrderGoodsId(String orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	@Column(name = "refund_type", length = 8)
	public String getRefundType() {
		return this.refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	@Column(name = "receive_goods", length = 8)
	public String getReceiveGoods() {
		return this.receiveGoods;
	}

	public void setReceiveGoods(String receiveGoods) {
		this.receiveGoods = receiveGoods;
	}

	@Column(name = "refund_goods", length = 8)
	public String getRefundGoods() {
		return this.refundGoods;
	}

	public void setRefundGoods(String refundGoods) {
		this.refundGoods = refundGoods;
	}

	@Column(name = "refund_way", length = 8)
	public String getRefundWay() {
		return this.refundWay;
	}

	public void setRefundWay(String refundWay) {
		this.refundWay = refundWay;
	}

	@Column(name = "refund_amount", precision = 10)
	public BigDecimal getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	@Column(name = "create_time", length = 20)
	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name = "refund_desc", length = 512)
	public String getRefundDesc() {
		return this.refundDesc;
	}

	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

	@Column(name = "c_operator", length = 32)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name = "c_operatetime", length = 20)
	public String getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	@Column(name = "c_status", length = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
