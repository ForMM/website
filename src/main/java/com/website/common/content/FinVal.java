package com.website.common.content;

public class FinVal {
	
	/**
	 * 用户类型：
	 * 创业者
	 * */
	public static final int 	USER_TYPE_EP 	= 1;
	
	/**
	 * 用户类型：
	 * 投资人
	 * */
	public static final int 	USER_TYPE_INVESTOR 	= 0;
	
	/**
	 * accesstoken保存时间：7天
	 * */
	public static final int 	TOKEN_EXPIRECE 	= 60*60*24*7;//单位，秒
	
	//public static final int 	TOKEN_EXPIRECE 	= 60;//单位，秒
	/**
	 * 用户手机号对应的accesstoken
	 * */
	public static final String 	TOKEN_MAP 	= "TOKEN_MAP";
	
	/**
	 * 验证码位数
	 * */
	public static final int     CHECK_CODE_NUM=5;
	
	/**
	 * 验证码类型
	 * 注册验证码0
	 * */
	public static final int     REGIST_CHECK_CODE_TYPE=0;
	/**
	 * 验证码类型
	 * 修改密码验证码1
	 * */
	public static final int     RESET_PWD_CHECK_CODE_TYPE=1;
	
	/**
	 * 验证码有效时间，分钟
	 * */
	public static final String     CHECK_CODE_INVALID_TIME="5";
	
	/**
	 * redis公共静态信息key
	 * */
	public static final String     REDIS_COMMON_KEY="COMMON";
	
	/**
	 * redis行业类别key
	 * */
	public static final String     REDIS_INDUSTRY_KEY="ALL_INDUSTRY";
	
	/**
	 * redis投资阶段key
	 * */
	public static final String     REDIS_STEP_KEY="ALL_STAGE";
	/**
	 * redis交易状态信息
	 * */
	public static final String	   REDIS_TRADE_MAP = "TRADE_MAP";
	
	/**
	 * 是否已完善数据
	 * 未完善0
	 * */
	public static final int     UNCOMPLETE=0;
	/**
	 * 是否已完善数据
	 * 已完善1
	 * */
	public static final int     COMPLETE=1;
	
	/**
	 * 文件类型
	 * 头像
	 * */
	public static final String     FILE_TYPE_HEAD="0";
	
	/**
	 * 文件类型
	 * 行业类别图片
	 * */
	public static final String     FILE_TYPE_INDUSTRY="1";
	/**
	 * 文件类型
	 * 职业认证图片
	 * */
	public static final String     FILE_TYPE_IDENTIFY="3";
	
	/**
	 * 文件类型
	 * BPfile(ppt)
	 * */
	public static final String     FILE_TYPE_BP="2";
	
	/**
	 * 文件类型
	 * BPImg(png)
	 * */
	public static final String     FILE_TYPE_BPIMG="4";
	
	/**
	 * 文件类型
	 * 工商资料图licensefile(jpg.png.gif)
	 * */
	public static final String     FILE_TYPE_LICENSE="5";
	
	/**
	 * 文件类型
	 * 项目LOGO(jpg.png.gif)
	 * */
	public static final String     FILE_TYPE_LOGO="6";
	
	
	public static final int IDENTIFY_NOT= -1;
	public static final String IDENTIFY_NOT_INFO= "未认证";
	/**
	 * 职业认证成功状态，和数据库匹配，
	 * 认证结果：0发起认证，1取消认证，2认证中、3认证失败、4认证成功
	 * 
	 * */
	public static final int IDENTIFY_SUBMIT= 0;
	public static final String IDENTIFY_SUBMIT_INFO= "已发起认证";
	/**
	 * 职业认证状态，和数据库匹配，
	 * 认证结果：0发起认证，1取消认证，2认证中、3认证失败、4认证成功
	 * 
	 * */
	public static final int IDENTIFY_CANCEL= 1;
	public static final String IDENTIFY_CANCEL_INFO= "已取消认证";
	/**
	 * 职业认证状态，和数据库匹配，
	 * 认证结果：0发起认证，1取消认证，2认证中、3认证失败、4认证成功
	 * 
	 * */
	public static final int IDENTIFY_ING= 2;
	public static final String IDENTIFY_ING_INFO="认证中";
	/**
	 * 职业认证状态，和数据库匹配，
	 * 认证结果：0发起认证，1取消认证，2认证中、3认证失败、4认证成功
	 * 
	 * */
	public static final int IDENTIFY_FAILURE= 3;
	public static final String IDENTIFY_FAILURE_INFO="认证失败";
	/**
	 * 职业认证状态，和数据库匹配，
	 * 认证结果：0发起认证，1取消认证，2认证中、3认证失败、4认证成功
	 * 
	 * */
	public static final int IDENTIFY_SUCCESS= 4;
	public static final String IDENTIFY_SUCCESS_INFO="认证成功";
	/**
	 * 接口返回职业认证状态
	 * 1，已认证
	 * 0，未认证
	 * */
	public static final int IDENTIFY_RESULT_SUCCESS= 1;
	/**
	 * 接口返回职业认证状态
	 * 1，已认证
	 * 0，未认证
	 * */
	public static final int IDENTIFY_RESULT_ERROR= 0;
	
	/**
	 * 提现状态
	 * 0已提交
	 * */
	public static final int WITH_DRAW_COMMIT=0;
	/**
	 * 提现状态
	 * 1已完成
	 * */
	public static final int WITH_DRAW_COMPLETE=1;
	/**
	 * 是否是支付宝支付
	 * 1是
	 * */
	public static final int IS_ALIPAY=1;
	
	/**
	 * 默认翻页数据
	 * 页码
	 * */
	public static final int DEFAULT_PAGE=1;
	
	/**
	 * 默认翻页数据
	 * 每页条数
	 * */
	public static final int DEFAULT_PAGESIZE=20;
	
	/**
	 * 接受到的项目未读状态
	 * 0未读
	 * */
	public static final int PROJECT_UNREAD=0;
	/**
	 * 接受到的项目未读状态
	 * 1已读
	 * */
	public static final int PROJECT_READ=1;
	
	/**
	 * 项目是否公开
	 * 0未公开1公开
	 * */
	public static final int PROJECT_PUBLIC=1;
	
	/**
	 * 项目是否公开
	 * 0未公开1公开
	 * */
	public static final int PROJECT_UN_PUBLIC=0;
	/**
	 * 项目是否被收藏
	 * 0未收藏1已收藏
	 * */
	public static final int PROJECT_UN_FAV=0;
	/**
	 * 项目是否被收藏
	 * 0未收藏1已收藏
	 * */
	public static final int PROJECT_FAV=1;
	/**
	 *服务状态
	 *0未开通
	 * */
	public static final int SERVICE_UN_PUBLIC=0;
	/**
	 *服务状态
	 *1已开通
	 * */
	public static final int SERVICE_PUBLIC=1;
	/**
	 *服务状态
	 *2开通并公益 
	 * */
	public static final int SERVICE_PUBLIC_WELFARE=2;
	/**
	 *服务是否公益
	 *0不公益
	 * */
	public static final int SERVICE_UN_WELFARE=0;
	/**
	 *服务是否公益
	 *1公益
	 * */
	public static final int SERVICE_WELFARE=1;
	/**
	 * 服务状态
	 * 0未处理
	 * */
	public static final int SERVICE_UN_HANDLE=0;
	
	/**
	 * 服务状态
	 * 1已处理
	 * */
	public static final int SERVICE_HANDLE=1;
	/**
	 * 服务类型
	 * 0语音通话
	 * 1见面约谈
	 * */
	public static final int SERVICE_TYPE_VOICE=0;
	public static final String SERVICE_TYPE_VOICE_NAME="语音通话";
	/**
	 * 服务类型
	 * 0语音通话
	 * 1见面约谈
	 * */
	public static final int SERVICE_TYPE_MEET=1;
	public static final String SERVICE_TYPE_MEET_NAME="见面约谈";
	
	/**
	 * 是否发送过BP
	 * 0未发送过，1已发送过
	 * */
	public static final int SEND_BP_NO=0;
	/**
	 * 是否发送过BP
	 * 0未发送过，1已发送过
	 * */
	public static final int SEND_BP_YES=1;
	/**
	 * 项目是否是自己的
	 * 0不是，1是
	 * */
	public static final int PROJECT_IS_OWN_NO=0;
	/**
	 * 项目是否是自己的
	 * 0不是，1是
	 * */
	public static final int PROJECT_IS_OWN_YES=1;
	/**
	 * 交易类型：-1免费0支付宝支付1微信支付
	 * */
	public static final int TRADE_FREE=-1;
	/**
	 * 交易类型：-1免费0支付宝支付1微信支付
	 * */
	public static final int TRADE_ALIPAY=0;
	/**
	 * 交易类型：-1免费0支付宝支付1微信支付
	 * */
	public static final int TRADE_WECHATPAY=1;
	/**
	 * 是否已评价
	 * 0未评价1已评价
	 * */
	public static final int EVALUATE_NO=0;
	/**
	 * 是否已评价
	 * 0未评价1已评价
	 * */
	public static final int EVALUATE_YES=1;

	
}
