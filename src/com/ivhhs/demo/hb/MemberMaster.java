package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;


@Entity(name = "bt_member_master")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MemberMaster {
	private String uuid;
	@Id
	@Column(name = "uuid", unique = true, nullable = false, length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	@OneToOne
	@JoinColumn(name = "member_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_member_register"))
	private MemberRegister member;
	
	@Column(name = "balance", length = 12)
	private Integer balance;
	
	@Column(name = "total_cons_amount", length = 18)
	private Integer total_cons_amount;
	
	@Column(name = "credit", length = 32)
	private String credit;
	
	@Column(name = "total_credit", length = 32)
	private String total_credit;
	
	@Column(name = "member_level", length = 32)
	private String member_level;
	
	@OneToOne
	@JoinColumn(name = "member_level", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_member_level"))
	private MemberLevel level;
	
	@Column(name = "update_user", length = 32)
	private String update_user;
	
	@Column(name = "update_date", length = 20)
	private String update_date;

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getTotal_cons_amount() {
		return total_cons_amount;
	}

	public void setTotal_cons_amount(Integer total_cons_amount) {
		this.total_cons_amount = total_cons_amount;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getTotal_credit() {
		return total_credit;
	}

	public void setTotal_credit(String total_credit) {
		this.total_credit = total_credit;
	}

	public String getMember_level() {
		return member_level;
	}

	public void setMember_level(String member_level) {
		this.member_level = member_level;
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