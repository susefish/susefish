/**
 * @author 闻化东
 */
package com.susefish.action;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.susefish.service.UserService;
import com.susefish.model.*;

/**
 * Struts2控制器：用户中心操作
 * @author 闻化东
 */
public class UserAction extends ActionSupport implements RequestAware,SessionAware,ServletResponseAware,ApplicationAware
{
	
	private static final long serialVersionUID = -1866765459292509484L;
	
	//JSP内置对象
	private Map<String, Object> request;
	private Map<String, Object> session;
	private HttpServletResponse response;
	private Map<String, Object> application;
	
	//业务层
	@Resource(name="userService")
	private UserService userService;
	
	//实体类
	private SuseUser suseUser;
	
	static int i=0;
	//用户注册
	public String userRegister()
	{
		/*i++;
		if(i>1)
		{
			return "success";
		}
		else
		{
			userService.userRegister(suseUser, request);
		}*/
		System.out.println("!!!!!!!!!!!!!!!!");
		return userService.userRegister(suseUser, request);
	}
	
	public Map<String, Object> getRequest()
	{
		return request;
	}
	
	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
	}	
	
	public Map<String, Object> getSession()
	{
		return session;
	}
	
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}
	public HttpServletResponse getServletResponse()
	{
		return response;
	}

	public void setServletResponse(HttpServletResponse response)
	{
		this.response = response;
	}

	public Map<String, Object> getApplication()
	{
		return application;
	}

	public void setApplication(Map<String, Object> application)
	{
		this.application = application;
	}

	public SuseUser getSuseUser()
	{
		return suseUser;
	}

	public void setSuseUser(SuseUser suseUser)
	{
		this.suseUser = suseUser;
	}
	
}
