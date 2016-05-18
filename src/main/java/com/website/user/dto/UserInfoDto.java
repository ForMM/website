package com.website.user.dto;

public class UserInfoDto {	
	private Integer userId;
	private String account;
	private String realname;
	 private Integer userRole;
	private String mobilePhone;	
	private String company;
	private String position;
	private String addr;
	private String createTime;
    private String updateTime;

	private Integer identifyId;
	private Integer identifyResult;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public Integer getIdentifyResult() {
		return identifyResult;
	}
	public void setIdentifyResult(Integer identifyResult) {
		this.identifyResult = identifyResult;
	}
	public Integer getIdentifyId() {
		return identifyId;
	}
	public void setIdentifyId(Integer identifyId) {
		this.identifyId = identifyId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getUserRole() {
		return userRole;
	}
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	

}
