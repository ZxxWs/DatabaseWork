package TableClass;

public class Guest {

	/**
	 * Guest���ʵ����
	 * ���б����ֱ�Ϊ���˿�ID�����֤�ţ����������绰
	 * 
	 * ���а����������캯�����вΡ��޲Σ�
	 * 			�Լ����е�set��get����
	 * 
	 * 
	 * time��2019.12.28
	 * 
	 * */
	
	private String Gno;
	private String Gname;
	private String Gsex;
	private String Gtel;
	
	public Guest() {
	}

	public Guest(String Gno,String Gname,String Gsex,String Gtel) {
		this.Gno=Gno;
		this.Gname=Gname;
		this.Gsex=Gsex;
		this.Gtel=Gtel;
	}
	
	public void setGno(String Gno) {
		this.Gno=Gno;
	}

	public void setGname(String Gname) {
		this.Gname=Gname;
	}
	
	public void setGsex(String Gsex) {
		this.Gsex=Gsex;
	}
	
	
	public void setGtel(String Gtel) {
		this.Gtel=Gtel;
	}

	public String getGno() {
		return this.Gno;
	}

	public String getGname() {
		return this.Gname;
	}
	
	public String getGsex() {
		return this.Gsex;
	}
	
	public String getGtel() {
		return this.Gtel;
	}
	
	@Override
	public String toString() {
		return this.Gno;
	}
}
