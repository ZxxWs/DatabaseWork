package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.PrincipalUpdate;
import Dispose.RoomUpdate;
import TableClass.Principal;
import TableClass.Room;

public class ChangeGuestInformation extends ActionSupport{

	/**
	 * �����޸���Ϣ��Action
	 * ������Guest���Crud��ֻ��RU��
	 * */
	
	private static final long serialVersionUID = 1L;
	private String OldPno;
	private String NewPno;
	private String Pname;

	private String Crud;//��������C\U\D
	private int IsSuccess=0;//�����ɹ����1�޸ĳɹ�.-1�޸�ʧ��	2ɾ���ɹ�.-2ɾ��ʧ�� 3��ӳɹ�.-3ɾ��ʧ��
	
	@Override
	public String execute() throws Exception {

		Change();
		return "S";
	}

	//�޸���Ϣ
	private void Change() {
		//����Ա����Ϣ���µľ�̬����
		Boolean t=PrincipalUpdate.UpdateAllInformation(this.NewPno,this.Pname,this.OldPno);
		if(t) {
			this.IsSuccess=1;
		}else {
			this.IsSuccess=-1;
		}
	}
	

	/***********************������set����*****************************/
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
	
	/***********************������get����*****************************/
	
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





























