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
	
	private BigInteger CID;//��������ˮID
	private int Cond=0;//�Ƿ�ɹ�����	 0�� 1�� -1��
	
	@Override
	public String execute() throws Exception {//����ֵΪ��OUT,AS,

		if(Out()) {
			this.Cond=1;
		}
		else {
			this.Cond=-1;
		}
		return "S";
	}
	
	
	//�˷�����
	public Boolean Out() {
		
		Boolean Tag=new Boolean(true);
		CheckIn checkIn=new CheckIn();
		checkIn.setCID(this.CID);
		Tag=CheckInUpdate.OutCheckIn(checkIn);//����Zxxд��
		
		if(Tag) {	//����˷�����������ɹ�����ķ����״̬
			Room room=new Room();
			
			room.setRno(CrudCheckInByCID.ReadByCID(checkIn.getCID()).getRno());
		
			Tag=RoomUpdate.ChangeRoomRcondition(room);
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

