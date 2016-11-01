package com.vo;

import org.springframework.web.multipart.MultipartFile;

public class User{

	private String id;
	private String userName;
	private String password;
	private String verificationCode;
	private String headPhotoName;
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
