package com.website.user.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.common.dao.NewsMapper;
import com.website.common.entity.News;
import com.website.common.log.LogTool;
import com.website.common.util.Paginator;
import com.website.user.dto.NewsInfoDto;
import com.website.user.model.NewsInfoModel;
import com.website.user.service.NewsService;


@Service("NewsService")
public class NewsServiceImpl implements NewsService {
	LogTool log = LogTool.getInstance(NewsServiceImpl.class);

	
	@Autowired
	private NewsMapper newsMapper;
	
	@Override
	public Map<String, Object> getNews(NewsInfoModel newsInfoModel,
			Integer page, Integer pageSize) throws Exception {


		Map<String, Object> param = new HashMap<String, Object>();
	
		param.put("NewsContent",newsInfoModel.getNewsContent());
		int count =newsMapper.findNewsListCount(param);
		
		Paginator paginator = new Paginator(0, pageSize);
		paginator.gotoPage(page);
		int pageCount = paginator.calcPageCount(count); // 总页数
		
		/**** 分页判断end *****/
		param.put("startRow", paginator.getStartRow());
		param.put("pageSize", paginator.getPageSize());
	
		
		List<News> newsList = newsMapper.findNewsList(param);
		
		List<NewsInfoDto> newsInfoDtos=new ArrayList<NewsInfoDto>();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		
		for(News news:newsList){
			NewsInfoDto newsInfoDto = new NewsInfoDto();
			newsInfoDto.setNewsId(news.getnNewsId());
			newsInfoDto.setNewsType(Integer.parseInt(news.getnNewsType()));
			newsInfoDto.setHeader(news.getcHeader());
			newsInfoDto.setNewsContent(news.getcNewsContent());								
			newsInfoDto.setCreateTime(sdf.format(news.gettCreateTime()));
			newsInfoDtos.add(newsInfoDto);
		}
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("page", page);
		data.put("pageSize", pageSize);
		data.put("pageCount", pageCount);
		data.put("dataList",newsInfoDtos);
		data.put("count",count);
		
		return data;
		
		
	}

	@Override
	public void saveNews(NewsInfoModel newsInfoModel) throws Exception {		
		
		Timestamp time=new Timestamp(System.currentTimeMillis());
		News news = new News();
		news.setcHeader(newsInfoModel.getHeader());
		news.setnNewsType(newsInfoModel.getNewsType().toString());
		news.setcNewsContent(newsInfoModel.getNewsContent());
		news.settCreateTime(time);
		news.settUpdateTime(time);
		
		newsMapper.insert(news);
	}

	@Override
	public void delNews(NewsInfoModel newsInfoModel) throws Exception {		
		newsMapper.deleteByPrimaryKey(newsInfoModel.getNewsId());
	}

	@Override
	public NewsInfoDto getNewsById(NewsInfoModel newsInfoModel)
			throws Exception {
		News news = newsMapper.selectByPrimaryKey(newsInfoModel.getNewsId());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		NewsInfoDto newsInfoDto = new NewsInfoDto();
		newsInfoDto.setNewsId(news.getnNewsId());
		newsInfoDto.setHeader(news.getcHeader());
		newsInfoDto.setNewsType(Integer.parseInt(news.getnNewsType()));
		newsInfoDto.setNewsContent(news.getcNewsContent());
		newsInfoDto.setCreateTime(sdf.format(news.gettCreateTime()));
		
		return newsInfoDto;
		
	}

	@Override
	public void upfateNews(NewsInfoModel newsInfoModel) throws Exception {
		Timestamp time=new Timestamp(System.currentTimeMillis());
		News news = new News();
		news.setnNewsId(newsInfoModel.getNewsId());
		news.setcHeader(newsInfoModel.getHeader());
		news.setnNewsType(newsInfoModel.getNewsType().toString());
		news.setcNewsContent(newsInfoModel.getNewsContent());
		news.settCreateTime(time);
		news.settUpdateTime(time);
		
		newsMapper.updateByPrimaryKey(news);
		
	}
	

	
}
