package com.baizhi.ssm.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Record {
	private int id;
	private int uid;
	private int aid;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date time;
	private Double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Record(int id, int uid, int aid, Date time, Double price) {
		super();
		this.id = id;
		this.uid = uid;
		this.aid = aid;
		this.time = time;
		this.price = price;
	}
	public Record(int uid, int aid, Date time, Double price) {
		super();
		this.uid = uid;
		this.aid = aid;
		this.time = time;
		this.price = price;
	}
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", uid=" + uid + ", aid=" + aid + ", time="
				+ time + ", price=" + price + "]";
	}
	
}
