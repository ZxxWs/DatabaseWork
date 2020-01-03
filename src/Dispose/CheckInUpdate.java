package Dispose;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;
import TableClass.Room;

public class CheckInUpdate {
/**
 * ��ס��ϵ�ĸ����ࡣ�����ֻ�о�̬����
 * 
 * */
	
	
	
	//����˷�ʱ��
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
			System.out.print("CheckInUpdate.OutCheckInʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	//��������-�����סʱ��
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
			System.out.print("CheckInUpdate.AddTimeCheckInʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	
	
}
