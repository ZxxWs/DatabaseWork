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
	private int Rtype;
	private double Rprice;
	private int Rcondition;
	private String Pno;

	private String Crud;//��������C\U\D
	private Boolean IsSuccess=true;
	
	@Override
	public String execute() throws Exception {

		if(this.Crud=="C") {
			Change();
		}
		
		return "S";
	}

	//�޸���Ϣ
	private void Change() {
		
		String Type="";
		if(this.Rtype==0) {
			Type="���˼�";
		}else if (this.Rtype==1) {
			Type="˫�˼�";
		}else if (this.Rtype==2) {
			Type="�����ӵ㷿";
		}else if(this.Rtype==3){
			Type="˫���ӵ㷿";
		}else {
			this.IsSuccess=false;
			return;
		}
		this.IsSuccess=RoomUpdate.UpdateAllInformation(this.OldRno, Type, this.Rprice, this.Rcondition, this.Pno, this.NewRno);

	}
	
	
	
	
	
	/***********************������set����*****************************/
	public void setOldRno(String OldRno) {
		this.OldRno=OldRno;
	}
	
	public void setNewRno(String NewRno){
		this.NewRno=NewRno;
	}
	
	public void setRtype(int Rtype){
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

	public void setIsSuccess(Boolean IsSuccess) {
		this.IsSuccess=IsSuccess;
	}
	/***********************������get����*****************************/
	
	public String getOldRno() {
		return this.OldRno;
	}
	
	public String getNewRno() {
		return this.NewRno;
	}
	
	public int getRtype() {
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
	
	public Boolean getIsSuccess() {
		return this.IsSuccess;
	}
}





























