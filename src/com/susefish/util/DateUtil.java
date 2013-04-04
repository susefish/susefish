/**
 * @author 闻化东
 */
package com.susefish.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间日期工具类
 * @author 闻化东
 */
public class DateUtil
{
	
	//获取一个Timestamp类型的系统时间
    public static Timestamp getTimestamp()
    {   
    	Date dt = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return Timestamp.valueOf(df.format(dt));
    }
    
    /*
     * 获取一个sql.Date类型系统时间
     */
    public static java.sql.Date getSystemTime()
    {
    	return new java.sql.Date(new java.util.Date().getTime());
    }
    
    /*
     * 获取一个String类型的系统时间
     * 参数格式范例: format = "yyyy-MM-dd HH:mm:ss" | "yyyy-MM-dd"
     */
    public static String getSystemTime(String format)
    {
    	return new SimpleDateFormat(format).format(Calendar.getInstance().getTime());
    }
    
}
