/** 
   * @������ : myApp
   * @�ļ��� : Dict.java
   * @���߰�����com.sise.deng.Model
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��10��31�� ����7:23:58
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.Model;

import com.sise.deng.BaseModel.Base;
import com.sise.deng.BaseModel.BaseModel;

/**
   * @�� ���� Dict
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��10��31������7:23:58
   * @�޸ı�ע��
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
