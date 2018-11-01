/** 
   * @工程名 : myApp
   * @文件名 : Teacher.java
   * @工具包名：com.sise.deng.Model
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年10月31日 下午7:15:11
   * @版本信息：V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.BaseModel;

/**
   * @类 名： Teacher
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年10月31日下午7:15:11
   * @修改备注：
   */
public class Teacher extends BaseModel {
	private String Name;
	private int Sex;
	private String PhoneNumber;
	private String  ProfessionalTitle;
	private String Educational;
	private String Address;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSex() {
		return Sex;
	}
	public void setSex(int sex) {
		Sex = sex;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getProfessionalTitle() {
		return ProfessionalTitle;
	}
	public void setProfessionalTitle(String professionalTitle) {
		ProfessionalTitle = professionalTitle;
	}
	public String getEducational() {
		return Educational;
	}
	public void setEducational(String educational) {
		Educational = educational;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
