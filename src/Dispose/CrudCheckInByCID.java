package Dispose;

import java.math.BigInteger;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;

public class CrudCheckInByCID {
/**
 * ����������Dispose.Crud���е�Read�����޷�����CheckIn��
 * 			 ���Ե���дһ������ͨ��CheckIn��Ķ����CID��������ѯ�˶���
 * 			
 * ����������������̬����ReadByCID()-����ֵ�Ǹ�CheckIn����
 * 
 * 
 * Time:2020.1.3|19:16
 * By:Zxx
 * */
	
	public static CheckIn ReadByCID(BigInteger CID) {
		CheckIn checkIn=new CheckIn();
		
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			checkIn=(CheckIn) session.get(CheckIn.class,CID);
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.CrudCheckInByCID.ReadByCID-ʧ��");
		}
		HibernateUtil.closeSession();	
		return checkIn;
	}
	
	public static Boolean DeleteByCID(BigInteger CID) {
	
		Boolean Tag=true;
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			CheckIn checkIn=(CheckIn) session.get(CheckIn.class,CID);
//			CheckIn checkIn=new CheckIn();
//			checkIn.setCID(CID);
			session.delete(checkIn);
			session.flush();
//			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.CrudCheckInByCID.DeleteByCID-ʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
}

