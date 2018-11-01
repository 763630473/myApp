/** 
   * @工程名 : myApp
   * @文件名 : BaseModel.java
   * @工具包名：com.sise.deng.BaseModel
   * @功能描述: TODO
   * @创建人 ：邓家海
   * @创建时间：2018年10月31日 下午7:16:08
   * @版本信息：V1.0 
   */
package com.sise.deng.BaseModel;

import java.sql.Date;

/**
   * @类 名： BaseModel
   * @功能描述： TODO
   * @作者信息： 邓家海
   * @创建时间： 2018年10月31日下午7:16:08
   * @修改备注：
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
