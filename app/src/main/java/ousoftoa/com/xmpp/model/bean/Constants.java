package ousoftoa.com.xmpp.model.bean;


import ousoftoa.com.xmpp.utils.Util;

public class Constants {
	public final static boolean IS_DEBUG = true;
	public final static String SERVER_HOST = "123.57.28.18";
	public static String SERVER_NAME = "123.57.28.18";
	public final static int SERVER_PORT = 5222;
	public final static String PATH =  Util.getInstance().getExtPath()+"/xmpp";
	public final static String SAVE_IMG_PATH = PATH + "/images";
	public final static String SAVE_SOUND_PATH = PATH + "/sounds";
	public final static String LOGIN_CHECK = "check";
	public final static String LOGIN_ACCOUNT = "account";
	public final static String LOGIN_PWD = "pwd";
	public final static String USERINFO = "userinfo";
	public final static String SEND_TXT = "sendtxt";
	public final static String SEND_SOUND = "sendsound";
	public final static String SEND_IMG = "sendimg";
	public final static String SEND_LOCATION = "sendlocation";

	//状态
	public static String USER_NAME = "";
	public static String USER_PWD = "";
	public static String USER_MODE = "";
}
