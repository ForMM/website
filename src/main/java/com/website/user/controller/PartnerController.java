package com.website.user.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.website.common.content.Status;
import com.website.common.log.LogTool;
import com.website.common.util.Result;
import com.website.user.dto.PartnerInfoDto;
import com.website.user.model.PartnerInfoModel;
import com.website.user.service.PartnerService;

@Controller
@RequestMapping("/partner")
public class PartnerController {
	
	LogTool log=LogTool.getInstance(PartnerController.class);

	@Autowired
	private PartnerService partnerService;	
		
	@RequestMapping("/partnerList")
	public String  partnerList(HttpServletRequest request,HttpServletResponse response,PartnerInfoModel partnerInfoModel,Integer page, Integer pageSize){
		PrintWriter pw = null;
		try {			
			pw = response.getWriter();							
			Map<String,Object> data = partnerService.getPartner(partnerInfoModel, page, pageSize);					
			JSONObject json = JSONObject.fromObject(data);						
			pw.print(json);
		} catch (Exception ex) {
			log.error("查询新闻表数据失败。。。", ex);
			ex.printStackTrace();		
		}
		return null;
	}

	@RequestMapping("/getpartnerById")
	public void  getpartnerByIdController(HttpServletRequest request,HttpServletResponse response,PartnerInfoModel partnerInfoModel){
		PrintWriter pw = null;
		Result result = null;
		try {	
			result = new Result();
			pw = response.getWriter();							
			PartnerInfoDto partnerInfoDto = partnerService.getPartnerById(partnerInfoModel);			
			request.setAttribute("partner", partnerInfoDto);			
			result.setStatus(Status.success_status);
			Map<String,Object> data = new HashMap<String,Object>();
			data.put("partner",partnerInfoDto);
			result.setData(data);
			JSONObject json = JSONObject.fromObject(result);						
			pw.print(json);
		} catch (Exception ex) {
			log.error("删除新闻数据失败。。。", ex);
			ex.printStackTrace();		
		}	
	}
	
}
