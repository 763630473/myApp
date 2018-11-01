/** 
   * @������ : myApp
   * @�ļ��� : HomeController.java
   * @���߰�����com.sise.deng.Controllers
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��10��31�� ����12:54:56
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.Controllers;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sise.deng.IService.IStudentService;
import com.sise.deng.Model.Student;

/**
   * @�� ���� HomeController
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��10��31������12:54:56
   * @�޸ı�ע��
   */
@Controller
@RequestMapping("/Home")
public class HomeController {
	@Autowired
	private IStudentService _studentService;
	@RequestMapping("/index")
    public String index(){
		Student studen=new Student();		
		studen.setID(java.util.UUID.randomUUID().toString());
		studen.setSex(1);
		studen.setAddress("����XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		studen.setClassName("��һһ��");
		studen.setEmail("7665483@qq.com");
		studen.setName("Jon");
		studen.setPhoneNumber("18827364263");
		studen.setAge(18);
		studen.setIsDelete(1);
		studen.setCreatDate(Date.valueOf(LocalDate.now()));
		studen.setSortNumber(0);
		System.out.println(studen.getID());
		_studentService.Add(studen);
        return "Main/Home";
    }
}
