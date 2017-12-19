package com.habuma.spitter.util;

import java.util.Date;

/**
 * 重数
 * @author Administrator
 *
 */
public class Tuple {

	private String text;
	private Date date;
	private String username;
	private String avatar;
	private long id;
	
	public Tuple(String text, Date date, String username, String avatar, long id) {
		super();
		this.text = text;
		this.date = date;
		this.username = username;
		this.avatar = avatar;
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
