package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.Guest;
import TableClass.Room;

public class ChangeGuestInformation_Show extends ActionSupport{

	/**
	 * ����չʾ�޸Ĺ˿���Ϣ�Ľ���
	 * 
	 * 
	 * */
	private static final long serialVersionUID = 1L;
	private ArrayList<Guest> ShowGuestList;
	private String FindNo;
	
	
	
	@Override
	public String execute() throws Exception {

	
		ReadGuest();	
		
		return "S";
	}

	private void ReadGuest() {
		Guest guest=new Guest();
		guest.setGno(this.FindNo);
		Crud<Guest> crud=new Crud<>();
		this.ShowGuestList=crud.Read(guest,"");
	}

	
	/***********************������set����************************************************/
	
	public void setShowGuestList(ArrayList<Guest> ShowGuestList) {
		this.ShowGuestList=ShowGuestList;
	}
	
	public void setFindNo(String FindNo) {
		this.FindNo=FindNo;
	}
	/***********************������get����************************************************/
	
	public ArrayList<Guest> getShowGuestList() {
		return this.ShowGuestList;
	}
	
	public String getFindNo() {
		return this.FindNo;
	}
	
}





























