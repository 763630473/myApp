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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("/index")
    public String index(){
        return "Main/Home";
    }
}
