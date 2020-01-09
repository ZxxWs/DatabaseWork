package com.sjk.action;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.accessibility.internal.resources.accessibility;

import Dispose.Crud;
import Dispose.ShowCheckIn;
import Dispose.ShowRoom;
import TableClass.CheckIn;
import TableClass.Room;
import Tools.getOutTime;
public class SelectPage  extends ActionSupport{

	
/**
 * �����п�����ҳ��ʾ��ҳ��
 * 
 * 
 * By:Ylj
 * 
 * 
 * */
	private static final long serialVersionUID = 1L;
	private String Page;
	private ArrayList<Room> RoomList;//����ҳ��ĳ�ʼ��
	private ArrayList<CheckIn> ACOTimeList;//�������˷������������ʼ��
	
	@Override
	public String execute() throws Exception {

		switch (this.Page) {
		case "0":
			setRoomList();
			break;
		case "1":
			setACOTimeList();
			break;

		default:
			break;
		}
		
		return this.Page;
	}
	
	public void setPage(String Page) {
		this.Page=Page;
	}
	
	public String getPage() {
		return this.Page;
	}
	
	
	public void setRoomList() {
		ShowRoom showRoom=new ShowRoom();
		this.RoomList=showRoom.getRoomList();
	}
	
	public ArrayList<Room> getRoomList() {
		return this.RoomList;
	}
	
	public void setACOTimeList() {
		ShowCheckIn showCheckIn=new ShowCheckIn();
		this.ACOTimeList=showCheckIn.getCheckInList();
	}
	
	public ArrayList<CheckIn> getACOTimeList() {

		return this.ACOTimeList;
	}
	
}
