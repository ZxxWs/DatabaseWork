package com.sjk.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import TableClass.Guest;
import javafx.util.converter.ShortStringConverter;

public class CheckInInPutAction extends ActionSupport{

	
	/**
	 * ��ס�Ǽ�Action
	 * ��Ҫ�������:�û�����
	 * 				�û����֤��
	 * 				������ķ����
	 * 						ʱ��
	 * 
	 * ��������˫�˼䣺һ��/������Ϣ
	 * 
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
	private double AllTime;
	
	
	
	@Override
	public String execute() throws Exception {

		
		return "S";
	}
	
	
	
	private void Input() {
		//���˼�
		if(this.Gno1==null) {
			//if(this.Gno!="0")
				Guest guest=new Guest(this.Gno,this.Gname,"",this.Gtel);
		}else {
			
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
