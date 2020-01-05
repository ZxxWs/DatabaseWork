package com.sjk.action;

import java.math.BigInteger;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.CheckInUpdate;
import Dispose.Crud;
import Dispose.FindCheckInByCID;
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
	
	private BigInteger CID;//��������ˮID
	private int Cond=0;//�Ƿ�ɹ�����	2:�ɹ�	-2ʧ��	
	private int AddTime;//����������Сʱ
	private double AddMoney;
	
	@Override
	public String execute() throws Exception {//S,

		if(Add()) {
			this.Cond=2;
		}else {
			this.Cond=-2;
		}
		
		return "S";
	}
	
	//��������
	private Boolean Add() {
		Boolean Tag=new Boolean(true);
		
		double Rprice;//�Ȳ�ѯһ�����ڵķ���۸�
		CheckIn checkIn=FindCheckInByCID.getByCID(this.CID);
		Room room=new Room();
		room.setRno(checkIn.getRno());
		Crud<Room> crud=new Crud<>();
		ArrayList<Room> list=crud.Read(room,"");
		Rprice=list.get(0).getRprice();
		
		if(this.AddTime<24) {
			this.AddMoney=this.AddTime*Rprice;
		}else {
			this.AddMoney=(this.AddTime/24)*Rprice;
		}
		
		CheckInUpdate.AddTimeCheckIn(checkIn, this.AddTime, this.AddMoney);	
		return Tag;
	}
	
	public void setCID(BigInteger CID) {
	    this.CID=CID;
	}
	
	public void setCond(int Cond) {
	    this.Cond=Cond;
	}
	
	public void setAddTime(int AddTime) {//���ﵥλΪСʱ��ǰ�˿���
		this.AddTime=AddTime;
	}
	
	public void setAddMoney(double AddMoney) {
		this.AddMoney=AddMoney;
	}
	
	public BigInteger getCID(){         
		return this.CID;
	}

	public int getCond() {
		return this.Cond;
	}
	
	public int getAddTime() {
		return this.AddTime;
	}
	
	public double getAddMoney() {
		return this.AddMoney;
	}
}

