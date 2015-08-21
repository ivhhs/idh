package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_distribute_level")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DistributeLevel {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "seq", length = 32)
	private String seq;
	@Column(name = "levelName", length = 50)
	private String levelName;
	@Column(name = "levelDescription", length = 400)
	private String levelDescription;
	@Column(name = "levelType", length = 2)
	private String levelType;
	@Column(name = "levelCondition", length = 22)
	private Integer levelCondition;
	@Column(name = "levelOne", length = 22)
	private Integer levelOne;
	@Column(name = "levelTwo", length = 22)
	private Integer levelTwo;
	@Column(name = "levelThree", length = 22)
	private Integer levelThree;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getLevelDescription() {
		return levelDescription;
	}

	public void setLevelDescription(String levelDescription) {
		this.levelDescription = levelDescription;
	}

	public String getLevelType() {
		return levelType;
	}

	public void setLevelType(String levelType) {
		this.levelType = levelType;
	}

	public Integer getLevelCondition() {
		return levelCondition;
	}

	public void setLevelCondition(Integer levelCondition) {
		this.levelCondition = levelCondition;
	}

	public Integer getLevelOne() {
		return levelOne;
	}

	public void setLevelOne(Integer levelOne) {
		this.levelOne = levelOne;
	}

	public Integer getLevelTwo() {
		return levelTwo;
	}

	public void setLevelTwo(Integer levelTwo) {
		this.levelTwo = levelTwo;
	}

	public Integer getLevelThree() {
		return levelThree;
	}

	public void setLevelThree(Integer levelThree) {
		this.levelThree = levelThree;
	}

}