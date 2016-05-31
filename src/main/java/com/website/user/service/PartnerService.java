package com.website.user.service;

import java.util.Map;

import com.website.user.dto.PartnerInfoDto;
import com.website.user.model.PartnerInfoModel;

public interface PartnerService {

	public Map<String, Object> getPartner(PartnerInfoModel newsInfoModel,Integer page, Integer pageSize) throws Exception;		
	
	
	public PartnerInfoDto getPartnerById(PartnerInfoModel newsInfoModel)throws Exception;
}
