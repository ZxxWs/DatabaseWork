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

	//代码有BUG，前端无法接受总金额
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
	
	private String Rno;
	private int AllTime;
	private double Rprice;
	private int Rtype;//开房的种类，用于计算价格和代码逻辑分类

	//返回值
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
	 * 如果倒数第二位数是奇数那么就是男性,如果是偶数那么就是女性
	 * 
	 * */
	
	private Boolean Input() {

		Crud<Guest> Gcrud=new Crud<>();
		Crud<CheckIn> Ccrud=new Crud<>();
		
		//用于记录添加更改是否成功
		Boolean Tag=new Boolean(true);
		
		int IntSex=this.Gno.charAt(16);

		String Sex="";
		{//性别判断
			if(IntSex%2!=0) {
				Sex="男";
			}else {
				Sex="女";
			}
		}

		this.AllMoney=this.AllTime*this.Rprice;//钱数计算
		
		if(this.Rtype==1||this.Rtype==2) {//整天的时间计算
			this.AllTime*=24;
		}


		Guest guest=new Guest(this.Gno,this.Gname,Sex,this.Gtel);//不管单双人房，先登记一个
		Gcrud.Create(guest);
		
		if(this.Rtype==1||this.Rtype==3) {//单人类型房间的数据库插入
			
			CheckIn checkIn=new CheckIn(this.Gno,this.Rno, new Date(),this.AllTime,this.AllMoney);
			Tag=Ccrud.Create(checkIn);
			
		}else {//双人类型房间的数据库插入
			
			int IntSex1=this.Gno1.charAt(16);
			String Sex1="";
			if(IntSex1%2!=0) {
				Sex1="男";
			}else {
				Sex1="女";
			}
			
			Guest guest1=new Guest(this.Gno1,this.Gname1,Sex1,this.Gtel1);
			CheckIn checkIn=new CheckIn(this.Gno,this.Gno1,this.Rno, new Date(),this.AllTime,this.AllMoney);

			Gcrud.Create(guest1);
			Tag=Ccrud.Create(checkIn);
		}
		
		if(Tag) {
			Room room=new Room();//最后更改房间状态
			room.setRno(this.Rno);
			Tag=RoomUpdate.ChangeRoomRcondition(room);
		}
	
		return Tag;//向数据库中添加数据。并返回是否成功
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
