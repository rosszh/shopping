package com.qx.model;

// Generated 2015-9-6 15:37:17 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Pingjiainfo generated by hbm2java
 */
public class Pingjiainfo implements java.io.Serializable {

	private Integer pingjiaId;
	private Goodsinfo goodsinfo;
	private Userinfo userinfo;
	private Orderinfo orderinfo; 
	private Integer pingjiaStatus;
	private String pingjiaContent;
	private Date pingjiaTime;

	public Pingjiainfo() {
	}

	public Pingjiainfo(Goodsinfo goodsinfo, Userinfo userinfo,
			Orderinfo orderinfo) {
		this.goodsinfo = goodsinfo;
		this.userinfo = userinfo;
		this.orderinfo = orderinfo;
	}

	public Pingjiainfo(Goodsinfo goodsinfo, Userinfo userinfo,
			Orderinfo orderinfo, Integer pingjiaStatus, String pingjiaContent,
			Date pingjiaTime) {
		this.goodsinfo = goodsinfo;
		this.userinfo = userinfo;
		this.orderinfo = orderinfo;
		this.pingjiaStatus = pingjiaStatus;
		this.pingjiaContent = pingjiaContent;
		this.pingjiaTime = pingjiaTime;
	}

	public Integer getPingjiaId() {
		return this.pingjiaId;
	}

	public void setPingjiaId(Integer pingjiaId) {
		this.pingjiaId = pingjiaId;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Orderinfo getOrderinfo() {
		return this.orderinfo;
	}

	public void setOrderinfo(Orderinfo orderinfo) {
		this.orderinfo = orderinfo;
	}

	public Integer getPingjiaStatus() {
		return this.pingjiaStatus;
	}

	public void setPingjiaStatus(Integer pingjiaStatus) {
		this.pingjiaStatus = pingjiaStatus;
	}

	public String getPingjiaContent() {
		return this.pingjiaContent;
	}

	public void setPingjiaContent(String pingjiaContent) {
		this.pingjiaContent = pingjiaContent;
	}

	public Date getPingjiaTime() {
		return this.pingjiaTime;
	}

	public void setPingjiaTime(Date pingjiaTime) {
		this.pingjiaTime = pingjiaTime;
	}

}
