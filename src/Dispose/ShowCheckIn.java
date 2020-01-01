package Dispose;

import java.util.ArrayList;
import java.util.Date;

import TableClass.CheckIn;
import Tools.getOutTime;

public class ShowCheckIn {
/**
 * 
 * 用于展示换、退、续房的初始化界面
 * 查询CheckIn表
 * 被SelectPage类调用
 * 
 * 
 * */
	
	private ArrayList<CheckIn> CheckInList;
	
	
	
	//查询未退房的CheckIn表
	public ArrayList<CheckIn> getCheckInList() {
		
		
		Crud<CheckIn> crud=new Crud<>();
		String HQL="from CheckIn where OutTime is null";
		CheckIn checkIn=new CheckIn();
		this.CheckInList=crud.Read(checkIn,HQL);

		getOutTime gTime=new getOutTime();
		for(CheckIn c:this.CheckInList) {
			Date d=gTime.toTime(c);
			c.setOutTime(d);
		}
		
			System.out.print("\n");
		
		return this.CheckInList;
	}
	
	
	
}
