package Tools;
//���߰����ڸ�ʽת��


import java.util.Date;

import TableClass.CheckIn;


/**
 * 
 * ���ڼ�����ס��ֹʱ��Ĺ�����
 * 
 * */
public class getOutTime {

	
	@SuppressWarnings("deprecation")
	
	public Date toTime(CheckIn checkIn) {
		
		Date ReDate=new Date(checkIn.getInTime().getTime());
		
		int AllTime= ReDate.getMinutes()+(int)checkIn.getAllTime()*60;

		ReDate.setMinutes(AllTime);
		return ReDate;
	}
	
	
	
}
