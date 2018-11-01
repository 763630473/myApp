/** 
   * @工程名 : myApp
   * @文件名 : Student.java
   * @工具包名：com.sise.deng.Model
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年10月31日 下午7:11:26
   * @版本信息：V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.BaseModel;

/**
   * @类 名： Student
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年10月31日下午7:11:26
   * @修改备注：
   */
public class Student extends BaseModel implements java.io.Serializable{
	private String Name;
	private int Sex;
	private String Address;
	private int Age;
	private String Email;
	private String PhoneNumber;
	private String ClassName;
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
}
