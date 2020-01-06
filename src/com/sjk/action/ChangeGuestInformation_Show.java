package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.Guest;
import TableClass.Room;

public class ChangeGuestInformation_Show extends ActionSupport{

	/**
	 * 用于展示修改顾客信息的界面
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

	
	/***********************下面是set方法************************************************/
	
	public void setShowGuestList(ArrayList<Guest> ShowGuestList) {
		this.ShowGuestList=ShowGuestList;
	}
	
	public void setFindNo(String FindNo) {
		this.FindNo=FindNo;
	}
	/***********************下面是get方法************************************************/
	
	public ArrayList<Guest> getShowGuestList() {
		return this.ShowGuestList;
	}
	
	public String getFindNo() {
		return this.FindNo;
	}
	
}





























