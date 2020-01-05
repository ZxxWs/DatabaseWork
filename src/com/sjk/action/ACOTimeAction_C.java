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
	 * �����ύ��Action
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger CID;
	private String NewRno;
	private String OldRno;
	private int Cond=0;//�Ƿ�ɹ�����	3:�ɹ�	-3ʧ��	
	
	
	
	@Override
	public String execute() throws Exception {

		if(Change()) {
			this.Cond=3;//�����ɹ�
		}
		else {
			this.Cond=-3;
		}
		return "S";
	}
	
	/**
	 * �������߼�����
	 * ��ԭ������ס������˷�ʱ�䣬������ס
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








