package com.sjk.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.Principal;
import TableClass.Room;

public class ChangePrincipalInformation_Show extends ActionSupport{

	/**
	 * 用于展示修改员工信息的界面
	 * 
	 * 
	 * */
	private static final long serialVersionUID = 1L;
	private ArrayList<Principal> ShowPrincipalList;
	private String FindNo;
	
	@Override
	public String execute() throws Exception {

	
		ReadRoom();	
		
		return "S";
	}

	private void ReadRoom() {
		Principal principal=new Principal();
		principal.setPno(this.FindNo);
		Crud<Principal> crud=new Crud<>();
		this.ShowPrincipalList=crud.Read(principal, "");
	}

	
	/***********************下面是set方法************************************************/
	
	public void setShowPrincipalList(ArrayList<Principal> ShowPrincipalList) {
		this.ShowPrincipalList=ShowPrincipalList;
	}
	
	public void setFindNo(String FindNo) {
		this.FindNo=FindNo;
	}
	/***********************下面是get方法************************************************/
	
	public ArrayList<Principal> getShowPrincipalList() {
		return this.ShowPrincipalList;
	}
	
	public String getFindNo() {
		return this.FindNo;
	}
	
}





























