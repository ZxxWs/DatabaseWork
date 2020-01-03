package Dispose;

import java.math.BigInteger;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;

public class FindCheckInByCID {
/**
 * ����������Dispose.Crud���е�Read�����޷�����CheckIn��
 * 			 ���Ե���дһ������ͨ��CheckIn��Ķ����CID��������ѯ�˶���
 * 			
 * ������Ŀǰֻ��һ����̬����getByCID()-����ֵ�Ǹ�CheckIn����
 * 
 * Time:2020.1.3|19:16
 * By:Zxx
 * */
	
	
	public static CheckIn getByCID(BigInteger CID) {
		CheckIn checkIn=new CheckIn();
		
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			checkIn=(CheckIn) session.get(CheckIn.class,CID);
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.FindCheckInByCID.getByCID-ʧ��");
		}
		HibernateUtil.closeSession();	

		return checkIn;
	}
	
}
