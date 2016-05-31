package com.website.common.entity;

import java.util.Date;

public class Partner {
    private Long nPartnerId;
    
    private String cPartnerName;
    
    private String cPartnerAddress;

    private String cPartnerLogo;

    private Date tCreateTime;

    private Date tUpdateTime;

	public Long getnPartnerId() {
		return nPartnerId;
	}

	public void setnPartnerId(Long nPartnerId) {
		this.nPartnerId = nPartnerId;
	}

	public String getcPartnerName() {
		return cPartnerName;
	}

	public void setcPartnerName(String cPartnerName) {
		this.cPartnerName = cPartnerName;
	}

	public String getcPartnerAddress() {
		return cPartnerAddress;
	}

	public void setcPartnerAddress(String cPartnerAddress) {
		this.cPartnerAddress = cPartnerAddress;
	}

	public String getcPartnerLogo() {
		return cPartnerLogo;
	}

	public void setcPartnerLogo(String cPartnerLogo) {
		this.cPartnerLogo = cPartnerLogo;
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