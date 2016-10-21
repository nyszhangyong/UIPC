package com.util;

/**字符串工具类*/
public class StringUtil {

	/**字符串是否为空*/
	public static boolean isEmpty(String string){
		if("".equals(string)|| null==string){
			return true;
		}else{
			return false;
		}
	}
}
