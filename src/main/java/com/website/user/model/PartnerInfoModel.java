package com.website.user.model;

public class PartnerInfoModel {
	/**
	 *
	 * */
	
	
	private int page=1;
	
	private int pageSize=10;
	
	private Long partnerId;
	
	private String partnerName;
	    
	private String partnerLogo;
	
	private String partnerAddress;

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

	public Long getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getPartnerLogo() {
		return partnerLogo;
	}

	public void setPartnerLogo(String partnerLogo) {
		this.partnerLogo = partnerLogo;
	}

	public String getPartnerAddress() {
		return partnerAddress;
	}

	public void setPartnerAddress(String partnerAddress) {
		this.partnerAddress = partnerAddress;
	}


	
	
   
}
