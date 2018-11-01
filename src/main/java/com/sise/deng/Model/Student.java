/** 
   * @������ : myApp
   * @�ļ��� : Student.java
   * @���߰�����com.sise.deng.Model
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��10��31�� ����7:11:26
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.BaseModel;

/**
   * @�� ���� Student
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��10��31������7:11:26
   * @�޸ı�ע��
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
