package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.recompile;

import Dispose.Crud;
import Dispose.RoomUpdate;
import TableClass.Room;

public class ChangeRoomInformation extends ActionSupport{

	/**
	 * 用于展示修改信息的Action
	 * 包括Crud
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

	private String Crud;//操作类型C\U\D
	private Boolean IsSuccess=true;
	
	@Override
	public String execute() throws Exception {

		if(this.Crud=="C") {
			Change();
		}
		
		return "S";
	}

	//修改信息
	private void Change() {
		
		String Type="";
		if(this.Rtype==0) {
			Type="单人间";
		}else if (this.Rtype==1) {
			Type="双人间";
		}else if (this.Rtype==2) {
			Type="单人钟点房";
		}else if(this.Rtype==3){
			Type="双人钟点房";
		}else {
			this.IsSuccess=false;
			return;
		}
		this.IsSuccess=RoomUpdate.UpdateAllInformation(this.OldRno, Type, this.Rprice, this.Rcondition, this.Pno, this.NewRno);

	}
	
	
	
	
	
	/***********************下面是set方法*****************************/
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
	/***********************下面是get方法*****************************/
	
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





























