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
	 * �����޸���Ϣ��Action
	 * ������Guest���Crud��ֻ��RU��
	 * */
	
	private static final long serialVersionUID = 1L;

	private String Pass;
	private int IsSuccess=0;//�����ɹ����1�޸ĳɹ�.-1�޸�ʧ��	

	@Override
	public String execute() throws Exception {

		Change();
		return "S";
	}

	//�޸���Ϣ
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
	

	/***********************������set����*****************************/
	public void setPass(String Pass) {
		this.Pass=Pass;
	}
	
	public void setIsSuccess(int IsSuccess) {
		this.IsSuccess=IsSuccess;
	}
	
	/***********************������get����*****************************/
	
	public String getPass() {
		return this.Pass;
	}
	
	public int getIsSuccess() {
		return this.IsSuccess;
	}


}





























