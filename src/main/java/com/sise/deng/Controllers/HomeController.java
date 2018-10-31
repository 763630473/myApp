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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("/index")
    public String index(){
        return "Main/Home";
    }
}
