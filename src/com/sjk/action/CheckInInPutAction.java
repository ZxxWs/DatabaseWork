package com.sjk.action;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.opensymphony.xwork2.ActionSupport;

import Dispose.Crud;
import TableClass.CheckIn;
import TableClass.Guest;
import javafx.util.converter.ShortStringConverter;

public class CheckInInPutAction extends ActionSupport{

	//������BUG����ʹ��ס���ɹ�Ҳ�᷵�سɹ���ǩ
	/**
	 * ��ס�Ǽ�Action
	 * get����ûд
	 * ��Ҫ�������:�û�����
	 * 				�û����֤��
	 * 				������ķ����
	 * 						ʱ��
	 * 
	 * ��������˫�˼䣺һ��/������Ϣ
	 */
	private static final long serialVersionUID = 1L;
	//��˫�˼�Ŀ�����
	private String Gno;
	private String Gno1;
	private String Gname;
	private String Gname1;
	private String Gtel;
	private String Gtel1;
	
	private String Rno;//��˫�˼�һ����ֵ
	private int AllTime;
	private double Rprice;
	private int Rtype;//���������࣬���ڼ���۸�ʹ����߼�����
	
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
	 * ,��������ڶ�λ����������ô��������,�����ż����ô����Ů��
	 * 
	 * */
	
	private Boolean Input() {

		Crud<Guest> Gcrud=new Crud<>();
		Crud<CheckIn> Ccrud=new Crud<>();
		
		//���˼�

			int IntSex=this.Gno.charAt(16);
			String Sex="";
			if(IntSex%2!=0) {
				Sex="��";
			}else {
				Sex="Ů";
			}
			
			Guest guest=new Guest(this.Gno,this.Gname,Sex,this.Gtel);
			CheckIn checkIn=new CheckIn(this.Gno,this.Rno, new Date(),this.AllTime,23);

			Boolean tag1=Gcrud.Create(guest);
			Boolean tag2=Ccrud.Create(checkIn);
			
			
			return tag1&&tag2;//�����ݿ���������ݡ��������Ƿ�ɹ�
		

		
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
	//get����û��д��
	//Ӧ���ò���������ûд
	//
	//
	public double getAllMoney() {
		return this.AllMoney;
	}
	
	
}
