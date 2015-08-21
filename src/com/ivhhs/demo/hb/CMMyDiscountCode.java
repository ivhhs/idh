package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: MyDiscountCode.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name="bt_my_coupon")
public class CMMyDiscountCode {
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
	
	private CouponManager couponId;
	
	
	private CMDiscountcodeManager discountcodeId;
	
	
	private MemberMaster deliveryManid;
	
	
	@OneToOne
	@JoinColumn(name = "order_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_order_id"))
	private  TradeOrder orderId;
	
	@Column(name = "discountcode_value", length = 64)
	private String discountcodeValue;
	
	@Column(name = "discount_description", length = 256)
	private String discountDescription;
	
	@Column(name = "order_state", length = 1)
	private String orderState;
	
	@Column(name = "use_time ", length = 20)
	private String useTime;
	
	@Column(name = "receive_time ", length = 20)
	private String receiveTime;
	
	@Column(name = "receive_way ", length = 32)
	private String receiveWay;

	@OneToOne
	@JoinColumn(name = "coupon_id", foreignKey = @ForeignKey(name = "fk_coupon_id"))
	public CouponManager getCouponId() {
		return couponId;
	}

	public void setCouponId(CouponManager couponId) {
		this.couponId = couponId;
	}
	@OneToOne
	@JoinColumn(name = "discountcode_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_discountcode_id"))
	public CMDiscountcodeManager getDiscountcodeId() {
		return discountcodeId;
	}

	public void setDiscountcodeId(CMDiscountcodeManager discountcodeId) {
		this.discountcodeId = discountcodeId;
	}

	@OneToOne
	@JoinColumn(name = "member_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_member_id"))
	public MemberMaster getDeliveryManid() {
		return deliveryManid;
	}

	public void setDeliveryManid(MemberMaster deliveryManid) {
		this.deliveryManid = deliveryManid;
	}

	public TradeOrder getOrderId() {
		return orderId;
	}

	public void setOrderId(TradeOrder orderId) {
		this.orderId = orderId;
	}

	public String getDiscountcodeValue() {
		return discountcodeValue;
	}

	public void setDiscountcodeValue(String discountcodeValue) {
		this.discountcodeValue = discountcodeValue;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getReceiveWay() {
		return receiveWay;
	}

	public void setReceiveWay(String receiveWay) {
		this.receiveWay = receiveWay;
	}
	
	

}

