package com.sjk.action;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.accessibility.internal.resources.accessibility;

import Dispose.Crud;
import TableClass.Room;
public class SelectPage  extends ActionSupport{

	
/**
 * 此类中控制主页显示的页面
 * 
 * 
 * 
 * */
	private static final long serialVersionUID = 1L;
	private String Page;
	private ArrayList<Room> RoomList;
	
	
	@Override
	public String execute() throws Exception {

		if(this.Page.equals("0")) {
			setRoomList();
		}
		return this.Page;
	}
	
	public void setPage(String Page) {
		this.Page=Page;
		System.out.println(Page);
	}
	
	public String getPage() {
		return this.Page;
	}
	
	
	
	
	public void setRoomList() {
		Crud<Room> crud=new Crud<>();
		this.RoomList=crud.Read(new Room(),"from Room where Rcondition=0");
	//	System.out.println(this.RoomList.toString());
		
		
		for(Room r:this.RoomList) {
			System.out.println(r.getRno());

			System.out.println(r.getRprice());
		}
		System.out.println("\n\nset\n\n");
		
	}
	
	public ArrayList<Room> getRoomList() {
		System.out.println("\n得到RoomList\n");
		return this.RoomList;
	}
	
}
