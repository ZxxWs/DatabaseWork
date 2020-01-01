package com.sjk.action;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.CheckIn;
import TableClass.Guest;
import javafx.util.converter.ShortStringConverter;

public class CheckInInPutAction extends ActionSupport{

	
	/**
	 * 入住登记Action
	 * get方法没写
	 * 需要填的内容:用户姓名
	 * 				用户身份证号
	 * 				开房间的房间号
	 * 						时长
	 * 
	 * ！！！！双人间：一个/两个信息
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//有双人间的可能性
	private String Gno;
	private String Gno1;
	private String Gname;
	private String Gname1;
	private String Gtel;
	private String Gtel1;
	
	private String Rno;//单双人间一样的值
	private double AllTime;
	
	
	
	@Override
	public String execute() throws Exception {

		Input();
		return "S";
	}
	
	/**
	 * ,如果倒数第二位数是奇数那么就是男性,如果是偶数那么就是女性
	 * 
	 * */
	
	private void Input() {

		Crud<Guest> Gcrud=new Crud<>();
		Crud<CheckIn> Ccrud=new Crud<>();
		
		//单人间
		if(this.Gno1==null) {
			int IntSex=this.Gno.charAt(16);
			String Sex="";
			if(IntSex%2!=0) {
				Sex="男";
			}else {
				Sex="女";
			}
			
			Guest guest=new Guest(this.Gno,this.Gname,Sex,this.Gtel);
			CheckIn checkIn=new CheckIn(this.Gno,this.Rno, new Date(),this.AllTime);

			Gcrud.Create(guest);
			Ccrud.Create(checkIn);

		}else {//双人间的入住
			
		}
		
	}
	
	
	
	
	public void setGno(String Gno) {
		this.Gno=Gno;
	}
	
	public void setGno1(String Gno1) {
		this.Gno1=Gno1;
	}
	
	public void setGname(String Gname) {
		this.Gname=Gname;
	}
	
	public void setGname1(String Gname1) {
		this.Gname1=Gname1;
	}
	
	public void setGtel(String Gtel) {
		this.Gtel=Gtel;
	}
	
	public void setGtel1(String Gtel1) {
		this.Gtel1=Gtel1;
	}
	
	public void setRno(String Rno) {
		this.Rno=Rno;
	}
	
	public void setAllTime(double AllTime) {
		this.AllTime=AllTime;
	}
	
	//
	//get方法没有写：
	//应该用不到，所以没写
	//
	//
	
	
}
