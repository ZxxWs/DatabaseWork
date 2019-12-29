package TableClass;

public class Principal {

	/**
	 * Principal表的实体类
	 * 下列变量分别为：负责人ID、负责人姓名
	 * 
	 * 类中包含两个构造函数（有参、无参）
	 * 			以及所有的set、get方法
	 * 
	 * time：2019.12.28
	 * by:Zxx
	 * 
	 * */
	
	
	private String Pno;
	private String Pname;
	
	public Principal() {
	}
	
	public Principal(String Pno,String Pname) {
		this.Pno=Pno;
		this.Pname=Pname;
	}
	
	
	public void setPno(String Pno) {
		this.Pno=Pno;
	}
	
	public void setPname(String Pname) {
		this.Pname=Pname;
	}
	
	public String getPno() {
		return this.Pno;
	}
	
	public String getPname() {
		return this.Pname;
	}
	
	
	
}
