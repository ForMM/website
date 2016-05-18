package com.website.user.model;

public class UserInfoModel {
	/**
	 * 0鎶曡祫浜�鍒涗笟鑰�
	 * */
	private Integer role;
	
	private int page=1;
	
	private int pageSize=10;
	
	private String username;
	
	private Integer identifyResult;

	public Integer getRole() {
		return role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getIdentifyResult() {
		return identifyResult;
	}

	public void setIdentifyResult(Integer identifyResult) {
		this.identifyResult = identifyResult;
	}

	
   
}
