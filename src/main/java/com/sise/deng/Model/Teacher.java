/** 
   * @������ : myApp
   * @�ļ��� : Teacher.java
   * @���߰�����com.sise.deng.Model
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��10��31�� ����7:15:11
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.BaseModel;

/**
   * @�� ���� Teacher
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��10��31������7:15:11
   * @�޸ı�ע��
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
