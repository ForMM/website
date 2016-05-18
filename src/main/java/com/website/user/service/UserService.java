package com.website.user.service;

import java.util.Map;

import com.website.common.util.Result;
import com.website.user.model.UserInfoModel;

public interface UserService {

	public Result login(String username,String password) throws Exception;
	

}
