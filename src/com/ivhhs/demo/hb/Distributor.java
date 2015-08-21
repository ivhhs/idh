package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_distributor")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Distributor {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "distributorId", length = 32)
	private String distributorId;
	@Column(name = "mobile", length = 11)
	private String mobile;
	@Column(name = "distributorName", length = 32)
	private String distributorName;
	@Column(name = "level", length = 32)
	private String level;
	@Column(name = "imgPath", length = 80)
	private String imgPath;
	@Column(name = "joinTime", length = 20)
	private String joinTime;
	@Column(name = "leaderId", length = 32)
	private String leaderId;
	@Column(name = "disAmount", length = 22)
	private Integer disAmount;
	@Column(name = "disCommission", length = 22)
	private Integer disCommission;
	@Column(name = "checkCash", length = 22)
	private Integer checkCash;
	@Column(name = "disStatus", length = 1)
	private String disStatus;
	@Column(name = "approvalStatus", length = 1)
	private String approvalStatus;
	@Column(name = "userName", length = 20)
	private String userName;
	@Column(name = "bankCardNum", length = 30)
	private String bankCardNum;

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}

	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}

	public Integer getDisAmount() {
		return disAmount;
	}

	public void setDisAmount(Integer disAmount) {
		this.disAmount = disAmount;
	}

	public Integer getDisCommission() {
		return disCommission;
	}

	public void setDisCommission(Integer disCommission) {
		this.disCommission = disCommission;
	}

	public Integer getCheckCash() {
		return checkCash;
	}

	public void setCheckCash(Integer checkCash) {
		this.checkCash = checkCash;
	}

	public String getDisStatus() {
		return disStatus;
	}

	public void setDisStatus(String disStatus) {
		this.disStatus = disStatus;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBankCardNum() {
		return bankCardNum;
	}

	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}

}