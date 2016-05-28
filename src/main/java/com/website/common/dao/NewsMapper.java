package com.website.common.dao;

import java.util.List;
import java.util.Map;

import com.website.common.entity.News;


public interface NewsMapper {
    int deleteByPrimaryKey(Long nNewsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Long nNewsId);

    int updateByNews(News record);

    int updateByPrimaryKey(News record);
    
    public News findNewsByParam(Map<String,Object> param);
    
    public List<Long> seachNews(Map<String,Object> param);
    
    List<News> findAll(Map<String,Object> param);
     
    public List<News> findNewsList(Map<String,Object> param);
 	public int findNewsListCount(Map<String,Object> param);
    
  
    
}