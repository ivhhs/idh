package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_commission_pay_log")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CommissionPayLog {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "seq", length = 32)
	private String seq;
	@Column(name = "applyId", length = 32)
	private String applyId;
	@Column(name = "operationId", length = 32)
	private String operationId;
	@Column(name = "money", length = 22)
	private Integer money;
	@Column(name = "disType", length = 2)
	private String disType;
	@Column(name = "operationTime", length = 19)
	private Integer operationTime;
	@Column(name = "disStatus", length = 1)
	private String disStatus;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getApplyId() {
		return applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getDisType() {
		return disType;
	}

	public void setDisType(String disType) {
		this.disType = disType;
	}

	public Integer getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(Integer operationTime) {
		this.operationTime = operationTime;
	}

	public String getDisStatus() {
		return disStatus;
	}

	public void setDisStatus(String disStatus) {
		this.disStatus = disStatus;
	}

}