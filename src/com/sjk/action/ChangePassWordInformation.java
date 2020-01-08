package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.GuestUpdate;
import Dispose.PasswordUpdate;
import Dispose.PrincipalUpdate;
import Dispose.RoomUpdate;
import TableClass.Principal;
import TableClass.Room;
import javassist.bytecode.CodeIterator.Gap;

public class ChangePassWordInformation extends ActionSupport{

	/**
	 * 用于修改信息的Action
	 * 包括对Guest类的Crud（只有RU）
	 * */
	
	private static final long serialVersionUID = 1L;

	private String Pass;
	private int IsSuccess=0;//操作成功与否：1修改成功.-1修改失败	

	@Override
	public String execute() throws Exception {

		Change();
		return "S";
	}

	//修改信息
	private void Change() {

		 if(PasswordUpdate.ChangePassWord(this.Pass)) {
			this.IsSuccess=1; 
		 }else {
			this.IsSuccess=-1;
		}
		 if(this.Pass==null) {
			 this.IsSuccess=0;
		 }
		
	}
	

	/***********************下面是set方法*****************************/
	public void setPass(String Pass) {
		this.Pass=Pass;
	}
	
	public void setIsSuccess(int IsSuccess) {
		this.IsSuccess=IsSuccess;
	}
	
	/***********************下面是get方法*****************************/
	
	public String getPass() {
		return this.Pass;
	}
	
	public int getIsSuccess() {
		return this.IsSuccess;
	}


}





























