package Dispose;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.Guest;

public class GuestUpdate {
/**
 * 用于顾客信息更新
 * 
 * 
 * 
 * */
	
	public static Boolean UpdateAllInformation(String NewGno,String Gname,String Gtel,String OldGno) {
		Boolean Tag=new Boolean(true);

		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			Guest guest=(Guest) session.get(Guest.class,OldGno);
			
			guest.setGno(NewGno);
			guest.setGname(Gname);
			guest.setGtel(Gtel);
			
			int IntSex=Integer.valueOf(NewGno.charAt(16));
			String Sex="";
			{//性别判断
				if(IntSex%2!=0) {
					Sex="男";
				}else {
					Sex="女";
				}
			}
			guest.setGsex(Sex);
			
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.RoomUpdate.UpdateAllInformation-失败");
			Tag=false;
		}
		HibernateUtil.closeSession();
		
		return Tag;
	}
	
}


















