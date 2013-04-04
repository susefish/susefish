package com.susefish.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 实体类：用户登录
 * 对应数据库表：SUSE_USER
 * @author 闻化东
 */
@Entity
@Table(name="SUSE_USER")
public class SuseUser implements Serializable
{

	private static final long serialVersionUID = 7053512169224619914L;
	private String userId; //主键：用户ID，关联用户信息表主键USER_INFO_ID
	private String userName; //用户登录名
	private String password; //用户密码
	private int status; //用户状态（0有效  1停用）
	private Timestamp lastLoginTime; //最后登录时间
	private Timestamp addTime; //注册时间
	private SuseUserInfo suseUserInfo; //一对一主键关联
	
	public SuseUser()
	{
		
	}

	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@Column(name="USER_ID")
	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	@Column(name="USER_NAME")
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	@Column(name="PASSWORD")
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Column(name="STATUS")
	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	@Column(name="LAST_LOGIN_TIME")
	public Date getLastLoginTime()
	{
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime)
	{
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name="ADDTIME")
	public Timestamp getAddTime()
	{
		return addTime;
	}

	public void setAddTime(Timestamp addTime)
	{
		this.addTime = addTime;
	}

	@OneToOne(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public SuseUserInfo getSuseUserInfo()
	{
		return suseUserInfo;
	}

	public void setSuseUserInfo(SuseUserInfo suseUserInfo)
	{
		this.suseUserInfo = suseUserInfo;
	}

	@Override
	public String toString()
	{
		return "SuseUser <addTime=" + addTime + ", lastLoginTime="
				+ lastLoginTime + ", password=" + password + ", status="
				+ status + ", userId="
				+ userId + ", userName=" + userName + ">"
				+ ", suseUserInfo=" + suseUserInfo;
	}

}