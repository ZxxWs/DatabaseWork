package TableClass;

import java.math.BigInteger;
import java.util.Date;

//SQL时间格式：2019-12-29 20:10:39
public class CheckIn {

	/**
	 * CheckIn表的实体类
	 * 下列变量分别为：交易流水号、客人ID（身份证号）、房间号、
	 * 				   入住时间、退房时间、开房时长、
	 * 				   换房前房间号、换房后房号
	 * 
	 * 类中包含两个构造函数（有参、无参）以及所有的set、get方法(真长）
	 * 
	 * time：2019.12.28
	 * by:Zxx
	 * */
	private BigInteger CID;
	private String Gno;
	private String Rno;
	private Date InTime;
	private Date OutTime;
	private double AllTime;
	private String FrontNo;
	private String BackNo;
	private BigInteger N;//用于Hibernate的主键查询
	
	public CheckIn() {

	}
	
	public CheckIn(String Gno,String Rno,Date InTime,double AllTime) {
		this.Gno=Gno;
		this.Rno=Rno;
		this.InTime=InTime;
		this.AllTime=AllTime;
	}
	
	public void setCID(BigInteger CID) {
		this.CID=CID;
		this.N=CID;
	}
	
	public void setGno(String Gno) {
		this.Gno=Gno;
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

	public void setAllTime(double AllTime) {
		this.AllTime=AllTime;
	}
	
	public void setFrontNo(String FrontNo) {
		this.FrontNo=FrontNo;
	}
	
	public void setBackNo(String BackNo) {
		this.BackNo=BackNo;
	}
	
	public BigInteger getCID() {
		return this.CID;
	}
	
	public String getGno() {
		return this.Gno;
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
	
	public double getAllTime() {
		return this.AllTime;
	}
	
	public String getFrontNo() {
		return this.FrontNo;
	}
	
	public String getBackNo() {
		return this.BackNo;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.N);
	}
	
}
