package com.website.common.util;
//*****************************************************************************
/**
 * <p>Title:Global</p>
 * <p>Description:静态常量类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: </p>
 * @author 汤清
 * @version v1.0 2016-03-14
 */
//*****************************************************************************
public final class Global {
	//**********************日志TAG,区分不同的日志类型*****************************
	/**ACTION异常日志标识*/
	public static final String EXPCEPTION_ACTION = "【ACTION异常信息:】\n";
	/**业务服务层异常日志标识*/
	public static final String EXPCEPTION_SERVICE = "【SERVER异常信息:】\n";
	/**数据访问层异常日志标识*/
	public static final String EXPCEPTION_DAO = "【DAO异常信息:】\n";
	//*************************************************************************
	
	//*******************************通用业务常量********************************
	/**菜单根目录标识*/
	public static final String MENU_ROOT = "MenuRoot";
	/**部门根目录标识*/
	public static final String DEPARTMENT_ROOT = "root";
	/**部门根目录名称*/
	public static final String ROOT_NAME = "根目录";
	
	public static final String ZERO = "0";
	public static final String ONE = "1";
	public static final String TWO = "2";
	public static final String THREE = "3";
	public static final String FOUR = "4";
	public static final String FIVE = "5";
	public static final String SIX = "6";
	public static final String SEVEN = "7";
	public static final String EIGHT = "8";
	public static final String NINE = "9";
	public static final String TEN = "10";
	//*************************************************************************
	
	//*******************************用户状态常量********************************
	/**未开通*/
	public static final String USER_STATUS_ZERO = "0";
	/**正常*/
	public static final String USER_STATUS_ONE = "1";
	/**已注销*/
	public static final String USER_STATUS_TWO= "2";
	
	//*************************************************************************
	//*******************************用户类型常量********************************
	/**系统用户*/
	public static final String REL_TYPE_ZERO = "0";
	/**其他用户*/
	public static final String REL_TYPE_ONE = "1";
	/**公共账户*/
	public static final String REL_TYPE_TWO = "2";
	
	//*******************************用户注册来源********************************
	/**手机端*/
	public static final String USER_REG_ZERO = "100";
	/**WEB端*/
	public static final String USER_REG_ONE = "1";
	//*************************************************************************	
	//*******************************是否管理员**********************************
	/**普通用户*/
	public static final String USER_MANAGER_ZERO = "0";
	/**管理员*/
	public static final String USER_MANAGER_ONE = "1";
	/**超级管理员*/
	public static final String USER_MANAGER_TWO = "2";
	
	//*************************************************************************	
	/**国家类型*/
	public static final String AREA_TYPE_ZERO = "0";
	/**省类型*/
	public static final String AREA_TYPE_ONE = "1";
	/**市类型*/
	public static final String AREA_TYPE_TWO = "2";
	/**县类型*/
	public static final String AREA_TYPE_THREE = "3";
	
	public static final String DEFAULT_C_REL_ID = "system_user";
	
	/**有效*/
	public static final String INFORMATION_VALID = "1";
	/**无效*/
	public static final String INFOMATION_INVALID = "0";
	
	/**员工有效*/
	public static final String EMPLOYEE_VALID = "0";
	/**员工无效*/
	public static final String EMPLOYEE_INVALID = "1";
	
	//*************************************************************************	
	/**栏目类型0 爱车知识 1 用车知识 2公共资讯 3banner*/
	public static final String CHANNEL_STATE_ZERO = "0";
	public static final String CHANNEL_STATE_ONE = "1";
	public static final String CHANNEL_STATE_TWO = "2";
	public static final String CHANNEL_STATE_THREE = "3";
	
	/**栏目删除*/
	public static final String CHANNEL_IS_DEL = "0";
	/**栏目没有删除*/
	public static final String CHANNEL_IS_NOT_DEL = "1";
	/**秘钥**/
	public static final String SECRET_KEY = "www.utwo.cn";
	/**图像地址**/
	public static final String defaultGroupPortrait = "/upload/group_portrait/{xxxxxxxxx}.png";

	/**图像地址**/
	public static final String defaultInformationImg = SystemGlobals.getInstance().getProperty("defaultInformationImg");
	
	//***********************************openfire服务器*************************************
	public static final String OPENFIRE_URL = SystemGlobals.getInstance().getProperty("openfire.url");
	public static final String OPENFIRE_PORT = SystemGlobals.getInstance().getProperty("openfire.port");
	
	//***********************************文件上传下载*************************************
	public static final String DOWNLOAD_URL = SystemGlobals.getInstance().getProperty("download.url");
	public static final String UPLOAD_URL = SystemGlobals.getInstance().getProperty("upload.url");
	public static final String UPLOAD_METHOD = SystemGlobals.getInstance().getProperty("upload.method");
	public static final String SHARE_INFORMATION = SystemGlobals.getInstance().getProperty("share.information");
	
	public static final String UPLOAD_SAVE_PATH = "/usr/local/temp";
	

    public static final String JSON_SUCCESS = "{\"status\":\"10000\",\"info\":\"SUCCESS\",\"data\":{}}";
    public static final String JSON_ERROR = "{\"status\":\"99999\",\"info\":\"ERROR\",\"data\":{}}";
    
    public static final String APP_KEY = SystemGlobals.getInstance().getProperty("APP_KEY");
	
	
	public static final String SMS_URL = SystemGlobals.getInstance().getProperty("sms.api.url");
	public static final String SMS_PORT = SystemGlobals.getInstance().getProperty("sms.api.port");
	public static final String SMS_ACCOUNT_ID = SystemGlobals.getInstance().getProperty("sms.api.accountSid");
	public static final String SMS_ACCOUNT_TOKEN = SystemGlobals.getInstance().getProperty("sms.api.accountToken");
	public static final String SMS_APP_ID = SystemGlobals.getInstance().getProperty("sms.api.AppId");
	public static final String SMS_TEMPLATE_ID = SystemGlobals.getInstance().getProperty("sms.api.templateId");
	public static final String SMS_NOTIFY_TEMPLATE_ID = SystemGlobals.getInstance().getProperty("sms.api.notifytempId");
	
	public static final String HEAD_IMG_PATH=SystemGlobals.getInstance().getProperty("headImgPath");
	public static final String INDUSTRY_IMG_PATH=SystemGlobals.getInstance().getProperty("industryIcon");
	
	public static final String BP_FILE_PATH=SystemGlobals.getInstance().getProperty("bpFile");		
	public static final String LICENSE_FILE_PATH=SystemGlobals.getInstance().getProperty("licenseFile");
	public static final String BP_IMG_PATH=SystemGlobals.getInstance().getProperty("bpImg");
	public static final String IDENTIFY_FILE_PATH=SystemGlobals.getInstance().getProperty("identifyFilePath");
	public static final String LOGO_FILE_PATH=SystemGlobals.getInstance().getProperty("projectIcon");
}