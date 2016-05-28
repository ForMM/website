package com.website.user.service;

import java.util.Map;

import com.website.user.dto.NewsInfoDto;
import com.website.user.model.NewsInfoModel;

public interface NewsService {

	public Map<String, Object> getNews(NewsInfoModel newsInfoModel,Integer page, Integer pageSize) throws Exception;		
	
	public void saveNews(NewsInfoModel newsInfoModel)throws Exception;
	
	public void upfateNews(NewsInfoModel newsInfoModel)throws Exception;

	public void delNews(NewsInfoModel newsInfoModel)throws Exception;
	
	public NewsInfoDto getNewsById(NewsInfoModel newsInfoModel)throws Exception;
}
