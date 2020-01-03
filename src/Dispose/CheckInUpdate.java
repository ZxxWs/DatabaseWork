package Dispose;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;
import TableClass.Room;

public class CheckInUpdate {
/**
 * 入住关系的更新类。想的是只有静态方法
 * 
 * */
	
	
	
	//添加退房时间
	public static Boolean OutCheckIn(CheckIn checkIn) {
		
		Boolean Tag=new Boolean(true);
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			CheckIn newcheckIn=(CheckIn) session.get(CheckIn.class,checkIn.getCID());
			newcheckIn.setOutTime(new Date());
			transaction.commit();
		} catch (Exception e) {
			System.out.print("CheckInUpdate.OutCheckIn失败");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	//续房功能-添加入住时间
	public static Boolean AddTimeCheckIn(CheckIn checkIn) {
		
		Boolean Tag=new Boolean(true);
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			
			CheckIn newcheckIn=(CheckIn) session.get(CheckIn.class,checkIn.getCID());
			newcheckIn.setOutTime(new Date());
			transaction.commit();
		} catch (Exception e) {
			System.out.print("CheckInUpdate.AddTimeCheckIn失败");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	
	
}
