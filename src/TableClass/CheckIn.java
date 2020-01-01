package TableClass;

import java.util.Date;

//SQLʱ���ʽ��2019-12-29 20:10:39
public class CheckIn {

	/**
	 * CheckIn���ʵ����
	 * ���б����ֱ�Ϊ��������ˮ�š�����ID�����֤�ţ�������š�
	 * 				   ��סʱ�䡢�˷�ʱ�䡢����ʱ����
	 * 				   ����ǰ����š������󷿺�
	 * 
	 * ���а����������캯�����вΡ��޲Σ��Լ����е�set��get����(�泤��
	 * 
	 * time��2019.12.28
	 * by:Zxx
	 * */
		
	private String CID;
	private String Gno;
	private String Rno;
	private Date InTime;
	private Date OutTime;
	private double AllTime;
	private String FrontNo;
	private String BackNo;
	private String N;//����Hibernate
	
	public CheckIn() {

	}
	
//	public CheckIn(	String CID,String Gno,String Rno,Date InTime,Date OutTime,double AllTime,String FrontNo,String BackNo) {
//		this.CID=CID;
//		this.Gno=Gno;
//		this.Rno=Rno;
//		this.InTime=InTime;
//		this.OutTime=OutTime;
//		this.AllTime=AllTime;
//		this.FrontNo=FrontNo;
//		this.BackNo=BackNo;
//		
//		this.N=CID;
//	}
	
	
	public CheckIn(	String CID,String Gno,String Rno,Date InTime,double AllTime) {
		this.CID=CID;
		this.Gno=Gno;
		this.Rno=Rno;
		this.InTime=InTime;
		this.AllTime=AllTime;
		this.N=CID;
	}
	
	public void setCID(String CID) {
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
	
	public String getCID() {
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
		return N;
	}
	
}
