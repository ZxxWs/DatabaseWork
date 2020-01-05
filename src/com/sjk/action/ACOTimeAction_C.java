package com.sjk.action;

import java.math.BigInteger;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xpath.internal.operations.Bool;

import Dispose.CheckInUpdate;
import Dispose.Crud;
import Dispose.FindCheckInByCID;
import Dispose.RoomUpdate;
import TableClass.CheckIn;
import TableClass.Room;


public class ACOTimeAction_C extends ActionSupport{

	
	/**
	 * 续房提交的Action
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger CID;
	private String NewRno;
	private String OldRno;
	private int Cond=0;//是否成功操作	3:成功	-3失败	
	
	
	
	@Override
	public String execute() throws Exception {

		if(Change()) {
			this.Cond=3;//换房成功
		}
		else {
			this.Cond=-3;
		}
		return "S";
	}
	
	/**
	 * 换房的逻辑操作
	 * 将原来的入住：添加退房时间，更改入住
	 * 
	 * */
	private Boolean Change() {
		Boolean Tag=new Boolean(true);
		CheckIn OldC=new CheckIn();
		OldC.setCID(this.CID);
		Boolean t= CheckInUpdate.ChangeRoomCheckIn(OldC, this.NewRno);
		if(t) {
			Room room=new Room();
			room.setRno(this.OldRno);
			if(RoomUpdate.ChangeRoomRcondition(room)) {
				room.setRno(this.NewRno);
				Tag=RoomUpdate.ChangeRoomRcondition(room);
			}
			
		}
		return Tag;
	}
	
	public void setCID(BigInteger CID) {
		this.CID=CID;
	}
	
	public void setOldRno(String OldRno) {
		this.OldRno=OldRno;
	}
	
	public void setNewRno(String NewRno) {
		this.NewRno=NewRno;
	}
	
	public void setCond(int Cond) {
		this.Cond=Cond;
	}
	
	public BigInteger getCID() {
		return this.CID;
	}
	
	public String getOldRno() {
		return this.OldRno;
	}
	
	public String getNewRno() {
		return this.NewRno;
	}
	
	public int getCond() {
		return this.Cond;
	}
}








