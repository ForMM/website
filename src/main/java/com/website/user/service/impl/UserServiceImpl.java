package com.website.user.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.common.content.Status;
import com.website.common.content.SysContent;
import com.website.common.dao.UserAccountMapper;
import com.website.common.entity.UserAccount;
import com.website.common.log.LogTool;
import com.website.common.util.Paginator;
import com.website.common.util.Result;
import com.website.user.dto.UserInfoDto;
import com.website.user.model.UserInfoModel;
import com.website.user.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	LogTool log = LogTool.getInstance(UserServiceImpl.class);

	
	@Autowired
	private UserAccountMapper userAccountMapper;


	public Result login(String username, String password) throws Exception {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userAccount", username);
		param.put("password", password);
		UserAccount manageAccount = userAccountMapper.findAccountByParam(param);
		
		Result result = new Result();
		if(manageAccount != null){		
			Map<String, Object> data = new HashMap<String, Object>();
			result.setStatus(Status.success_status);
			result.setInfo(Status.success_info);							
			data.put("user", manageAccount);		
			result.setData(data);	
			SysContent.getRequest().getSession().setAttribute("user", manageAccount);
		}else{
			log.debug("登录用户不存在...");
			result.setStatus(Status.login_error_status);
			result.setInfo(Status.login_error_info);							
			result.setData("");					
		}
				
		return result;
	}
	

	
}
