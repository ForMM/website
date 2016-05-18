package com.website.common.content;

/**
 * 
 * 全局状态码表
 * 
 * @auther tangqing
 * 
 */
public class Status {  
	public static final int 	success_status 	= 10000;
	public static final String 	success_info 	= "操作成功";
	
	
	public static final int 	appkey_error_status 	= 10001;
	public static final String 	appkey_error_info 	= "缺少appkey";
	
	public static final int 	appsecurity_error_status 	= 10002;
	public static final String 	appsecurity_error_info 	= "非法的key值";
	
	/*public static final int 	sign_success_status 	= 10003;
	public static final String 	sign_success_info 	= "验证签名成功";*/
	
	public static final int 	sign_error_status 	= 10004;
	public static final String 	sign_error_info 	= "签名验证失败";
	
	public static final int 	time_error_status 	= 10005;
	public static final String 	time_error_info 	= "请求已过有效时限";
	
	public static final int 	timeFormat_error_status 	= 10006;
	public static final String 	timeFormat_error_info 	= "非法的时间参数";
	
	public static final int 	login_error_status 	= 10007;
	public static final String 	login_error_info 	= "用户名或密码错误！";
	
	public static final int 	account_error_status 	= 10008;
	public static final String 	account_error_info 	= "请输入账号";
	
	public static final int 	pwd_error_status 	= 10009;
	public static final String 	pwd_error_info 	= "请输入密码";
	
	public static final int 	send_checkcode_error_status 	= 10010;
	public static final String 	send_checkcode_error_info 	= "验证码发送失败";
	
	public static final int 	phone_fmt_error_status 	= 10011;
	public static final String 	phone_fmt_error_info 	= "手机号码格式错误";
	
	public static final int 	checkcode_empty_error_status 	= 10012;
	public static final String 	checkcode_empty_error_info 	= "验证码不能为空";
	
	public static final int 	checkcode_error_status 	= 10013;
	public static final String 	checkcode_error_info 	= "验证码错误";
	
	public static final int 	usertype_error_status 	= 10014;
	public static final String 	usertype_error_info 	= "用户角色错误";
	
	public static final int 	company_empty_error_status 	= 10015;
	public static final String 	company_empty_error_info 	= "请输入公司名称";
	
	public static final int 	position_empty_error_status 	= 10016;
	public static final String 	position_empty_error_info 	= "请输入职位名称";
	
	public static final int 	realname_empty_error_status 	= 10017;
	public static final String 	realname_empty_error_info 	= "请输入姓名";
	
	public static final int     phone_empty_error_status = 10018;
	public static final String 	phone_empty_error_info 	= "请输入手机号";
	
	public static final int     phone_exist_error_status = 10019;
	public static final String 	phone_exist_error_info 	= "该手机号已被注册";
	
	public static final int 	checkcode_type_error_status 	= 10020;
	public static final String 	checkcode_type_error_info 	= "验证码类型错误";
	
	public static final int     phone_not_exist_error_status = 10021;
	public static final String 	phone_not_exist_error_info 	= "该手机号未注册";
	
	public static final int     token_empty_error_status = 10022;
	public static final String 	token_empty_error_info 	= "token不能为空";
	
	public static final int     token_error_status = 10023;
	public static final String 	token_error_info 	= "无效的token";
	
	public static final int     user_not_exist_error_status = 10025;
	public static final String 	user_not_exist_error_info 	= "用户不存在";
	
	public static final int     img_type_error_status = 10026;
	public static final String 	img_type_error_info 	= "图片格式错误";
	
	public static final int     upload_error_status = 10027;
	public static final String 	upload_error_info 	= "文件上传失败";
	
	public static final int     file_empty_status = 10028;
	public static final String 	file_empty_info 	= "请选择文件";
	
	public static final int     oldtoken_empty_status = 10029;
	public static final String 	oldtoken_empty_info 	= "oldtoken不能为空";
	
	public static final int     reqid_empty_status = 10030;
	public static final String 	reqid_empty_info 	= "reqid不能为空";
	
	public static final int 	reqid_fmt_error_status 	= 10031;
	public static final String 	reqid_fmt_error_info 	= "reqid格式错误";
	
	public static final int     oldtoken_error_status = 10032;
	public static final String 	oldtoken_error_info 	= "oldtoken无效";
	
	public static final int     file_type_error_status = 10033;
	public static final String 	file_type_error_info 	= "文件格式错误";
	
	public static final int     balance_error_status = 10034;
	public static final String 	balance_error_info 	= "余额不足";
	
	public static final int     withdraw_error_status = 10035;
	public static final String 	withdraw_error_info 	= "提现金额不能为0";
	
	public static final int     no_ali_account_status = 10036;
	public static final String 	no_ali_account_info = "未设置支付宝账号";
	
	public static final int     no_withdraw_error_status=10037;
	public static final String  no_withdraw_error_info="未输入提现金额";
	
	public static final int     bpimg_error_status = 10038;
	public static final String 	bpimg_upload_error_info 	= "文件转图片失败";
	
	public static final int     advice_empty_error_status = 10039;
	public static final String 	advice_empty_error_info 	= "反馈内容不能为空";
	
	public static final int     project_not_exist_error_status = 10040;
	public static final String 	project_not_exist_error_info 	= "项目不存在";
	
	public static final int     project_id_empty_status = 10041;
	public static final String 	project_id_empty_info 	= "项目ID为空";
	
	public static final int     service_type_error_status = 10042;
	public static final String 	service_type_error_info 	= "服务类型错误";
	
	public static final int     service_type_empty_error_status = 10043;
	public static final String 	service_type_empty_error_info 	= "服务类不能为空";
	
	public static final int     service_welfare_error_status = 10045;
	public static final String 	service_welfare_error_info 	= "公益参数错误";
	
	public static final int     money_format_status = 10046;
	public static final String 	money_format_info 	= "金额格式错误";
	
	public static final int     service_error_status = 10047;
	public static final String 	service_error_info 	= "服务状态错误";
	
	public static final int     service_price_error_status = 10048;
	public static final String 	service_price_error_info 	= "服务价格不能小于0";
	
	public static final int     service_id_empty_status = 10049;
	public static final String 	service_id_empty_info 	= "服务ID不能为空";
	
	public static final int     service_no_exist_status = 10050;
	public static final String 	service_no_exist_info 	= "服务不存在";
	
	public static final int     finish_service_error_status = 10051;
	public static final String 	finish_service_error_info 	= "禁止完成他人的服务";
	
	public static final int     send_bp_error_status = 10052;
	public static final String 	send_bp_error_info 	= "已发送过BP，不能再次发送";
	
	public static final int     service_voice_no_public_status = 10053;
	public static final String 	service_voice_no_public_info 	= "语音通话服务未开通";
	
	public static final int     service_meet_no_public_status = 10054;
	public static final String 	service_meet_no_public_info 	= "见面约谈服务未开通";
}  

