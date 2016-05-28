package com.website.common.entity;

import java.util.Date;

public class News {
    private Long nNewsId;
    
    private String cHeader;
    
    private String nNewsType;

    private String cNewsContent;

    private Date tCreateTime;

    private Date tUpdateTime;

	public Long getnNewsId() {
		return nNewsId;
	}

	public void setnNewsId(Long nNewsId) {
		this.nNewsId = nNewsId;
	}

	public String getcHeader() {
		return cHeader;
	}

	public void setcHeader(String cHeader) {
		this.cHeader = cHeader;
	}

	public String getnNewsType() {
		return nNewsType;
	}

	public void setnNewsType(String nNewsType) {
		this.nNewsType = nNewsType;
	}

	public String getcNewsContent() {
		return cNewsContent;
	}

	public void setcNewsContent(String cNewsContent) {
		this.cNewsContent = cNewsContent;
	}

	public Date gettCreateTime() {
		return tCreateTime;
	}

	public void settCreateTime(Date tCreateTime) {
		this.tCreateTime = tCreateTime;
	}

	public Date gettUpdateTime() {
		return tUpdateTime;
	}

	public void settUpdateTime(Date tUpdateTime) {
		this.tUpdateTime = tUpdateTime;
	}

   

   
}