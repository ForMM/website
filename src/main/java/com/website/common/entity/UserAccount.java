package com.website.common.entity;

import java.util.Date;

public class UserAccount {
    private Long nUserId;

    private String cUserAccount;

    private String cUserPassword;

    private String cUserRealname;

    private String cUserPortrait;

    private String cMobilePhone;

    private String cUserEmail;

    private String cUserCompany;

    private String cUserPosition;

    private String cUserAddr;

    private Integer nUserRole;

    private String cUserIntroduce;
    
    private Integer nIscomplete;

    private Date tCreateTime;

    private Date tUpdateTime;

    public Long getnUserId() {
        return nUserId;
    }

    public void setnUserId(Long nUserId) {
        this.nUserId = nUserId;
    }

    public String getcUserIntroduce() {
		return cUserIntroduce;
	}

	public void setcUserIntroduce(String cUserIntroduce) {
		this.cUserIntroduce = cUserIntroduce;
	}

	public String getcUserAccount() {
        return cUserAccount;
    }

    public void setcUserAccount(String cUserAccount) {
        this.cUserAccount = cUserAccount == null ? null : cUserAccount.trim();
    }

    public String getcUserPassword() {
        return cUserPassword;
    }

    public void setcUserPassword(String cUserPassword) {
        this.cUserPassword = cUserPassword == null ? null : cUserPassword.trim();
    }

    public String getcUserRealname() {
        return cUserRealname;
    }

    public void setcUserRealname(String cUserRealname) {
        this.cUserRealname = cUserRealname == null ? null : cUserRealname.trim();
    }

    public String getcUserPortrait() {
        return cUserPortrait;
    }

    public void setcUserPortrait(String cUserPortrait) {
        this.cUserPortrait = cUserPortrait == null ? null : cUserPortrait.trim();
    }

    public String getcMobilePhone() {
        return cMobilePhone;
    }

    public void setcMobilePhone(String cMobilePhone) {
        this.cMobilePhone = cMobilePhone == null ? null : cMobilePhone.trim();
    }

    public String getcUserEmail() {
        return cUserEmail;
    }

    public void setcUserEmail(String cUserEmail) {
        this.cUserEmail = cUserEmail == null ? null : cUserEmail.trim();
    }

    public String getcUserCompany() {
        return cUserCompany;
    }

    public void setcUserCompany(String cUserCompany) {
        this.cUserCompany = cUserCompany == null ? null : cUserCompany.trim();
    }

    public String getcUserPosition() {
        return cUserPosition;
    }

    public void setcUserPosition(String cUserPosition) {
        this.cUserPosition = cUserPosition == null ? null : cUserPosition.trim();
    }

    public String getcUserAddr() {
        return cUserAddr;
    }

    public void setcUserAddr(String cUserAddr) {
        this.cUserAddr = cUserAddr == null ? null : cUserAddr.trim();
    }

    public Integer getnUserRole() {
		return nUserRole;
	}

	public void setnUserRole(Integer nUserRole) {
		this.nUserRole = nUserRole;
	}

    public Integer getnIscomplete() {
		return nIscomplete;
	}

	public void setnIscomplete(Integer nIscomplete) {
		this.nIscomplete = nIscomplete;
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