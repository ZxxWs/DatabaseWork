package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.RoomUpdate;
import TableClass.Room;

public class ChangeRoomInformation extends ActionSupport{

	/**
	 * �����޸���Ϣ��Action
	 * ������Room���Crud����R��
	 * 
	 * 
	 * */
	private static final long serialVersionUID = 1L;
	private String OldRno;
	private String NewRno;
	private String Rtype;
	private double Rprice;
	private int Rcondition;
	private String Pno;

	private String Crud;//��������C\U\D
	private int IsSuccess=0;//�����ɹ����1�޸ĳɹ�.-1�޸�ʧ��	2ɾ���ɹ�.-2ɾ��ʧ�� 3��ӳɹ�.-3ɾ��ʧ��
	
	@Override
	public String execute() throws Exception {

		System.out.print("this.Crud");
		System.out.println(this.Crud);
		if(this.Crud.equals("C")) {
			Change();
		}else if (this.Crud.equals("D")) {
			Delete();
		}else if (this.Crud.equals("A")) {
			Add();
		}else {
			//??
		}
		
		return "S";
	}

	//�޸���Ϣ
	private void Change() {
		//���÷�����Ϣ���µľ�̬����
		Boolean t=RoomUpdate.UpdateAllInformation(this.OldRno,this.Rtype,this.Rprice,this.Rcondition,this.Pno, this.NewRno);
		if(t) {
			this.IsSuccess=1;
		}else {
			this.IsSuccess=-1;
		}
	}
	
	private void Delete() {
		//ʹ��Crud��ɾ��Room����
		Room room=new Room();
		Crud<Room> crud=new Crud<>();
		room.setRno(this.OldRno);
		Boolean t=crud.Delete(room);
		if(t) {//�ж��Ƿ�ɾ���ɹ�
			this.IsSuccess=2;
		}else {
			this.IsSuccess=-2;
		}
	}
	
	private void Add() {
		Room room=new Room(this.NewRno, this.Rtype, this.Rprice, this.Rcondition, this.Pno);
		Crud<Room> crud=new Crud<>();
		Boolean t=crud.Create(room);
		if(t) {//�Ƿ���ӳɹ�
			this.IsSuccess=3;
		}else {
			this.IsSuccess=-3;
		}
		
	
	}
	
	/***********************������set����*****************************/
	public void setOldRno(String OldRno) {
		this.OldRno=OldRno;
	}
	
	public void setNewRno(String NewRno){
		this.NewRno=NewRno;
	}
	
	public void setRtype(String Rtype){
		this.Rtype=Rtype;
	}
	
	public void setRprice(double Rprice){
		this.Rprice=Rprice;
	}
	
	public void setRcondition(int Rcondition){
		this.Rcondition=Rcondition;
	}
	
	public void setPno(String Pno){
		this.Pno=Pno;
	}

	public void setCrud(String Crud) {
		this.Crud=Crud;
	}

	public void setIsSuccess(int IsSuccess) {
		this.IsSuccess=IsSuccess;
	}
	/***********************������get����*****************************/
	
	public String getOldRno() {
		return this.OldRno;
	}
	
	public String getNewRno() {
		return this.NewRno;
	}
	
	public String getRtype() {
		return this.Rtype;
	}
	
	public double getRprice() {
		return this.Rprice;
	}
	
	public int getRcondition() {
		return this.Rcondition;
	}
	
	public String getPno() {
		return this.Pno;
	}
	
	public String getCrud() {
		return this.Crud;
	}
	
	public int getIsSuccess() {
		return this.IsSuccess;
	}
}





























