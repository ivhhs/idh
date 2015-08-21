package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_distribute_level_chanage_log")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DistributeLevelChanageLog {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "seq", length = 32)
	private String seq;
	@Column(name = "distributorId", length = 32)
	private String distributorId;
	@Column(name = "oldlevel", length = 32)
	private String oldlevel;
	@Column(name = "newLevel", length = 32)
	private String newLevel;
	@Column(name = "activeTime", length = 32)
	private String activeTime;
	@Column(name = "inactiveLevel", length = 32)
	private String inactiveLevel;
	@Column(name = "updateTime", length = 20)
	private String updateTime;
	@Column(name = "disType", length = 2)
	private String disType;
	@Column(name = "operationId", length = 32)
	private String operationId;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getOldlevel() {
		return oldlevel;
	}

	public void setOldlevel(String oldlevel) {
		this.oldlevel = oldlevel;
	}

	public String getNewLevel() {
		return newLevel;
	}

	public void setNewLevel(String newLevel) {
		this.newLevel = newLevel;
	}

	public String getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public String getInactiveLevel() {
		return inactiveLevel;
	}

	public void setInactiveLevel(String inactiveLevel) {
		this.inactiveLevel = inactiveLevel;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getDisType() {
		return disType;
	}

	public void setDisType(String disType) {
		this.disType = disType;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

}