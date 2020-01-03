package Dispose;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.Room;

public class RoomUpdate {

	
	public static Boolean ChangeRoomRcondition(Room room) {

		Boolean Tag=true;//添加成功与否,0为成功
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			
			Room newRoom=(Room) session.get(Room.class,room.getRno());
			if(newRoom.getRcondition()==0) {
				newRoom.setRcondition(1);
			}else {
				newRoom.setRcondition(0);
			}
			transaction.commit();
		} catch (Exception e) {
			System.out.print("更改失败");
			Tag=false;
		}
		HibernateUtil.closeSession();
		return Tag;	
	} 
}
