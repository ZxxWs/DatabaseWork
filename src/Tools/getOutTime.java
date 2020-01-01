package Tools;
//工具包用于格式转化


import java.util.Date;

import TableClass.CheckIn;


/**
 * 
 * 用于计算入住截止时间的工具类
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
