package TableClass;

public class Principal {

	/**
	 * Principal���ʵ����
	 * ���б����ֱ�Ϊ��������ID������������
	 * 
	 * ���а����������캯�����вΡ��޲Σ�
	 * 			�Լ����е�set��get����
	 * 
	 * time��2019.12.28
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
