package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.CheckIn;
import TableClass.Guest;
import TableClass.Principal;
import TableClass.Room;

public class FindInformationAction extends ActionSupport{
	
	/**
	 * 查询界面的Action
	 * 此页代码包括前端接收和后端查询处理
	 * 
	 * 参数包括：查询号码	
	 * 			 查询方法
	 * 			 成功与否标志
	 * 
	 * 			 四个表的对象List
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FindNum;
	private int FindMethod;
	private Boolean Tag=true;
	
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
	
	/**
	 * 通过顾客身份证号查询
	 * 查询数据库的Guest表和CheckIn表
	 * */
	private void setByGno(String Gno) {
		
		String HQL="from CheckIn where Gno="+Gno+" or Gno1="+Gno;
		Guest guest=new Guest();
		CheckIn checkIn=new CheckIn();
		guest.setGno(Gno);
		
		Crud<Guest> crud=new Crud<>();
		this.GuestList=crud.Read(guest,"");//查询客人表
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//查询入住关系表
		
		if(this.GuestList.isEmpty()||this.CheckInList.isEmpty()) {//查询失败标志
			this.Tag=false;
		}
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
		
		if(this.RoomList.isEmpty()||this.CheckInList.isEmpty()) {//查询失败标志
			this.Tag=false;
		}
	}
	
	
	public void setFindMethod(int FindMethod) {
		this.FindMethod=FindMethod;
	}
	
	public void setFindNum(String FindNum) {
		this.FindNum=FindNum;
	}
	
	public void setTag(Boolean Tag) {
		this.Tag=Tag;
	}
	
	public int getFindMethod() {
		return this.FindMethod;
	}
	
	public String getFindNum() {
		return this.FindNum;
	}
	
	public Boolean getTag() {
		return this.Tag;
	}
	
	public ArrayList<Room> getRoomList(){
		return this.RoomList;
	}
	
	public ArrayList<CheckIn> getCheckInList() {
		return this.CheckInList;
	}
	
	public ArrayList<Guest> getGuestList(){
		return this.GuestList;
	}
	
	public ArrayList<Principal> getPrincipalList(){
		return this.PrincipalList;
	}
	
}
