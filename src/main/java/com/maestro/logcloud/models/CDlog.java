package com.maestro.logcloud.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CDlog {

	private Long id;
	
	
	private String userid;
	
	private Integer terminalid;
	
	//@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private String checktime;
	
	private String name;
	
	private Integer cloud_upload;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getTerminalid() {
		return terminalid;
	}

	public void setTerminalid(Integer terminalid) {
		this.terminalid = terminalid;
	}

	public String getChecktime() {
		return checktime;
	}

	public void setChecktime(String checktime) {
		this.checktime = checktime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCloud_upload() {
		return cloud_upload;
	}

	public void setCloud_upload(Integer cloud_upload) {
		this.cloud_upload = cloud_upload;
	}
	
	
	
	
}
