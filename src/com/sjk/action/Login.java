package com.sjk.action;

import java.util.ArrayList;

import Dispose.Crud;
import TableClass.Room;

public class Login {

	/**
	 * 访问action的时候，默认执行execute方法
	 * 然后配置action访问路径
	 * 
	 * 
	 * */
//	private ArrayList<Room> RoomList;

	
	
	
	public String execute() {
		//setRoomList();
		return "Success";
	}
	
//	public void setRoomList() {
//		Crud<Room> crud=new Crud<>();
//		this.RoomList=crud.Read(new Room(),"from Room where Rcondition=0");
//		System.out.println(this.RoomList.toString());
//	}
//	
//	public ArrayList<Room> getRoomList() {
//		return this.RoomList;
//	}
}
