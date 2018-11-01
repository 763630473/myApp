/** 
   * @工程名 : myApp
   * @文件名 : Dict.java
   * @工具包名：com.sise.deng.Model
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年10月31日 下午7:23:58
   * @版本信息：V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.Base;
import com.sise.deng.BaseModel.BaseModel;

/**
   * @类 名： Dict
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年10月31日下午7:23:58
   * @修改备注：
   */
public class Dict extends Base {
	private String Name;
	private String Key;
	private String Description;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
