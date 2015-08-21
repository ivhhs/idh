package com.ivhhs.demo.hb;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bt_trade_cash")
public class TradeCash implements java.io.Serializable {

	private String cashId;
	private String empName;
	private String empMobile;
	private BigDecimal cashBalance;
	private BigDecimal cashAmount;
	private BigDecimal cashAccount;
	private String createTime;
	private String operator;
	private String operateTime;
	private String status;

	@Id
	@Column(name = "cash_id", unique = true, nullable = false, length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	public String getCashId() {
		return this.cashId;
	}

	public void setCashId(String cashId) {
		this.cashId = cashId;
	}

	@Column(name = "emp_name", length = 45)
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Column(name = "emp_mobile", length = 45)
	public String getEmpMobile() {
		return this.empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	@Column(name = "cash_balance", precision = 10)
	public BigDecimal getCashBalance() {
		return this.cashBalance;
	}

	public void setCashBalance(BigDecimal cashBalance) {
		this.cashBalance = cashBalance;
	}

	@Column(name = "cash_amount", precision = 10)
	public BigDecimal getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	@Column(name = "cash_account", precision = 10)
	public BigDecimal getCashAccount() {
		return this.cashAccount;
	}

	public void setCashAccount(BigDecimal cashAccount) {
		this.cashAccount = cashAccount;
	}

	@Column(name = "create_time", length = 20)
	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name = "c_operator", length = 32)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name = "c_operatetime", length = 20)
	public String getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	@Column(name = "c_status", length = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
