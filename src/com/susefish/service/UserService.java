/**
 * @author 闻化东
 */
package com.susefish.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.susefish.dao.Dao;
import com.susefish.model.*;
import com.susefish.util.DateUtil;

/**
 * 业务层：用户操作相关
 * @author 闻化东
 */
@Service("userService")
public class UserService
{
	
	@Resource(name="dao")
	private Dao dao;
	
	//用户注册
	public String userRegister(SuseUser suseUser, Map<String, Object> request)
	{
		String result = "success";
		try
		{
			SuseUser su = new SuseUser();
			su.setUserName("kill");
			su.setPassword("123");
			su.setStatus(0);
			su.setAddTime(DateUtil.getTimestamp());
			
			SuseUserInfo sui = new SuseUserInfo();
			sui.setNickName("凯");
			sui.setRealName("张");
			sui.setAge(28);
			
			su.setSuseUserInfo(sui);
			sui.setSuseUser(su);
			
			dao.save(su);
			
			//SuseUser su = new SuseUser();
			//su.setUserId("402881b73d76e992013d76e9b86d0001");
			//SuseUser su = (SuseUser)dao.get(SuseUser.class, "402881b73d76e992013d76e9b86d0001");
			//System.out.println(su);
			
			/*Object[] obj = {"402881b73d76e17e013d76e3ef3a0001"};
			List<SuseUser> suList = dao.findByHql("from SuseUser t left join fetch t.suseUserInfo where t.userId=?", obj);
			for(SuseUser ss : suList)
			{
				System.out.println(ss);
			}*/
		}
		catch (SQLException e)
		{
			System.out.println("------------------------");
			result = "error";
			e.printStackTrace();
		}
		return result;
	}
	
}