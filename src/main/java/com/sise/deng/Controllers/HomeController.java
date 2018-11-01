/** 
   * @工程名 : myApp
   * @文件名 : HomeController.java
   * @工具包名：com.sise.deng.Controllers
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年10月31日 下午12:54:56
   * @版本信息：V1.0 
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
   * @类 名： HomeController
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年10月31日下午12:54:56
   * @修改备注：
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
		studen.setAddress("广州XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		studen.setClassName("高一一班");
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
