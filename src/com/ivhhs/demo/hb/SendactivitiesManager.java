package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: SendactivitiesManager.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name = "bt_sendactivities_mgr")
public class SendactivitiesManager {

	@Id
	@Column(name = "activities_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String uuid;
	
	@Column(name = "activities_name", length = 64)
	private String couponName;
	
	@Column(name = "effect_time_start", length = 20)
	private String effectTimeStart;
	
	@Column(name = "effect_time_end", length = 20)
	private String effectTimeEnd;
	
	@Column(name = "send_type", length = 1)
	private String sendType;
	
	@Column(name = "display_set", length = 1)
	private String displaySet;
	
	@Column(name = "activities_description", length = 256)
	private String activitiesDescription;
	
	@Column(name = "send_activities_range", length = 1)
	private String sendActivitiesRange;
	
	@Column(name = "add_time", length = 20)
	private String addTime;
	
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

	public String getEffectTimeStart() {
		return effectTimeStart;
	}

	public void setEffectTimeStart(String effectTimeStart) {
		this.effectTimeStart = effectTimeStart;
	}

	public String getEffectTimeEnd() {
		return effectTimeEnd;
	}

	public void setEffectTimeEnd(String effectTimeEnd) {
		this.effectTimeEnd = effectTimeEnd;
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getDisplaySet() {
		return displaySet;
	}

	public void setDisplaySet(String displaySet) {
		this.displaySet = displaySet;
	}

	public String getActivitiesDescription() {
		return activitiesDescription;
	}

	public void setActivitiesDescription(String activitiesDescription) {
		this.activitiesDescription = activitiesDescription;
	}

	public String getSendActivitiesRange() {
		return sendActivitiesRange;
	}

	public void setSendActivitiesRange(String sendActivitiesRange) {
		this.sendActivitiesRange = sendActivitiesRange;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
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

