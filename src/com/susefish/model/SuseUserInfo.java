package com.susefish.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * 实体类：用户信息
 * 对应数据库表：SUSE_USER_INFO
 * @author 闻化东
 */
@Entity
@Table(name="SUSE_USER_INFO")
public class SuseUserInfo implements Serializable
{

	private static final long serialVersionUID = 4194544364327218586L;
	private String userInfoId; //主键：用户信息ID，关联用户表主键USER_ID
	private String nickName; //用户昵称
	private String realName; //真实姓名
	private String enName; //英文名
	private String language; //使用语言
	private String gender; //性别 
	private Integer age; //年龄
	private Date birthday; //生日
	private String zodiac; //生肖
	private String constellation; //星座
	private String bloodType; //血型
	private String profession; //职业
	private String post; //职位
	private String education; //学历
	private String school; //学校
	private String tel; //电话
	private String phone; //手机
	private String email; //邮箱
	private String web; //个人主页
	private String hometown; //故乡
	private String residence; //所在地
	private String address; //地址
	private String postcode; //邮编
	private String signature; //个性签名
	private String note; //个人说明
	private SuseUser suseUser;
	
	public SuseUserInfo()
	{
		
	}
	
	@Id
	@GenericGenerator(name ="pkGenerator",strategy="foreign",parameters={@Parameter(name="property",value="suseUser")})
	@GeneratedValue(generator="pkGenerator")
	@Column(name="USER_INFO_ID")
	public String getUserInfoId()
	{
		return userInfoId;
	}

	public void setUserInfoId(String userInfoId)
	{
		this.userInfoId = userInfoId;
	}

	@Column(name="NICK_NAME")
	public String getNickName()
	{
		return nickName;
	}

	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}

	@Column(name="REAL_NAME")
	public String getRealName()
	{
		return realName;
	}

	public void setRealName(String realName)
	{
		this.realName = realName;
	}

	@Column(name="ENNAME")
	public String getEnName()
	{
		return enName;
	}

	public void setEnName(String enName)
	{
		this.enName = enName;
	}

	@Column(name="LANGUAGE")
	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	@Column(name="GENDER")
	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	@Column(name="AGE")
	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	@Column(name="BIRTHDAY")
	public Date getBirthday()
	{
		return birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	@Column(name="ZODIAC")
	public String getZodiac()
	{
		return zodiac;
	}

	public void setZodiac(String zodiac)
	{
		this.zodiac = zodiac;
	}

	@Column(name="CONSTELLATION")
	public String getConstellation()
	{
		return constellation;
	}

	public void setConstellation(String constellation)
	{
		this.constellation = constellation;
	}

	@Column(name="BLOOD_TYPE")
	public String getBloodType()
	{
		return bloodType;
	}

	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}

	@Column(name="PROFESSION")
	public String getProfession()
	{
		return profession;
	}

	public void setProfession(String profession)
	{
		this.profession = profession;
	}

	@Column(name="POST")
	public String getPost()
	{
		return post;
	}

	public void setPost(String post)
	{
		this.post = post;
	}

	@Column(name="EDUCATION")
	public String getEducation()
	{
		return education;
	}

	public void setEducation(String education)
	{
		this.education = education;
	}

	@Column(name="SCHOOL")
	public String getSchool()
	{
		return school;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	@Column(name="TEL")
	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	@Column(name="PHONE")
	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	@Column(name="EMAIL")
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Column(name="WEB")
	public String getWeb()
	{
		return web;
	}

	public void setWeb(String web)
	{
		this.web = web;
	}

	@Column(name="HOMETOWN")
	public String getHometown()
	{
		return hometown;
	}

	public void setHometown(String hometown)
	{
		this.hometown = hometown;
	}

	@Column(name="RESIDENCE")
	public String getResidence()
	{
		return residence;
	}

	public void setResidence(String residence)
	{
		this.residence = residence;
	}

	@Column(name="ADDRESS")
	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	@Column(name="POSTCODE")
	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}
	
	@Column(name="SIGNATURE")
	public String getSignature()
	{
		return signature;
	}

	public void setSignature(String signature)
	{
		this.signature = signature;
	}

	@Column(name="NOTE")
	public String getNote()
	{
		return note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

	@OneToOne(mappedBy="suseUserInfo")
	public SuseUser getSuseUser()
	{
		return suseUser;
	}

	public void setSuseUser(SuseUser suseUser)
	{
		this.suseUser = suseUser;
	}

	@Override
	public String toString()
	{
		return "SuseUserInfo [address=" + address + ", age=" + age
				+ ", birthday=" + birthday + ", bloodType=" + bloodType
				+ ", constellation=" + constellation + ", education="
				+ education + ", email=" + email + ", enName=" + enName
				+ ", gender=" + gender + ", hometown=" + hometown
				+ ", language=" + language + ", nickName=" + nickName
				+ ", note=" + note + ", phone=" + phone + ", post=" + post
				+ ", postcode=" + postcode + ", profession=" + profession
				+ ", realName=" + realName + ", residence=" + residence
				+ ", school=" + school + ", signature=" + signature + ", tel="
				+ tel + ", web=" + web + ", zodiac=" + zodiac + "]";
	}

}
