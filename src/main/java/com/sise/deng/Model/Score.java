/** 
   * @工程名 : myApp
   * @文件名 : Score.java
   * @工具包名：com.sise.deng.Model
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年10月31日 下午7:15:33
   * @版本信息：V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.BaseModel;

/**
   * @类 名： Score
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年10月31日下午7:15:33
   * @修改备注：
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
