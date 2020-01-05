package Dispose;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;

public class CheckInUpdate {
/**
 * ��ס��ϵ�ĸ����ࡣ�����ֻ�о�̬����
 * �����������淽���Ĵ��½ṹһ��������ͨ���Ȳ�ѯ����Ҫ�Ķ���Ȼ��Ķ��������<����ݴ���ܲ>��
 * 		OutCheckIn-�˷�����-����˷�ʱ��
 * 		AddTimeCheckIn-��������-�޸���סʱ��
 * 		ChangeRoomCheckIn-�˷�����-�޸ķ�����˷�ʱ���BackNo
 * */
	
	
	//�����˷����ݿ⴦��-����˷�ʱ��
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
			System.out.print("Dispose.CheckInUpdate.OutCheckInʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	
	//��������-�����סʱ��
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
			System.out.print("Dispose.CheckInUpdate.AddTimeCheckInʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	//��������-�ı�ǰһ�����ӵ��˷�ʱ���BackNo
	public static Boolean ChangeRoomCheckIn(CheckIn checkIn,String NewRno) {

		Boolean Tag=new Boolean(true);
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			CheckIn newcheckIn=(CheckIn) session.get(CheckIn.class,checkIn.getCID());
			newcheckIn.setChangeTime(new Date());//��ӻ���ʱ��
			newcheckIn.setChangeNo(NewRno);//��ӻ�����ķ���
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.CheckInUpdate.ChangeRoomCheckInʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
	
	
}
