package com.ivhhs.demo.hb;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bt_trade_order")
public class TradeOrder implements java.io.Serializable {

	private String orderId;
	private String openId;
	private String nickName;
	private String createTime;
	private String payId;
	private String payMode;
	private String payTime;
	private String deliveryMode;
	private BigDecimal orderAmount;
	private String deliveryType;
	private String deliveryCorp;
	private String deliveryNum;
	private String deliveryTime;
	private String orderReceiver;
	private String orderOrdermobile;
	private String zipcode;
	private String nation;
	private String province;
	private String city;
	private String district;
	private String street;
	private String orderMark;
	private String orderFrom;
	private BigDecimal deliveryAmount;
	private BigDecimal useWCredit;
	private BigDecimal useWBalance;
	private Integer useCredit;
	private BigDecimal useCreditBalance;
	private BigDecimal useBalance;
	private String amountDesc;
	private String mark;
	private String distributorId;
	private String shopName;
	private String operator;
	private String operateTime;
	private String status;

	@Id
	@Column(name = "order_id", unique = true, nullable = false, length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Column(name = "open_id", nullable = false, length = 32)
	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@Column(name = "nick_name", nullable = false, length = 64)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "create_time", nullable = false, length = 20)
	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name = "pay_id", length = 32)
	public String getPayId() {
		return this.payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	@Column(name = "pay_mode", length = 32)
	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	@Column(name = "pay_time", length = 20)
	public String getPayTime() {
		return this.payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	@Column(name = "delivery_mode", length = 64)
	public String getDeliveryMode() {
		return this.deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	@Column(name = "order_amount", precision = 10)
	public BigDecimal getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Column(name = "delivery_type", length = 64)
	public String getDeliveryType() {
		return this.deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	@Column(name = "delivery_corp", length = 64)
	public String getDeliveryCorp() {
		return this.deliveryCorp;
	}

	public void setDeliveryCorp(String deliveryCorp) {
		this.deliveryCorp = deliveryCorp;
	}

	@Column(name = "delivery_num", length = 64)
	public String getDeliveryNum() {
		return this.deliveryNum;
	}

	public void setDeliveryNum(String deliveryNum) {
		this.deliveryNum = deliveryNum;
	}

	@Column(name = "delivery_time", length = 20)
	public String getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Column(name = "order_receiver", nullable = false, length = 32)
	public String getOrderReceiver() {
		return this.orderReceiver;
	}

	public void setOrderReceiver(String orderReceiver) {
		this.orderReceiver = orderReceiver;
	}

	@Column(name = "order_ordermobile", nullable = false, length = 20)
	public String getOrderOrdermobile() {
		return this.orderOrdermobile;
	}

	public void setOrderOrdermobile(String orderOrdermobile) {
		this.orderOrdermobile = orderOrdermobile;
	}

	@Column(name = "c_zipcode", nullable = false, length = 8)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "c_nation", nullable = false, length = 32)
	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Column(name = "c_province", nullable = false, length = 32)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "c_city", nullable = false, length = 32)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "c_district", nullable = false, length = 32)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "c_street", nullable = false, length = 256)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "order_mark", length = 512)
	public String getOrderMark() {
		return this.orderMark;
	}

	public void setOrderMark(String orderMark) {
		this.orderMark = orderMark;
	}

	@Column(name = "order_from", length = 256)
	public String getOrderFrom() {
		return this.orderFrom;
	}

	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	@Column(name = "delivery_amount", precision = 10)
	public BigDecimal getDeliveryAmount() {
		return this.deliveryAmount;
	}

	public void setDeliveryAmount(BigDecimal deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}

	@Column(name = "use_w_credit", precision = 10)
	public BigDecimal getUseWCredit() {
		return this.useWCredit;
	}

	public void setUseWCredit(BigDecimal useWCredit) {
		this.useWCredit = useWCredit;
	}

	@Column(name = "use_w_balance", precision = 10)
	public BigDecimal getUseWBalance() {
		return this.useWBalance;
	}

	public void setUseWBalance(BigDecimal useWBalance) {
		this.useWBalance = useWBalance;
	}

	@Column(name = "use_credit")
	public Integer getUseCredit() {
		return this.useCredit;
	}

	public void setUseCredit(Integer useCredit) {
		this.useCredit = useCredit;
	}

	@Column(name = "use_credit_balance", precision = 10)
	public BigDecimal getUseCreditBalance() {
		return this.useCreditBalance;
	}

	public void setUseCreditBalance(BigDecimal useCreditBalance) {
		this.useCreditBalance = useCreditBalance;
	}

	@Column(name = "use_balance", precision = 10)
	public BigDecimal getUseBalance() {
		return this.useBalance;
	}

	public void setUseBalance(BigDecimal useBalance) {
		this.useBalance = useBalance;
	}

	@Column(name = "amount_desc", length = 256)
	public String getAmountDesc() {
		return this.amountDesc;
	}

	public void setAmountDesc(String amountDesc) {
		this.amountDesc = amountDesc;
	}

	@Column(name = "c_mark", length = 512)
	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Column(name = "distributor_id", length = 32)
	public String getDistributorId() {
		return this.distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	@Column(name = "shop_name", length = 128)
	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
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

	@Column(name = "c_status", nullable = false, length = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
