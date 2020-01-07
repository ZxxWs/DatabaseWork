package TableClass;

import java.math.BigInteger;
import java.util.Date;

//SQL时间格式：2019-12-29 20:10:39
public class CheckIn {

	/**
	 * CheckIn表的实体类
	 * 下列变量分别为：交易流水号、客人ID（身份证号）、房间号、
	 * 				   入住时间、退房时间、开房时长、
	 * 				   换房后房间号、换房时间
	 * 
	 * 类中包含两个构造函数（有参、无参）以及所有的set、get方法(真长）
	 * 
	 * time：2019.12.28
	 * by:Zxx
	 * */
	private BigInteger CID;
	private String Gno;
	private String Gno1;
	private String Rno;
	private Date InTime;
	private Date OutTime;
	private int AllTime;
	private double AllMoney;
	private String ChangeNo;
	private Date ChangeTime;
	
	
	public CheckIn() {

	}
	
	public CheckIn(String Gno,String Rno,Date InTime,int AllTime,double AllMoney) {//单人间入住
		this.Gno=Gno;
		this.Rno=Rno;
		this.InTime=InTime;
		this.AllTime=AllTime;
		this.AllMoney=AllMoney;
	}
	
	public CheckIn(String Gno,String Gno1,String Rno,Date InTime,int AllTime,double AllMoney) {//双人间入住
		this.Gno=Gno;
		this.Gno1=Gno1;
		this.Rno=Rno;
		this.InTime=InTime;
		this.AllTime=AllTime;
		this.AllMoney=AllMoney;
	}
	
	public void setCID(BigInteger CID) {
		this.CID=CID;
	}
	
	public void setGno(String Gno) {
		this.Gno=Gno;
	}
	
	public void setGno1(String Gno1) {
		this.Gno1=Gno1;
	}
	
	public void setRno(String Rno) {
		this.Rno=Rno;
	}
	
	public void setInTime(Date InTime) {
		this.InTime=InTime;
	}

	public void setOutTime(Date OutTime) {
		this.OutTime=OutTime;
	}

	public void setAllTime(int AllTime) {
		this.AllTime=AllTime;
	}
	
	public void setAllMoney(double AllMoney) {
		this.AllMoney=AllMoney;
	}
	
	public void setChangeNo(String ChangeNo) {
		this.ChangeNo=ChangeNo;
	}
	
	public void setChangeTime(Date ChangeTime) {
		this.ChangeTime=ChangeTime;
	}


	public BigInteger getCID() {
		return this.CID;
	}
	
	public String getGno() {
		return this.Gno;
	}
		
	public String getGno1() {
		return this.Gno1;
	}
	
	public String getRno() {
		return this.Rno;
	}
	
	public Date getInTime() {
		return this.InTime;
	}
	
	public Date getOutTime() {
		return this.OutTime;
	}
	
	public int getAllTime() {
		return this.AllTime;
	}
	
	public double getAllMoney() {
		return this.AllMoney;
	}
	
	public String getChangeNo() {
		return this.ChangeNo;
	}
	
	public Date getChangeTime() {
		return this.ChangeTime;
	}
	@Override
	public String toString() {
		return String.valueOf(this.CID);
	}
	
}
