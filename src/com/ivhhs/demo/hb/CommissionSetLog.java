package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_commission_set_log")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CommissionSetLog {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "seq", length = 32)
	private String seq;
	@Column(name = "commodityId", length = 32)
	private String commodityId;
	@Column(name = "disType", length = 2)
	private String disType;
	@Column(name = "oldLevel", length = 50)
	private String oldLevel;
	@Column(name = "newLevel", length = 50)
	private String newLevel;
	@Column(name = "updateTime", length = 20)
	private String updateTime;
	@Column(name = "operationId", length = 32)
	private String operationId;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getDisType() {
		return disType;
	}

	public void setDisType(String disType) {
		this.disType = disType;
	}

	public String getOldLevel() {
		return oldLevel;
	}

	public void setOldLevel(String oldLevel) {
		this.oldLevel = oldLevel;
	}

	public String getNewLevel() {
		return newLevel;
	}

	public void setNewLevel(String newLevel) {
		this.newLevel = newLevel;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

}