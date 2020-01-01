package TableClass;

public class Room {
	
/**
 * Room���ʵ����
 * ���б����ֱ�Ϊ������š��������͡��۸񡢵�ǰ״̬��������ID
 * 
 * ���а����������캯�����вΡ��޲Σ�
 * 			�Լ����е�set��get����
 * 
 * 
 * time��2019.12.28
 * by:Zxx
 * 
 * */
	
	private String Rno;
	private String Rtype;
	private double Rprice;
	private int Rcondition;
	private String Pno;
	private String N;//����Hibernate
	
	public Room() {
	}
	
	public Room(String Rno,String Rtype,double Rprice,int Rcondition,String Pno) {
		this.Rno=Rno;
		this.Rtype=Rtype;
		this.Rprice=Rprice;
		this.Rcondition=Rcondition;
		this.Pno=Pno;

		this.N=Rno;
	}
	
	public void setRno(String Rno){
		this.Rno=Rno;

		this.N=Rno;
	}
	
	public void setRtype(String Rtype){
		this.Rtype=Rtype;
	}
	
	public void setRprice(double Rprice){
		this.Rprice=Rprice;
	}
	
	public void setRcondition(int Rcondition){
		this.Rcondition=Rcondition;
	}
	
	public void setPno(String Pno){
		this.Pno=Pno;
	}
	
	public String getRno() {
		return this.Rno;
	}
	
	public String getRtype() {
		return this.Rtype;
	}
	
	public double getRprice() {
		return this.Rprice;
	}
	
	public int getRcondition() {
		return this.Rcondition;
	}
	
	public String getPno() {
		return this.Pno;
	}
	
	@Override
	public String toString() {
		return N;
	}
	
}
