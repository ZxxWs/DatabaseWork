package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.RoomUpdate;
import TableClass.Room;

public class ChangeRoomInformation extends ActionSupport{

	/**
	 * 用于修改信息的Action
	 * 包括对Room类的Crud（无R）
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

	private String Crud;//操作类型C\U\D
	private int IsSuccess=0;//操作成功与否：1修改成功.-1修改失败	2删除成功.-2删除失败 3添加成功.-3删除失败
	
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

	//修改信息
	private void Change() {
		//调用房间信息更新的静态方法
		Boolean t=RoomUpdate.UpdateAllInformation(this.OldRno,this.Rtype,this.Rprice,this.Rcondition,this.Pno, this.NewRno);
		if(t) {
			this.IsSuccess=1;
		}else {
			this.IsSuccess=-1;
		}
	}
	
	private void Delete() {
		//使用Crud类删除Room对象
		Room room=new Room();
		Crud<Room> crud=new Crud<>();
		room.setRno(this.OldRno);
		Boolean t=crud.Delete(room);
		if(t) {//判断是否删除成功
			this.IsSuccess=2;
		}else {
			this.IsSuccess=-2;
		}
	}
	
	private void Add() {
		Room room=new Room(this.NewRno, this.Rtype, this.Rprice, this.Rcondition, this.Pno);
		Crud<Room> crud=new Crud<>();
		Boolean t=crud.Create(room);
		if(t) {//是否添加成功
			this.IsSuccess=3;
		}else {
			this.IsSuccess=-3;
		}
		
	
	}
	
	/***********************下面是set方法*****************************/
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
	/***********************下面是get方法*****************************/
	
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





























