package com.baizhi.ssm.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Auction {
	private int id;
	private String name;
	private Double startPrice;
	private Double upset;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	private String oic;
	private String desc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}
	public Double getUpset() {
		return upset;
	}
	public void setUpset(Double upset) {
		this.upset = upset;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getOic() {
		return oic;
	}
	public void setOic(String oic) {
		this.oic = oic;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Auction [id=" + id + ", name=" + name + ", startPrice="
				+ startPrice + ", upset=" + upset + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", oic=" + oic + ", desc=" + desc
				+ "]";
	}
	public Auction(int id, String name, Double startPrice, Double upset,
			Date startTime, Date endTime, String oic, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.startPrice = startPrice;
		this.upset = upset;
		this.startTime = startTime;
		this.endTime = endTime;
		this.oic = oic;
		this.desc = desc;
	}
	public Auction(String name, Double startPrice, Double upset,
			Date startTime, Date endTime, String oic, String desc) {
		super();
		this.name = name;
		this.startPrice = startPrice;
		this.upset = upset;
		this.startTime = startTime;
		this.endTime = endTime;
		this.oic = oic;
		this.desc = desc;
	}

	public Auction(int id) {
		this.id = id;
	}

	public Auction(String name) {
		this.name = name;
	}

	public Auction(String name, Double startPrice, Double upset, Date startTime, Date endTime, String desc) {
		this.name = name;
		this.startPrice = startPrice;
		this.upset = upset;
		this.startTime = startTime;
		this.endTime = endTime;
		this.desc = desc;
	}

	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
