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
import com.website.user.dto.NewsInfoDto;
import com.website.user.model.NewsInfoModel;
import com.website.user.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	LogTool log=LogTool.getInstance(NewsController.class);

	@Autowired
	private NewsService newsService;	
		
	@RequestMapping("/newsList")
	public String  newsList(HttpServletRequest request,HttpServletResponse response,NewsInfoModel newsInfoModel,Integer page, Integer pageSize){
		PrintWriter pw = null;
		try {			
			pw = response.getWriter();							
			Map<String,Object> data = newsService.getNews(newsInfoModel, page, pageSize);					
			JSONObject json = JSONObject.fromObject(data);						
			pw.print(json);
		} catch (Exception ex) {
			log.error("查询新闻表数据失败。。。", ex);
			ex.printStackTrace();		
		}
		return null;
	}

	@RequestMapping("/addNews")
	public String  addNewsController(HttpServletRequest request,HttpServletResponse response,NewsInfoModel newsInfoModel){
		PrintWriter pw = null;
		Result result = null;
		try {	
			result = new Result();
			pw = response.getWriter();							
			newsService.saveNews(newsInfoModel);	
			result.setStatus(Status.success_status);
			JSONObject json = JSONObject.fromObject(result);						
			pw.print(json);
		} catch (Exception ex) {
			log.error("插入新闻数据失败。。。", ex);
			ex.printStackTrace();		
		}
		return null;
	}
	
	@RequestMapping("/updateNews")
	public String  updateNewsController(HttpServletRequest request,HttpServletResponse response,NewsInfoModel newsInfoModel){
		PrintWriter pw = null;
		Result result = null;
		try {	
			result = new Result();
			pw = response.getWriter();							
			newsService.upfateNews(newsInfoModel);	
			result.setStatus(Status.success_status);
			JSONObject json = JSONObject.fromObject(result);						
			pw.print(json);
		} catch (Exception ex) {
			log.error("插入新闻数据失败。。。", ex);
			ex.printStackTrace();		
		}
		return null;
	}
	
	@RequestMapping("/delNews")
	public String  delNewsController(HttpServletRequest request,HttpServletResponse response,NewsInfoModel newsInfoModel){
		PrintWriter pw = null;
		Result result = null;
		try {	
			result = new Result();
			pw = response.getWriter();							
			newsService.delNews(newsInfoModel);
			result.setStatus(Status.success_status);
			JSONObject json = JSONObject.fromObject(result);						
			pw.print(json);
		} catch (Exception ex) {
			log.error("删除新闻数据失败。。。", ex);
			ex.printStackTrace();		
		}
		return null;
	}
	
	@RequestMapping("/getNewsById")
	public void  getNewsByIdController(HttpServletRequest request,HttpServletResponse response,NewsInfoModel newsInfoModel){
		PrintWriter pw = null;
		Result result = null;
		try {	
			result = new Result();
			pw = response.getWriter();							
			NewsInfoDto newsInfoDto = newsService.getNewsById(newsInfoModel);			
			request.setAttribute("news", newsInfoDto);			
			result.setStatus(Status.success_status);
			Map<String,Object> data = new HashMap<String,Object>();
			data.put("news",newsInfoDto);
			result.setData(data);
			JSONObject json = JSONObject.fromObject(result);						
			pw.print(json);
		} catch (Exception ex) {
			log.error("删除新闻数据失败。。。", ex);
			ex.printStackTrace();		
		}	
	}
	
}
