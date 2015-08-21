package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_member_register")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MemberRegister {
	
	@Id
	@Column(name = "member_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String member_id;
	
	@Column(name = "wx_openid", length = 32)
	private String wx_openid;
	
	@Column(name = "nickname", length = 32)
	private String nickname;
	
	@Column(name = "sex", length = 1)
	private String sex;
	
	@Column(name = "country", length = 8)
	private String country;
	
	@Column(name = "province", length = 32)
	private String province;
	
	@Column(name = "city", length = 32)
	private String city;
	
	@Column(name = "qq_openid", length = 32)
	private String qq_openid;
	
	@Column(name = "qq_account", length = 32)
	private String qq_account;
	
	@Column(name = "wb_openid", length = 32)
	private String wb_openid;
	
	@Column(name = "wb_account", length = 32)
	private String wb_account;
	
	@Column(name = "login_account", length = 32)
	private String login_account;
	
	@Column(name = "login_pw", length = 32)
	private String login_pw;
	
	@Column(name = "user_name", length = 32)
	private String user_name;
	
	@Column(name = "mobile", length = 32)
	private String mobile;
	
	@Column(name = "create_user", length = 32)
	private String create_user;
	
	@Column(name = "create_date", length = 20)
	private String create_date;

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getWx_openid() {
		return wx_openid;
	}

	public void setWx_openid(String wx_openid) {
		this.wx_openid = wx_openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getQq_openid() {
		return qq_openid;
	}

	public void setQq_openid(String qq_openid) {
		this.qq_openid = qq_openid;
	}

	public String getQq_account() {
		return qq_account;
	}

	public void setQq_account(String qq_account) {
		this.qq_account = qq_account;
	}

	public String getWb_openid() {
		return wb_openid;
	}

	public void setWb_openid(String wb_openid) {
		this.wb_openid = wb_openid;
	}

	public String getWb_account() {
		return wb_account;
	}

	public void setWb_account(String wb_account) {
		this.wb_account = wb_account;
	}

	public String getLogin_account() {
		return login_account;
	}

	public void setLogin_account(String login_account) {
		this.login_account = login_account;
	}

	public String getLogin_pw() {
		return login_pw;
	}

	public void setLogin_pw(String login_pw) {
		this.login_pw = login_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

}