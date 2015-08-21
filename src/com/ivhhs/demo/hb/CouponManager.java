package com.ivhhs.demo.hb;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: CouponManager.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO 优惠券管理
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */

@Entity
@Table(name = "bt_coupon_mgr")
public class CouponManager {


	@Id
	@Column(name = "coupon_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String uuid;
	
	@Column(name = "coupon_name", length = 64)
	private String couponName;
	
	@Column(name = "reduction_amount ", length = 20)
	private BigDecimal reductionaAmount;
	
	@Column(name = "deduction_ratio", length = 3)
	private BigDecimal deductionRatio;
	
	@Column(name = "effect_condition", length = 32)
	private String effectCondition;
	
	@Column(name = "usevalidity_range", length = 1)
	private String usevalidityRange;
	
	@Column(name = "usevalidity_start", length = 20)
	private String usevalidityStart;
	
	@Column(name = "usevalidity_end", length = 20)
	private String usevalidityEnd;
	
	@Column(name = "after_receivingday", length = 3)
	private String afterReceivingday;
	
	@Column(name = "effective_days", length = 3)
	private String effectiveDays;
	
	@Column(name = "coupon_color", length = 32)
	private String couponColor;
	
	@Column(name = "coupon_content", length = 256)
	private String couponContent;
	
	@Column(name = "page_receive_limited", length = 1)
	private String pageReceiveLimited;
	
	@Column(name = "person_receive_limited", length = 3)
	private String personReceiveLimited;
	
	@Column(name = "expiration_reminder", length = 1)
	private String expirationReminder;
	
	@Column(name = "create_card_coupon", length = 1)
	private String createCardCoupon;
	
	@Column(name = "use_discount_code", length = 1)
	private String useDiscountCode;
	
	@Column(name = "coupon_count", length = 16)
	private String couponCount;
	
	@Column(name = "coupon_state", length = 1)
	private String couponState;
	
	@Column(name = "receiving_state", length = 1)
	private String receivingState;
	
	@Column(name = "update_time", length = 20)
	private String updateTime;
	
	@Column(name = "update_userid", length = 32)
	private String updateUserid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}


	public BigDecimal getReductionaAmount() {
		return reductionaAmount;
	}

	public void setReductionaAmount(BigDecimal reductionaAmount) {
		this.reductionaAmount = reductionaAmount;
	}

	public BigDecimal getDeductionRatio() {
		return deductionRatio;
	}

	public void setDeductionRatio(BigDecimal deductionRatio) {
		this.deductionRatio = deductionRatio;
	}

	public String getEffectCondition() {
		return effectCondition;
	}

	public void setEffectCondition(String effectCondition) {
		this.effectCondition = effectCondition;
	}

	public String getUsevalidityRange() {
		return usevalidityRange;
	}

	public void setUsevalidityRange(String usevalidityRange) {
		this.usevalidityRange = usevalidityRange;
	}

	public String getUsevalidityStart() {
		return usevalidityStart;
	}

	public void setUsevalidityStart(String usevalidityStart) {
		this.usevalidityStart = usevalidityStart;
	}

	public String getUsevalidityEnd() {
		return usevalidityEnd;
	}

	public void setUsevalidityEnd(String usevalidityEnd) {
		this.usevalidityEnd = usevalidityEnd;
	}

	public String getAfterReceivingday() {
		return afterReceivingday;
	}

	public void setAfterReceivingday(String afterReceivingday) {
		this.afterReceivingday = afterReceivingday;
	}

	public String getEffectiveDays() {
		return effectiveDays;
	}

	public void setEffectiveDays(String effectiveDays) {
		this.effectiveDays = effectiveDays;
	}

	public String getCouponColor() {
		return couponColor;
	}

	public void setCouponColor(String couponColor) {
		this.couponColor = couponColor;
	}

	public String getCouponContent() {
		return couponContent;
	}

	public void setCouponContent(String couponContent) {
		this.couponContent = couponContent;
	}

	public String getPageReceiveLimited() {
		return pageReceiveLimited;
	}

	public void setPageReceiveLimited(String pageReceiveLimited) {
		this.pageReceiveLimited = pageReceiveLimited;
	}

	public String getPersonReceiveLimited() {
		return personReceiveLimited;
	}

	public void setPersonReceiveLimited(String personReceiveLimited) {
		this.personReceiveLimited = personReceiveLimited;
	}

	public String getExpirationReminder() {
		return expirationReminder;
	}

	public void setExpirationReminder(String expirationReminder) {
		this.expirationReminder = expirationReminder;
	}

	public String getCreateCardCoupon() {
		return createCardCoupon;
	}

	public void setCreateCardCoupon(String createCardCoupon) {
		this.createCardCoupon = createCardCoupon;
	}

	public String getUseDiscountCode() {
		return useDiscountCode;
	}

	public void setUseDiscountCode(String useDiscountCode) {
		this.useDiscountCode = useDiscountCode;
	}

	public String getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(String couponCount) {
		this.couponCount = couponCount;
	}

	public String getCouponState() {
		return couponState;
	}

	public void setCouponState(String couponState) {
		this.couponState = couponState;
	}

	public String getReceivingState() {
		return receivingState;
	}

	public void setReceivingState(String receivingState) {
		this.receivingState = receivingState;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUserid() {
		return updateUserid;
	}

	public void setUpdateUserid(String updateUserid) {
		this.updateUserid = updateUserid;
	}

	
	
}

