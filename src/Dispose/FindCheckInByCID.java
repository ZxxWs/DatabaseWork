package Dispose;

import java.math.BigInteger;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;

public class FindCheckInByCID {
/**
 * 问题描述：Dispose.Crud类中的Read方法无法出理CheckIn类
 * 			 所以单独写一个类来通过CheckIn类的对象的CID属性来查询此对象
 * 			
 * 该类中目前只有一个静态方法getByCID()-返回值是个CheckIn对象
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
			System.out.print("Dispose.FindCheckInByCID.getByCID-失败");
		}
		HibernateUtil.closeSession();	

		return checkIn;
	}
	
}
