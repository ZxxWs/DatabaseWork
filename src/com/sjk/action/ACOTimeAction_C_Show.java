package com.sjk.action;

import java.math.BigInteger;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.CrudCheckInByCID;
import Dispose.ShowCheckIn;
import Dispose.ShowRoom;
import TableClass.CheckIn;
import TableClass.Room;

public class ACOTimeAction_C_Show extends ActionSupport{

	
	/**
	 * 
	 * ���������ť����¼�����
	 * ���ڷ��ؿ�����ס�ķ���
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger CID;
	private ArrayList<Room> CanRoomList;
	private String OldRno;
	private Boolean IsEmpty=false;
	
	
	@Override
	public String execute() throws Exception {
		
		 FindCanRoom();
		
		return "S";
	}
	
	
	private void FindCanRoom() {
		
		CheckIn checkIn=CrudCheckInByCID.ReadByCID(this.CID);//��ȡ��Ҫ�����Ľ�����ˮ
		
		Room room=new Room();//��ȡ��Ҫ������ԭ������
		room.setRno(checkIn.getRno());
		this.OldRno=room.getRno();
		Crud<Room> crud=new Crud<>();
		ArrayList<Room> rooms=crud.Read(room,"");
		
		String Rtype=rooms.get(0).getRtype();//��ȡ�����ķ�������
		String HQL="from Room where Rcondition=0 and Rtype='"+Rtype+"'";//��ѯ���Ի��ķ���
		rooms=crud.Read(room, HQL);
		this.CanRoomList=rooms;
		
		if(this.CanRoomList.isEmpty()) {	//�Ƿ��п��÷���
			this.IsEmpty=true;
		}
	}
	
	public void setCID(BigInteger CID) {
		this.CID=CID;
	}
	
	public void setCanRoomList(ArrayList<Room> CanRoomList) {
		this.CanRoomList=CanRoomList;
	}
	
	public void setIsEmpty(Boolean IsEmpty) {
		this.IsEmpty=IsEmpty;
	}
	
	public void setOldRno(String OldRno) {
		this.OldRno=OldRno;
	}
	
	public BigInteger getCID() {
		return this.CID;
	}
	
	public ArrayList<Room> getCanRoomList() {
		return this.CanRoomList;
	}
	
	public Boolean getIsEmpty() {
		return this.IsEmpty;
	}
	
	public String getOldRno() {
		return this.OldRno;
	}
}






















