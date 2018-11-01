/** 
   * @������ : myApp
   * @�ļ��� : StudentService.java
   * @���߰�����com.sise.deng.Services
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��11��1�� ����11:01:05
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sise.deng.IRepository.IRepository;
import com.sise.deng.IService.IStudentService;
import com.sise.deng.Model.Student;

/**
   * @�� ���� StudentService
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��11��1������11:01:05
   * @�޸ı�ע��
   */
@Service(value="StudentService")
public class StudentService implements IStudentService {
	@Autowired
	private IRepository<Student> _studentRepository;

	/** ( �� Javadoc) 
	   * <p>Title: Add</p> 
	   * <p>Description: </p> 
	   * @param student 
	   * @see com.sise.deng.IService.IStudentService#Add(com.sise.deng.Model.Student) 
	   */
	public void Add(Student student) {
		_studentRepository.save(student);
		
	}

	/** ( �� Javadoc) 
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
