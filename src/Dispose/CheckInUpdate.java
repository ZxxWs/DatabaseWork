package Dispose;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;

public class CheckInUpdate {
/**
 * 入住关系的更新类。想的是只有静态方法
 * 方法：（下面方法的大致结构一样，都是通过先查询到想要的对象，然后改对象的属性<但这份代码很差劲>）
 * 		OutCheckIn-退房处理-添加退房时间
 * 		AddTimeCheckIn-续房功能-修改入住时间
 * 		ChangeRoomCheckIn-退房功能-修改房间的退房时间和BackNo
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
	
	//换房功能-改变前一个房子的退房时间和BackNo
	public static Boolean ChangeRoomCheckIn(CheckIn checkIn,String NewRno) {

		Boolean Tag=new Boolean(true);
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			CheckIn newcheckIn=(CheckIn) session.get(CheckIn.class,checkIn.getCID());
			newcheckIn.setChangeTime(new Date());//添加换房时间
			newcheckIn.setChangeNo(NewRno);//添加换房后的房间
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.CheckInUpdate.ChangeRoomCheckIn失败");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	
}
