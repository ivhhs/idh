package com.ivhhs.demo.hb;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_user_comments")
@Inheritance(strategy = InheritanceType.JOINED)

public class UserComments {

	@Id
	@Column(name = "comment_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	
	private String comment_id;
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goods_id")
	private Goods goods;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private MemberRegister member;
	@Column(name = "user_score", precision = 10)
	private BigDecimal user_score;
	@Column(name = "comment_review", length = 500)
	private String comment_review;
	@Column(name = "comment_time", length = 20)
	private String comment_time;
	@Column(name = "comment_status", length = 8)
	private String comment_status;
	
	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
	public MemberRegister getMember() {
		return this.member;
	}

	public void setGoods(MemberRegister member) {
		this.member = member;
	}
	
	
	public BigDecimal getUser_score() {
		return user_score;
	}
	public void setUser_score(BigDecimal user_score) {
		this.user_score = user_score;
	}
	
	public String getComment_review() {
		return comment_review;
	}
	public void setComment_review(String comment_review) {
		this.comment_review = comment_review;
	}
	
	public String getComment_time() {
		return comment_time;
	}
	public void setComment_time(String comment_time) {
		this.comment_time = comment_time;
	}
	
	public String getComment_status() {
		return comment_status;
	}
	public void setComment_status(String comment_status) {
		this.comment_status = comment_status;
	}
}
