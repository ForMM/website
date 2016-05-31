package com.website.user.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.common.dao.PartnerMapper;
import com.website.common.entity.Partner;
import com.website.common.log.LogTool;
import com.website.common.util.Paginator;
import com.website.user.dto.PartnerInfoDto;
import com.website.user.model.PartnerInfoModel;
import com.website.user.service.PartnerService;


@Service("PartnerService")
public class PartnerServiceImpl implements PartnerService {
	LogTool log = LogTool.getInstance(PartnerServiceImpl.class);

	
	@Autowired
	private PartnerMapper partnerMapper;
	
	@Override
	public Map<String, Object> getPartner(PartnerInfoModel partnerInfoModel,
			Integer page, Integer pageSize) throws Exception {


		Map<String, Object> param = new HashMap<String, Object>();
	
		param.put("PartnerName",partnerInfoModel.getPartnerName());
		int count =partnerMapper.findPartnerListCount(param);
		
		Paginator paginator = new Paginator(0, pageSize == null ? 10 : pageSize);
		paginator.gotoPage(page == null ? 1 :page);
		int pageCount = paginator.calcPageCount(count); // 总页数
		
		/**** 分页判断end *****/
		param.put("startRow", paginator.getStartRow());
		param.put("pageSize", paginator.getPageSize());
	
		
		List<Partner> partnerList = partnerMapper.findPartnerList(param);
		
		List<PartnerInfoDto> partnerInfoDtos=new ArrayList<PartnerInfoDto>();
		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		
		for(Partner partner:partnerList){
			PartnerInfoDto partnerInfoDto = new PartnerInfoDto();
			partnerInfoDto.setPartnerId(partner.getnPartnerId());
			partnerInfoDto.setPartnerAddress(partner.getcPartnerAddress());
			partnerInfoDto.setPartnerName(partner.getcPartnerName());
			partnerInfoDto.setPartnerLogo(partner.getcPartnerLogo());								
			partnerInfoDtos.add(partnerInfoDto);
		}
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("page", page);
		data.put("pageSize", pageSize);
		data.put("pageCount", pageCount);
		data.put("dataList",partnerInfoDtos);
		data.put("count",count);
		
		return data;
		
		
	}


	@Override
	public PartnerInfoDto getPartnerById(PartnerInfoModel partnerInfoModel)
			throws Exception {
		Partner partner = partnerMapper.selectByPrimaryKey(partnerInfoModel.getPartnerId());
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		PartnerInfoDto partnerInfoDto = new PartnerInfoDto();
		partnerInfoDto.setPartnerId(partner.getnPartnerId());
		partnerInfoDto.setPartnerAddress(partner.getcPartnerAddress());
		partnerInfoDto.setPartnerName(partner.getcPartnerName());
		partnerInfoDto.setPartnerLogo(partner.getcPartnerLogo());
		
		
		return partnerInfoDto;
		
	}

	

	
}
