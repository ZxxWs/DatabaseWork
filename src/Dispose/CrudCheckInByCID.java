package Dispose;

import java.math.BigInteger;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.CheckIn;

public class CrudCheckInByCID {
/**
 * 问题描述：Dispose.Crud类中的Read方法和Delete方法无法处理CheckIn类
 * 			 所以单独写一个类来通过CheckIn类的对象的CID属性来查询此对象
 * 			
 * 该类中有两个个静态方法ReadByCID()-返回值是个CheckIn对象
 * 						 DeleteByCID-通过CID来删除CheckIn对象
 * 
 * Time:2020.1.3|19:16
 * By:Bq
 * 
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
			System.out.print("Dispose.CrudCheckInByCID.ReadByCID-失败");
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
			if(checkIn!=null) {
				session.delete(checkIn);
				session.flush();
			}
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.CrudCheckInByCID.DeleteByCID-失败");
			Tag=false;
		}
		HibernateUtil.closeSession();	
		return Tag;
	}
}

