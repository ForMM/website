package com.website.common.dao;

import java.util.List;
import java.util.Map;

import com.website.common.entity.UserAccount;


public interface UserAccountMapper {
    int deleteByPrimaryKey(Long nUserId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Long nUserId);

    int updateByAccount(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
    
    public UserAccount findAccountByParam(Map<String,Object> param);
    
    public List<Long> seachUserAcount(Map<String,Object> param);
    
    List<UserAccount> findAll(Map<String,Object> param);
    
    public List<Long> findUserIds(Map<String,Object> param);
    List<UserAccount> queryUserAcount(Map<String,Object> param);
    int queryUserAcountCount(Map<String,Object> param);
    
}