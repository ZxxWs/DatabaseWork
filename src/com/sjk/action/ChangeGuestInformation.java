package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.GuestUpdate;
import Dispose.PrincipalUpdate;
import Dispose.RoomUpdate;
import TableClass.Principal;
import TableClass.Room;
import javassist.bytecode.CodeIterator.Gap;

public class ChangeGuestInformation extends ActionSupport{

	/**
	 * �����޸���Ϣ��Action
	 * ������Guest���Crud��ֻ��RU��
	 * */
	
	private static final long serialVersionUID = 1L;
	private String OldGno;
	private String NewGno;
	private String Gname;
	private String Gtel;

	private int IsSuccess=0;//�����ɹ����1�޸ĳɹ�.-1�޸�ʧ��	2ɾ���ɹ�.-2ɾ��ʧ�� 3��ӳɹ�.-3ɾ��ʧ��
	
	@Override
	public String execute() throws Exception {

		Change();
		return "S";
	}

	//�޸���Ϣ
	private void Change() {

		//���ù˿���Ϣ���µľ�̬����
		Boolean t=GuestUpdate.UpdateAllInformation(this.NewGno, this.Gname, this.Gtel, this.OldGno);
		if(t) {
			this.IsSuccess=1;
		}else {
			this.IsSuccess=-1;
		}
	}
	

	/***********************������set����*****************************/
	public void setOldGno(String OldGno) {
		this.OldGno=OldGno;
	}
	
	public void setNewGno(String NewGno) {
		this.NewGno=NewGno;
	}
	public void setGname(String Gname) {
		this.Gname=Gname;
	}
	
	public void setGtel(String Gtel) {
		this.Gtel=Gtel;
	}
	
	public void setIsSuccess(int IsSuccess) {
		this.IsSuccess=IsSuccess;
	}
	
	/***********************������get����*****************************/
	
	public String getOldGno() {
		return this.OldGno;
	}
	
	public String getNewGno() {
		return this.NewGno;
	}
	
	public String getGname() {
		return this.Gname;
	}
	
	public String getGtel() {
		return this.Gtel;
	}
	
	public int getIsSuccess() {
		return this.IsSuccess;
	}
}





























