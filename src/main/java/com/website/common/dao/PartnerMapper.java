package com.website.common.dao;

import java.util.List;
import java.util.Map;

import com.website.common.entity.Partner;


public interface PartnerMapper {
    int deleteByPrimaryKey(Long nPartnerId);

    int insert(Partner record);

    int insertSelective(Partner record);

    Partner selectByPrimaryKey(Long nPartnerId);

    int updateByPartner(Partner record);

    int updateByPrimaryKey(Partner record);
    
    public Partner findPartnerByParam(Map<String,Object> param);
    
    public List<Long> seachPartner(Map<String,Object> param);
    
    List<Partner> findAll(Map<String,Object> param);
     
    public List<Partner> findPartnerList(Map<String,Object> param);
 	public int findPartnerListCount(Map<String,Object> param);
    
  
    
}