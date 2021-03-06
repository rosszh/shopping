package com.qx.model;

// Generated 2015-9-6 15:37:17 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Level2 generated by hbm2java
 */
@JsonIgnoreProperties(value={"level3s","level1"})   
public class Level2 implements java.io.Serializable {

	private Integer level2Id;
	private Level1 level1;
	private String level2Name;
	private String level2Img;
	
	public String getLevel2Img() {
		return level2Img;
	}

	public void setLevel2Img(String level2Img) {
		this.level2Img = level2Img;
	}

	@JsonIgnore
	private Set level3s = new HashSet(0);

	public Level2() {
	}

	public Level2(Level1 level1, String level2Name, Set level3s, Set level3s_1) {
		this.level1 = level1;
		this.level2Name = level2Name;
		this.level3s = level3s;
	
	}

	public Integer getLevel2Id() {
		return this.level2Id;
	}

	public void setLevel2Id(Integer level2Id) {
		this.level2Id = level2Id;
	}

	public Level1 getLevel1() {
		return this.level1;
	}

	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}

	public String getLevel2Name() {
		return this.level2Name;
	}

	public void setLevel2Name(String level2Name) {
		this.level2Name = level2Name;
	}

	public Set getLevel3s() {
		return this.level3s;
	}

	public void setLevel3s(Set level3s) {
		this.level3s = level3s;
	}



}
