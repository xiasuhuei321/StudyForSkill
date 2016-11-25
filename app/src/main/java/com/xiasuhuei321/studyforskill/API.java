package com.xiasuhuei321.studyforskill;


/**
 * Created by Luo on 2016/9/21.
 * desc:api
 */
public class API {

    public static final int LOG_NULL = 1002;
    public static final int REQUEST_SUCCESS = 200;

    private static final String BASEURL = "http://121.199.78.235/JRD_API/api.php?action=";
    public static final String PAYMONEY = "http://mgw.newei.cn";
    private static final String BASE_MONEY = "http://121.199.78.235/JRD_API/api.php?action=baill&state=";
    /**
     * 登录
     */
    public static final String LOGIN = BASEURL + "laogin";
    /**
     * 注册
     */
    public static final String REGISTER = BASEURL + "raegister";
    /**
     * 修改密码
     */
    public static final String CHANGE_PWD = BASEURL + "eadit_pass";
    /**
     * 上传用户信息
     */
    public static final String USER_EDIT = BASEURL + "aa_userinfo";

    /**
     * 查询用户信息
     */
    public static final String SEARCH_USER_INFO = BASEURL + "uaserinfo";

    /**
     * 上传头像
     */
    public static final String UPLOAD_HEAD_IMAGE = BASEURL + "pahoto";

    public static final String SHOW_IMAGE = BASEURL + "sahow_photo";

    public static String getBaseUrl() {
        return "http://121.199.78.235/JRD_API/";
    }

    /**
     * 行程
     */
    public static final String TRIP_INFO = BASEURL + "tarip";

    /**
     * 获取司机信息
     */
    public static final String SHOW_COMMENT = BASEURL + "sahow_driver";

    /**
     * 认证身份证信息
     */
    public static final String ID_CARD_PROVE = BASEURL + "caertification_info";

    /**
     * 身份证认证（多图上传）
     */
    public static final String IMAGE_PROVE_UPLOAD = BASEURL + "iadentity_img";

    /**
     * 退出登录
     */
    public static final String LOGOUT = BASEURL + "laogout&logout=logout";

    /**
     * 删除行程
     */
    public static final String DEL_TRIP = BASEURL + "dael_trip";

    /**
     * 查看金额
     */
    public static final String BALANCE = BASE_MONEY + "balance";

    /**
     * 上传发票信息
     */
    public static final String INVOICE = BASEURL + "aa_invoice";

    /**
     * 未开发票
     */
    public static final String SHOW_INVOICE = BASEURL + "naot_invoice";
    /**
     * 选择城市
     */
    public static final String CITY = BASEURL + "caity";
    /**
     * 微调金额
     */
    public static final String PRICE_EDIT = BASEURL + "parice_edit";
    /**
     * 微调金额
     */
    public static final String USER_LOCATION = BASEURL + "uaser_location";
    /**
     * 显示订单列表
     */
    public static final String SHOW_ORDER = BASEURL + "sahow_order";

    /**
     * 提交评论
     */
    public static final String COMMIT_COMMENTS = BASEURL + "caomments";

    /**
     * 请求司机的一些信息
     */
    public static final String SHOW_DRIVER_INFO = BASEURL + "aall_evaluation";

    /**
     * 投诉
     */
    public static final String COMPLAIN = BASEURL + "caomplaints";

    /**
     * 请求发送的订单信息
     */
    public static final String CAALL_LIST = BASEURL + "caall_list";

    /**
     * 请求取消的订单信息
     */
    public static final String CACLE_CALL = BASEURL + "cancel_call";
    /**
     * 司机接单
     */
    public static final String DA_ORDER = BASEURL + "da_order";

    /**
     * 司机接单后订单
     */
    public static final String ORDER_AFTER = BASEURL + "oarder_after";

    /**
     * 司机发布订单列表
     */
    public static final String D_CALL_LIST = BASEURL + "d_call_list";

    /**
     * 查看附近订单列表
     */
    public static final String D_SHOW_ORDER = BASEURL + "d_show_order";
    /**
     * 请求取消的订单信息
     */
    public static final String D_CACLE_CALL = BASEURL + "d_cncel_call";

    /**
     * 请求取消的订单信息
     */
    public static final String RECEINED_ORDER = BASEURL + "Received_order";

    /**
     * 司机上传地址
     */
    public static final String DRIVER_LOCATION = BASEURL + "dariver_location";
    /**
     * 司机确认收货
     */
    public static final String GOODS_D = BASEURL + "goods_d";

    /**
     * 用户确认收货
     */
    public static final String GOODS_U = BASEURL + "goods_u";

    /**
     * 司机确认用户是否收货
     */
    public static final String SHOW_IS_GOODS = BASEURL + "show_is_goods";

    public static final String SHOW_INVITE_CODE = BASEURL + "invite_code";

    /**
     * 实名认证接口
     */
    public static final String PROVE_REAL_NAME = BASEURL + "Real_name";
    /**
     * 支付回调
     */
    public static final String GET_WECHAT = BASEURL + "get_wechat";

}