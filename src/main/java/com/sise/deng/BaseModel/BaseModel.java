/** 
   * @������ : myApp
   * @�ļ��� : BaseModel.java
   * @���߰�����com.sise.deng.BaseModel
   * @��������: TODO
   * @������ ���˼Һ�
   * @����ʱ�䣺2018��10��31�� ����7:16:08
   * @�汾��Ϣ��V1.0 
   */
package com.sise.deng.BaseModel;

import java.sql.Date;

/**
   * @�� ���� BaseModel
   * @���������� TODO
   * @������Ϣ�� �˼Һ�
   * @����ʱ�䣺 2018��10��31������7:16:08
   * @�޸ı�ע��
   */
public class BaseModel extends Base {	
	private boolean IsDelete;
	private Date CreatDate;
	private int SortNumber;
	
	public boolean isIsDelete() {
		return IsDelete;
	}
	public void setIsDelete(boolean isDelete) {
		IsDelete = isDelete;
	}
	public Date getCreatDate() {
		return CreatDate;
	}
	public void setCreatDate(Date creatDate) {
		CreatDate = creatDate;
	}
	public int getSortNumber() {
		return SortNumber;
	}
	public void setSortNumber(int sortNumber) {
		SortNumber = sortNumber;
	}
	
}
