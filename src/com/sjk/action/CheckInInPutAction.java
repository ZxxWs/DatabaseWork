package com.sjk.action;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.CheckIn;
import TableClass.Guest;
import javafx.util.converter.ShortStringConverter;

public class CheckInInPutAction extends ActionSupport{

	//代码有BUG，即使入住不成功也会返回成功标签
	/**
	 * 入住登记Action
	 * get方法没写
	 * 需要填的内容:用户姓名
	 * 				用户身份证号
	 * 				开房间的房间号
	 * 						时长
	 * 
	 * ！！！！双人间：一个/两个信息
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
	private int AllTime;
	private double Rprice;
	private int Rtype;//开房的种类，用于计算价格和代码逻辑分类
	
	private double AllMoney;
	
	
	@Override
	public String execute() throws Exception {
		
		
		//if(Input()) {
			return "S";
		//}else {
		//	return "F";
		///}	

	}
	
	/**
	 * ,如果倒数第二位数是奇数那么就是男性,如果是偶数那么就是女性
	 * 
	 * */
	
	private Boolean Input() {

		Crud<Guest> Gcrud=new Crud<>();
		Crud<CheckIn> Ccrud=new Crud<>();
		
		//单人间

			int IntSex=this.Gno.charAt(16);
			String Sex="";
			if(IntSex%2!=0) {
				Sex="男";
			}else {
				Sex="女";
			}
			
			Guest guest=new Guest(this.Gno,this.Gname,Sex,this.Gtel);
			CheckIn checkIn=new CheckIn(this.Gno,this.Rno, new Date(),this.AllTime,23);

			Boolean tag1=Gcrud.Create(guest);
			Boolean tag2=Ccrud.Create(checkIn);
			
			
			return tag1&&tag2;//向数据库中添加数据。并返回是否成功
		

		
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
	
	public void setAllTime(int AllTime) {
		this.AllTime=AllTime;
	}
	
	public void setRprice(double Rprice) {
		this.Rprice=Rprice;
	}
	
	public void setRtype(int Rtype) {
		this.Rtype=Rtype;
		System.out.println(Rtype);
	}
	
	//
	//get方法没有写：
	//应该用不到，所以没写
	//
	//
	public double getAllMoney() {
		return this.AllMoney;
	}
	
	
}
