package com.sjk.action;

public class Login {

	/**
	 * ����action��ʱ��Ĭ��ִ��execute����
	 * Ȼ������action����·��
	 * 
	 * By:Ylj
	 * */

	private String Password;
	private Boolean Tag=true;
	private int Cond=0;
	
	public Str`ing execute() {
		
		Tag=Dispose.Login.IsTure(this.Password);
		
		if(Tag) {
			return "S";
		}else {
			return "F";
		}
	}
	
	public void setPassword(String Password) {
		this.Password=Password;
		if(this.Password!=null) {
			this.Cond=1;
		}
	}
	
	public void setTag(Boolean Tag) {
		this.Tag=Tag;
	}
	
	public String getPassword() {
		return this.Password;
	}
	
	public Boolean getTag() {
		return this.Tag;
	}
	
	public int getCond() {
		return this.Cond;
	}
	
	
}
