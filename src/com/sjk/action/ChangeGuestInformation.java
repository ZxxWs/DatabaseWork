package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.PrincipalUpdate;
import Dispose.RoomUpdate;
import TableClass.Principal;
import TableClass.Room;

public class ChangeGuestInformation extends ActionSupport{

	/**
	 * 用于修改信息的Action
	 * 包括对Guest类的Crud（只有RU）
	 * */
	
	private static final long serialVersionUID = 1L;
	private String OldPno;
	private String NewPno;
	private String Pname;

	private String Crud;//操作类型C\U\D
	private int IsSuccess=0;//操作成功与否：1修改成功.-1修改失败	2删除成功.-2删除失败 3添加成功.-3删除失败
	
	@Override
	public String execute() throws Exception {

		Change();
		return "S";
	}

	//修改信息
	private void Change() {
		//调用员工信息更新的静态方法
		Boolean t=PrincipalUpdate.UpdateAllInformation(this.NewPno,this.Pname,this.OldPno);
		if(t) {
			this.IsSuccess=1;
		}else {
			this.IsSuccess=-1;
		}
	}
	

	/***********************下面是set方法*****************************/
	public void setOldPno(String OldPno) {
		this.OldPno=OldPno;
	}
	
	public void setNewPno(String NewPno) {
		this.NewPno=NewPno;
	}

	public void setPname(String Pname) {
		this.Pname=Pname;
	}
	
	public void setCrud(String Crud) {
		this.Crud=Crud;
	}

	public void setIsSuccess(int IsSuccess) {
		this.IsSuccess=IsSuccess;
	}
	
	/***********************下面是get方法*****************************/
	
	public String getOldPno() {
		return this.OldPno;
	}
	
	public String getNewPno() {
		return this.NewPno;
	}
	
	public String getPname() {
		return this.Pname;
	}
	
	public String getCrud() {
		return this.Crud;
	}
	
	public int getIsSuccess() {
		return this.IsSuccess;
	}
}





























