package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: SMPreferentialManager.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name = "bt_preferential_mgr")
public class SMPreferentialManager {

	@Id
	@Column(name = "sendactivities_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String uuid;
	
	
	@ManyToOne
	@JoinColumn(name = "activities_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_activities_id"))
	private CouponManager activitiesId;
	
	@Column(name = "preferential_condition", length = 4)
	private String preferentialCondition;
	
	@Column(name = "upper_no_capped", length = 	1)
	private String upperNoCapped;
	
	@Column(name = "reduced_cash", length = 20)
	private String reducedCash;
	
	@Column(name = "sale_percent", length = 3)
	private String salePercent;
	
	@Column(name = "present_ornot", length = 1)
	private String presentOrnot;
	
	@Column(name = "present_info", length = 256)
	private String presentInfo;
	
	@Column(name = "free_postage", length = 1)
	private String freePostage;
	
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

	public CouponManager getActivitiesId() {
		return activitiesId;
	}

	public void setActivitiesId(CouponManager activitiesId) {
		this.activitiesId = activitiesId;
	}

	public String getPreferentialCondition() {
		return preferentialCondition;
	}

	public void setPreferentialCondition(String preferentialCondition) {
		this.preferentialCondition = preferentialCondition;
	}

	public String getUpperNoCapped() {
		return upperNoCapped;
	}

	public void setUpperNoCapped(String upperNoCapped) {
		this.upperNoCapped = upperNoCapped;
	}

	public String getReducedCash() {
		return reducedCash;
	}

	public void setReducedCash(String reducedCash) {
		this.reducedCash = reducedCash;
	}

	public String getSalePercent() {
		return salePercent;
	}

	public void setSalePercent(String salePercent) {
		this.salePercent = salePercent;
	}

	public String getPresentOrnot() {
		return presentOrnot;
	}

	public void setPresentOrnot(String presentOrnot) {
		this.presentOrnot = presentOrnot;
	}

	public String getPresentInfo() {
		return presentInfo;
	}

	public void setPresentInfo(String presentInfo) {
		this.presentInfo = presentInfo;
	}

	public String getFreePostage() {
		return freePostage;
	}

	public void setFreePostage(String freePostage) {
		this.freePostage = freePostage;
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

