/** 
   * @������ : myApp
   * @�ļ��� : IStudentService.java
   * @���߰�����com.sise.deng.IService
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��11��1�� ����11:00:31
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.IService;

import com.sise.deng.Model.Student;

/**
   * @�� ���� IStudentService
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��11��1������11:00:31
   * @�޸ı�ע��
   */
public interface IStudentService {
	void Add(Student student);
	Student GetStudent(String id);
}
