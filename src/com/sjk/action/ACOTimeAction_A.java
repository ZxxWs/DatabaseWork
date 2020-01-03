package com.sjk.action;

import java.math.BigInteger;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.CheckInUpdate;
import Dispose.Crud;
import Dispose.RoomUpdate;
import TableClass.CheckIn;
import TableClass.Room;

public class ACOTimeAction_A extends ActionSupport{

	/**
	 * 续房的Action 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String CID;//操作的流水ID
	private Boolean Cond;//是否成功操作	
	private int AddTime;//传过来的是小时
	
	@Override
	public String execute() throws Exception {//S,

	
		return "S";
	}
	
	

	
	//续房方法
	public Boolean Add() {
		Boolean Tag=new Boolean(true);
		
		
		
		return Tag;
	}
	
	
	
	public void setCID(String CID) {
	    this.CID=CID;

		System.out.println("CID");
		System.out.print(CID);
	}
	
	public void setCond(Boolean Cond) {
	    this.Cond=Cond;

	}
	
	public void setAddTime(int AddTime) {//这里单位为小时，前端控制
		this.AddTime=AddTime;
		System.out.println("AddTime");
		System.out.print(AddTime);
	}
	
	
	public String getCID(){         
		return this.CID;
		
	}

	public Boolean getCond() {
		return this.Cond;
	}
	
	
	public int getAddTime() {
		return this.AddTime;
	}
	
}
























