package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: PromotionManager.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name = "bt_promotion_mgr")
public class PromotionManager {

	
	private String uuid;
	
	@Column(name = "promotion_name", length = 64)
	private String promotionName;
	
	
	private MemberMaster promotionObjects;
	
	@Column(name = "promotion_start", length = 20)
	private String promotionStart;
	
	@Column(name = "promotion_end", length = 20)
	private String promotionEnd;
	
	@Column(name = "promotion_type", length = 1)
	private String promotionType;
	
	@Column(name = "promotion_tip", length = 10)
	private String promotionTip;
	
	@Column(name = "update_time", length = 20)
	private String updateTime;
	
	@Column(name = "update_userid", length = 32)
	private String updateUserid;

	@Id
	@Column(name = "promotion_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}


	public String getPromotionStart() {
		return promotionStart;
	}

	public void setPromotionStart(String promotionStart) {
		this.promotionStart = promotionStart;
	}

	public String getPromotionEnd() {
		return promotionEnd;
	}

	public void setPromotionEnd(String promotionEnd) {
		this.promotionEnd = promotionEnd;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getPromotionTip() {
		return promotionTip;
	}

	public void setPromotionTip(String promotionTip) {
		this.promotionTip = promotionTip;
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

	@ManyToOne
	@JoinColumn(name = "promotion_objects")
	public MemberMaster getPromotionObjects() {
		return promotionObjects;
	}

	public void setPromotionObjects(MemberMaster promotionObjects) {
		this.promotionObjects = promotionObjects;
	}

}

