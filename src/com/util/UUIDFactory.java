package com.util;

import java.util.UUID;

/**
 * UUID=通用唯一识别码 (Universally Unique Identifier)
 */
public class UUIDFactory {

	public static void main(String[] args){
		getUUID();
	}
    public static String getUUID()
    {
    	//UUID由以下几部分的组合：
    	//ac6ad5f2-00d2-4c42-a5b1-f8ef29620c4e
    	//（1）当前日期和时间。
    	//（2）时钟序列。
    	//（3）全局唯一的IEEE机器识别号，如果有网卡，从网卡MAC地址获得，没有网卡以其他方式获得。
        String str=UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(str);
        return str;
    }
}
