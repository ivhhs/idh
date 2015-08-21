package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_member_balance")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MemberBalance {
	
	@Id
	@Column(name = "balance_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String balance_id;
	
	@Column(name = "member_id", length = 32)
	private String member_id;
	
	@Column(name = "detail", length = 255)
	private String detail;
	
	@Column(name = "change_amount", length = 12)
	private Integer change_amount;
	
	@Column(name = "current_amount", length = 12)
	private Integer current_amount;
	
	@Column(name = "update_user", length = 32)
	private String update_user;
	
	@Column(name = "update_date", length = 20)
	private String update_date;

	public String getBalance_id() {
		return balance_id;
	}

	public void setBalance_id(String balance_id) {
		this.balance_id = balance_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getChange_amount() {
		return change_amount;
	}

	public void setChange_amount(Integer change_amount) {
		this.change_amount = change_amount;
	}

	public Integer getCurrent_amount() {
		return current_amount;
	}

	public void setCurrent_amount(Integer current_amount) {
		this.current_amount = current_amount;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

}