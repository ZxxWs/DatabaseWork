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
	 * ������Action 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String CID;//��������ˮID
	private Boolean Cond;//�Ƿ�ɹ�����	
	private int AddTime;//����������Сʱ
	
	@Override
	public String execute() throws Exception {//S,

	
		return "S";
	}
	
	

	
	//��������
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
	
	public void setAddTime(int AddTime) {//���ﵥλΪСʱ��ǰ�˿���
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
























