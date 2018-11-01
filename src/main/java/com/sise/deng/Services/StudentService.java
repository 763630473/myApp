/** 
   * @工程名 : myApp
   * @文件名 : StudentService.java
   * @工具包名：com.sise.deng.Services
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年11月1日 上午11:01:05
   * @版本信息：V1.0 
   */
package com.sise.deng.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sise.deng.IRepository.IRepository;
import com.sise.deng.IService.IStudentService;
import com.sise.deng.Model.Student;

/**
   * @类 名： StudentService
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年11月1日上午11:01:05
   * @修改备注：
   */
@Service(value="StudentService")
public class StudentService implements IStudentService {
	@Autowired
	private IRepository<Student> _studentRepository;

	/** ( 非 Javadoc) 
	   * <p>Title: Add</p> 
	   * <p>Description: </p> 
	   * @param student 
	   * @see com.sise.deng.IService.IStudentService#Add(com.sise.deng.Model.Student) 
	   */
	public void Add(Student student) {
		_studentRepository.save(student);
		
	}

	/** ( 非 Javadoc) 
	   * <p>Title: GetStudent</p> 
	   * <p>Description: </p> 
	   * @param id
	   * @return 
	   * @see com.sise.deng.IService.IStudentService#GetStudent(java.lang.String) 
	   */
	public Student GetStudent(String id) {		
		return _studentRepository.get(Student.class,id);
	}
	
	
}
