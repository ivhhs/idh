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
 * @Title: discountcodeManager.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO 优惠码管理
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name="bt_discountcode_mgr")
public class CMDiscountcodeManager {

	@Id
	@Column(name = "discountcode_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String uuid;
	
	@ManyToOne
	@JoinColumn(name = "coupon_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "coupon_id_fk"))
	private CouponManager couponId;
	
	@Column(name = "discountcode_value", length = 64)
	private String discountcodeValue;
	
//	@Column(name = "delivery_manid", length = 32)
//	private String deliveryManid;

	@OneToOne
	@JoinColumn(name = "member_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_delivery_manid"))
	private MemberMaster deliveryManid;
	
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

	public CouponManager getCouponId() {
		return couponId;
	}

	public void setCouponId(CouponManager couponId) {
		this.couponId = couponId;
	}

	public String getDiscountcodeValue() {
		return discountcodeValue;
	}

	public void setDiscountcodeValue(String discountcodeValue) {
		this.discountcodeValue = discountcodeValue;
	}


	public MemberMaster getDeliveryManid() {
		return deliveryManid;
	}

	public void setDeliveryManid(MemberMaster deliveryManid) {
		this.deliveryManid = deliveryManid;
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

