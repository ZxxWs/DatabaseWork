package Dispose;

import java.util.ArrayList;
import java.util.Date;

import TableClass.CheckIn;
import Tools.getOutTime;

public class ShowCheckIn {
/**
 * 
 * ����չʾ�����ˡ������ĳ�ʼ������
 * ��ѯCheckIn��
 * 
 * 
 * */
	
	private ArrayList<CheckIn> CheckInList;
	
	/**
	 * ��ѯδ�˷���CheckIn��
	 * ��SelectPage�����
	 * ����ѯ����Ķ���OutTime��������ΪԤ���˷�ʱ��
	 * 
	 * */
	
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
		return this.CheckInList;
	}
}
