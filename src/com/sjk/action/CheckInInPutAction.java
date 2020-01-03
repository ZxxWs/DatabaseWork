package com.sjk.action;

import java.math.BigInteger;
import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.recompile;

import Dispose.Crud;
import Dispose.RoomUpdate;
import TableClass.CheckIn;
import TableClass.Guest;
import TableClass.Room;

public class CheckInInPutAction extends ActionSupport{

	//������BUG��ǰ���޷������ܽ��
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
	
	private String Rno;
	private int AllTime;
	private double Rprice;
	private int Rtype;//���������࣬���ڼ���۸�ʹ����߼�����

	//����ֵ
	private double AllMoney;
	private BigInteger CID;
	
	@Override
	public String execute() throws Exception {
		
		if(Input()) {
			return "S";
		}else {
			return "F";
		}	

	}
	
	/**
	 * ��������ڶ�λ����������ô��������,�����ż����ô����Ů��
	 * 
	 * */
	
	private Boolean Input() {

		Crud<Guest> Gcrud=new Crud<>();
		Crud<CheckIn> Ccrud=new Crud<>();
		
		//���ڼ�¼��Ӹ����Ƿ�ɹ�
		Boolean Tag=new Boolean(true);
		
		int IntSex=this.Gno.charAt(16);

		String Sex="";
		{//�Ա��ж�
			if(IntSex%2!=0) {
				Sex="��";
			}else {
				Sex="Ů";
			}
		}

		this.AllMoney=this.AllTime*this.Rprice;//Ǯ������
		
		if(this.Rtype==1||this.Rtype==2) {//�����ʱ�����
			this.AllTime*=24;
		}


		Guest guest=new Guest(this.Gno,this.Gname,Sex,this.Gtel);//���ܵ�˫�˷����ȵǼ�һ��
		Gcrud.Create(guest);
		
		if(this.Rtype==1||this.Rtype==3) {//�������ͷ�������ݿ����
			
			CheckIn checkIn=new CheckIn(this.Gno,this.Rno, new Date(),this.AllTime,this.AllMoney);
			Tag=Ccrud.Create(checkIn);
			
		}else {//˫�����ͷ�������ݿ����
			
			int IntSex1=this.Gno1.charAt(16);
			String Sex1="";
			if(IntSex1%2!=0) {
				Sex1="��";
			}else {
				Sex1="Ů";
			}
			
			Guest guest1=new Guest(this.Gno1,this.Gname1,Sex1,this.Gtel1);
			CheckIn checkIn=new CheckIn(this.Gno,this.Gno1,this.Rno, new Date(),this.AllTime,this.AllMoney);

			Gcrud.Create(guest1);
			Tag=Ccrud.Create(checkIn);
		}
		
		if(Tag) {
			Room room=new Room();//�����ķ���״̬
			room.setRno(this.Rno);
			Tag=RoomUpdate.ChangeRoomRcondition(room);
		}
	
		return Tag;//�����ݿ���������ݡ��������Ƿ�ɹ�
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
	}
	
	public void setAllMoney(double AllMoney) {
		this.AllMoney=AllMoney;
	}
	
	public void setCID(BigInteger CID) {
		this.CID=CID;
	}
	
	public String getGno() {
		return this.Gno;
	}
	
	public String getGno1() {
		return this.Gno1;
	}
	
	public String getGname() {
		return this.Gname;
	}
	
	public String getGame1() {
		return this.Gname1;
	}
	
	public String getGtel() {
		return this.Gtel;
	}
	
	public String getGtel1() {
		return this.Gtel1;
	}
	
	public String getRno() {
		return this.Rno;
	}
	
	public int getAllTime() {
		return this.AllTime;
	}
	
	public double getRprice() {
		return this.Rprice;
	}
	
	public int getRtype() {
		return this.Rtype;
	}
	
	public double getAllMoney() {
		System.out.println("this.AllMoney");
		return this.AllMoney;
	}
	
	public BigInteger getCID() {
		return this.CID;
	}
	
}
