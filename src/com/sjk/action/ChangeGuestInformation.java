package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import Dispose.GuestUpdate;
import Dispose.PrincipalUpdate;
import Dispose.RoomUpdate;
import TableClass.Principal;
import TableClass.Room;
import javassist.bytecode.CodeIterator.Gap;

public class ChangeGuestInformation extends ActionSupport{

	/**
	 * 用于修改信息的Action
	 * 包括对Guest类的Crud（只有RU）
	 * */
	
	private static final long serialVersionUID = 1L;
	private String OldGno;
	private String NewGno;
	private String Gname;
	private String Gtel;

	private int IsSuccess=0;//操作成功与否：1修改成功.-1修改失败	2删除成功.-2删除失败 3添加成功.-3删除失败
	
	@Override
	public String execute() throws Exception {

		Change();
		return "S";
	}

	//修改信息
	private void Change() {

		//调用顾客信息更新的静态方法
		Boolean t=GuestUpdate.UpdateAllInformation(this.NewGno, this.Gname, this.Gtel, this.OldGno);
		if(t) {
			this.IsSuccess=1;
		}else {
			this.IsSuccess=-1;
		}
	}
	

	/***********************下面是set方法*****************************/
	public void setOldGno(String OldGno) {
		this.OldGno=OldGno;
	}
	
	public void setNewGno(String NewGno) {
		this.NewGno=NewGno;
	}
	public void setGname(String Gname) {
		this.Gname=Gname;
	}
	
	public void setGtel(String Gtel) {
		this.Gtel=Gtel;
	}
	
	public void setIsSuccess(int IsSuccess) {
		this.IsSuccess=IsSuccess;
	}
	
	/***********************下面是get方法*****************************/
	
	public String getOldGno() {
		return this.OldGno;
	}
	
	public String getNewGno() {
		return this.NewGno;
	}
	
	public String getGname() {
		return this.Gname;
	}
	
	public String getGtel() {
		return this.Gtel;
	}
	
	public int getIsSuccess() {
		return this.IsSuccess;
	}
}





























