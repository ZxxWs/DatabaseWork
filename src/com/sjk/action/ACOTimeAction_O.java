package com.sjk.action;

import java.math.BigInteger;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.CheckInUpdate;
import Dispose.Crud;
import Dispose.CrudCheckInByCID;
import Dispose.RoomUpdate;
import TableClass.CheckIn;
import TableClass.Room;

public class ACOTimeAction_O extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigInteger CID;//操作的流水ID
	private int Cond=0;//是否成功操作	 0无 1成 -1败
	
	@Override
	public String execute() throws Exception {//返回值为：OUT,AS,

		if(Out()) {
			this.Cond=1;
		}
		else {
			this.Cond=-1;
		}
		return "S";
	}
	
	
	//退房方法
	public Boolean Out() {
		
		Boolean Tag=new Boolean(true);
		CheckIn checkIn=new CheckIn();
		checkIn.setCID(this.CID);
		
		Tag=CheckInUpdate.OutCheckIn(checkIn);//调用
		
		if(Tag) {	//如果退房操作表操作成功，则改房间的状态
			Room room=new Room();
			
			room.setRno(CrudCheckInByCID.ReadByCID(checkIn.getCID()).getRno());//调用
		
			Tag=RoomUpdate.ChangeRoomRcondition(room);//调用
		}
		return true;
	}
	
	
	public void setCID(BigInteger CID) {
	      this.CID=CID;
	}
	
	public void setCond(int Cond) {
	      this.Cond=Cond;
	}
	
	public BigInteger getCID(){         
		return this.CID;
	}

	public int getCond() {
		return this.Cond;
	}
	
	
}

