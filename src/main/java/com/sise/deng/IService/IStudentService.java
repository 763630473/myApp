/** 
   * @工程名 : myApp
   * @文件名 : IStudentService.java
   * @工具包名：com.sise.deng.IService
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年11月1日 上午11:00:31
   * @版本信息：V1.0 
   */
package com.sise.deng.IService;

import com.sise.deng.Model.Student;

/**
   * @类 名： IStudentService
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年11月1日上午11:00:31
   * @修改备注：
   */
public interface IStudentService {
	void Add(Student student);
	Student GetStudent(String id);
}
