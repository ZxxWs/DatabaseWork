package TableClass;

public class Room {
	
/**
 * Room表的实体类
 * 下列变量分别为：房间号、房间类型、价格、当前状态、负责人ID
 * 
 * 类中包含两个构造函数（有参、无参）
 * 			以及所有的set、get方法
 * 
 * 
 * time：2019.12.28
 * by:Zxx
 * 
 * */
	
	private String Rno;
	private String Rtype;
	private double Rprice;
	private int Rcondition;
	private String Pno;
	private String N;//用于Hibernate
	
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
