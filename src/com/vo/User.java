package com.vo;

import org.springframework.web.multipart.MultipartFile;

public class User{

	//用户ID
	private String id;
	//用户名
	private String userName;
	//用户密码
	private String password;
	//手机
	private String mobile;
	//出生日期
	private String dateOfBirth;
	//性别
	private String sex;
	//地址
	private String address;
	//验证码
	private String verificationCode;
	//头像文件名称
	private String headPhotoName;
	//头像文件
	private MultipartFile headPhotoFile;

	public User(){
	}
	
	public User(String userName,String password,String verificationCode){
		this.userName=userName;
		this.password=password;
		this.verificationCode=verificationCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getHeadPhotoName() {
		return headPhotoName;
	}

	public void setHeadPhotoName(String headPhotoName) {
		this.headPhotoName = headPhotoName;
	}

	public MultipartFile getHeadPhotoFile() {
		return headPhotoFile;
	}

	public void setHeadPhotoFile(MultipartFile headPhotoFile) {
		this.headPhotoFile = headPhotoFile;
	}

}
