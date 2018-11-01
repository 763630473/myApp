/** 
   * @������ : myApp
   * @�ļ��� : Score.java
   * @���߰�����com.sise.deng.Model
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��10��31�� ����7:15:33
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.BaseModel;

/**
   * @�� ���� Score
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��10��31������7:15:33
   * @�޸ı�ע��
   */
public class Score extends BaseModel {
	private String CourseName;
	private String StudentId;
	private String TeacherId;
	private int Grade;
	private int Credit;
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getTeacherId() {
		return TeacherId;
	}
	public void setTeacherId(String teacherId) {
		TeacherId = teacherId;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public int getCredit() {
		return Credit;
	}
	public void setCredit(int credit) {
		Credit = credit;
	}
	
}
