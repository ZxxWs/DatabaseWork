package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.CheckIn;
import TableClass.Guest;
import TableClass.Principal;
import TableClass.Room;

public class FindAction extends ActionSupport{

	
	/**
	 * 查询界面的Action
	 * 代码较乱，后期需要整理结构
	 * 此页代码包括前端接收和后端查询处理
	 * 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FindNum;
	private int FindMethod;

	private ArrayList<Room> RoomList;
	private ArrayList<CheckIn> CheckInList;
	private ArrayList<Guest> GuestList;
	private ArrayList<Principal> PrincipalList;
	
	
	
	@Override
	public String execute() throws Exception {

		switch (this.FindMethod) {
		case 1:
			setByGno(this.FindNum);
			break;

		case 2:
			setByRno(this.FindNum);
			break;

		default:
			break;
		}
		
		return "S";
	}
	
	
	
	
	private void setByGno(String Gno) {
		
		String HQL="from CheckIn where Gno="+Gno;
		Guest guest=new Guest();
		CheckIn checkIn=new CheckIn();
		guest.setGno(Gno);
		
		Crud<Guest> crud=new Crud<>();
		this.GuestList=crud.Read(guest,"");//查询客人表
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//查询入住关系表
		
	}
	
	/**
	 * 通过房间号查询
	 * 需要查询Room表CheckIn表
	 * */
	private void setByRno(String Rno) {
		
		String HQL="from CheckIn where Rno="+Rno;

		Room room=new Room();
		CheckIn checkIn=new CheckIn();
		room.setRno(Rno);
		
		Crud<Room> crud=new Crud<>();
		this.RoomList=crud.Read(room,"");//用房间号查询房间表
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//用房间号查询入住关系表
		
	}
	

	
	
	
	
	
	/**
	 * 
	 * 
	 * */
	
	
	
	public void setFindMethod(int FindMethod) {
		this.FindMethod=FindMethod;
	}
	
	public void setFindNum(String FindNum) {
		this.FindNum=FindNum;
	}
	
	public int getFindMethod() {
		return this.FindMethod;
	}
	
	public String getFindNum() {
		return this.FindNum;
	}
	
	
	public ArrayList<Room> getRoomList(){
		return this.RoomList;
	}
	
	public ArrayList<CheckIn> getCheakInList() {
		return this.CheckInList;
	}
	
	public ArrayList<Guest> getGuestList(){
		return this.GuestList;
	}
	
	public ArrayList<Principal> getPrincipalList(){
		return this.PrincipalList;
	}
	
}
