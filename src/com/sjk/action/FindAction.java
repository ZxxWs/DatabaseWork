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
	 * ��ѯ�����Action
	 * ������ң�������Ҫ����ṹ
	 * ��ҳ�������ǰ�˽��պͺ�˲�ѯ����
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
		this.GuestList=crud.Read(guest,"");//��ѯ���˱�
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//��ѯ��ס��ϵ��
		
	}
	
	/**
	 * ͨ������Ų�ѯ
	 * ��Ҫ��ѯRoom��CheckIn��
	 * */
	private void setByRno(String Rno) {
		
		String HQL="from CheckIn where Rno="+Rno;

		Room room=new Room();
		CheckIn checkIn=new CheckIn();
		room.setRno(Rno);
		
		Crud<Room> crud=new Crud<>();
		this.RoomList=crud.Read(room,"");//�÷���Ų�ѯ�����
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//�÷���Ų�ѯ��ס��ϵ��
		
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
