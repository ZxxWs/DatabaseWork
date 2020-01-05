package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.recompile;

import Dispose.Crud;
import Dispose.RoomUpdate;
import TableClass.Room;

public class ChangeRoomInformation extends ActionSupport{

	/**
	 * ����չʾ�޸���Ϣ��Action
	 * ����Crud
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
	private int IsSuccess=0;
	
	@Override
	public String execute() throws Exception {

		System.out.print(this.Crud);
		if(this.Crud.equals("C")) {
			Change();
		}
		
		return "S";
	}

	//�޸���Ϣ
	private void Change() {
		Boolean t=RoomUpdate.UpdateAllInformation(this.OldRno,this.Rtype,this.Rprice,this.Rcondition,this.Pno, this.NewRno);
		if(t) {
			this.IsSuccess=1;
		}else {
			this.IsSuccess=-1;
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





























