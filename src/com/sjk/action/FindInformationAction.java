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
	 * ��ѯ�����Action
	 * ��ҳ�������ǰ�˽��պͺ�˲�ѯ����
	 * 
	 * ������������ѯ����	
	 * 			 ��ѯ����
	 * 			 �ɹ�����־
	 * 
	 * 			 �ĸ���Ķ���List
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
	
	private int test;
	
	@Override
	public String execute() throws Exception {

		this.test=0;
		
		System.out.println(this.FindMethod);
		System.out.println(this.FindNum);
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
	 * ͨ���˿����֤�Ų�ѯ
	 * ��ѯ���ݿ��Guest���CheckIn��
	 * */
	private void setByGno(String Gno) {
		
		String HQL="from CheckIn where Gno="+Gno;
		Guest guest=new Guest();
		CheckIn checkIn=new CheckIn();
		guest.setGno(Gno);
		
		Crud<Guest> crud=new Crud<>();
		this.GuestList=crud.Read(guest,"");//��ѯ���˱�
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//��ѯ��ס��ϵ��
		
		if(this.GuestList.isEmpty()||this.CheckInList.isEmpty()) {//��ѯʧ�ܱ�־
			this.Tag=false;
		}
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
		
		if(this.RoomList.isEmpty()||this.CheckInList.isEmpty()) {//��ѯʧ�ܱ�־
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
		System.out.println("GetTagִ��");
		return this.Tag;
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
	
	
	public void setest(int test) {
		this.test=test;
	}
	
	public int gettest() {
		return this.test;
	}
	
	
	
	
	
	
}
