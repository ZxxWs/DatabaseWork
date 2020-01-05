package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.Room;

public class ChangeRoomInformation_Show extends ActionSupport{

	/**
	 * ����չʾ�޸ķ�����Ϣ�Ľ���
	 * 
	 * 
	 * */
	private static final long serialVersionUID = 1L;
	private ArrayList<Room> ShowRoomList;
	private String FindNo;
	
	
	
	@Override
	public String execute() throws Exception {

	
		ReadRoom();	
		
		return "S";
	}

	private void ReadRoom() {
		Room room=new Room();
		room.setRno(this.FindNo);
		Crud<Room> crud=new Crud<>();
		this.ShowRoomList=crud.Read(room, "");
	}

	
	/***********************������set����************************************************/
	
	public void setShowRoomList(ArrayList<Room> ShowRoomList) {
		this.ShowRoomList=ShowRoomList;
	}
	
	public void setFindNo(String FindNo) {
		this.FindNo=FindNo;
	}
	/***********************������get����************************************************/
	
	public ArrayList<Room> getShowRoomList() {
		return this.ShowRoomList;
	}
	
	public String getFindNo() {
		return this.FindNo;
	}
	
}





























