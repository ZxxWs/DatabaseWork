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
	 * by:Zxx
	 * 
	 * */
	
	private String Gno;
	private String Gname;
	private String Gtel;
	
	public Guest() {
	}

	public Guest(String Gno,String Gname,String Gtel) {
		this.Gno=Gno;
		this.Gname=Gname;
		this.Gtel=Gtel;
	}
	
	public void setGno(String Gno) {
		this.Gno=Gno;
	}

	public void setGname(String Gname) {
		this.Gname=Gname;
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
	
	public String getGtel() {
		return this.Gtel;
	}
}
