package com.login.model;

public class LoginCredentials {
	
	private String userName;
	private String password;
	private String confirmPassword;
	private int mobileNo;
	private String emailId;
	
	
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "LoginCredentials [userName=" + userName + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", mobileNo=" + mobileNo + ", emailId=" + emailId + "]";
	}
	
	
	

}
