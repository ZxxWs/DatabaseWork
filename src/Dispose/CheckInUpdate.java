package Dispose;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;
import TableClass.Room;

public class CheckInUpdate {
/**
 * 入住关系的更新类。想的是只有静态方法
 * 方法：
 * 		OutCheckIn退房处理-添加退房时间
 * 		AddTimeCheckIn续房功能-修改入住时间
 * */
	
	
	//客人退房数据库处理-添加退房时间
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
			System.out.print("Dispose.CheckInUpdate.OutCheckIn失败");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	
	//续房功能-添加入住时间
	public static Boolean AddTimeCheckIn(CheckIn checkIn,int AddTime,double AddMoney) {
		
		Boolean Tag=new Boolean(true);
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			CheckIn newcheckIn=(CheckIn) session.get(CheckIn.class,checkIn.getCID());
			AddTime=newcheckIn.getAllTime()+AddTime;
			AddMoney=newcheckIn.getAllMoney()+AddMoney;
			newcheckIn.setAllTime(AddTime);
			newcheckIn.setAllMoney(AddMoney);
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.CheckInUpdate.AddTimeCheckIn失败");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
}
