package Dispose;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.Room;

public class RoomDispose {

	
	public void Test() {
		Room room=new Room("001", "单人间",80, 0, "001");
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			
//			session=HibernateInitialize
			Transaction transaction=session.beginTransaction();
			session.save(room);
			transaction.commit();
		} catch (Exception e) {

			System.out.print("添加失败");
		}
		HibernateUtil.closeSession();
	}
	
}
