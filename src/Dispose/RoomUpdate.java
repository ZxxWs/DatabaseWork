package Dispose;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.Room;

public class RoomUpdate {
/**
 * 房间表的数据库处理。
 * 方法：
 * 		ChangeRoomRcondition-修改房间的状态（静态）
 * */
	
	public static Boolean ChangeRoomRcondition(Room room) {
		Boolean Tag=true;//修改成功与否
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
			System.out.print("Dispose.RoomUpdate.ChangeRoomRcondition-失败");
			Tag=false;
		}
		HibernateUtil.closeSession();
		return Tag;	
	} 
	
	public static Boolean UpdateAllInformation(String OldRno,String Rtype,double Rprice,int Rcondition,String Pno,String NewRno) {
		Boolean Tag=true;
		
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			
			Room room=(Room) session.get(Room.class,OldRno);
			room.setRno(NewRno);
			room.setRtype(Rtype);
			room.setRprice(Rprice);
			room.setRcondition(Rcondition);
			room.setPno(Pno);
			
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.RoomUpdate.UpdateAllInformation-失败");
			Tag=false;
		}
		HibernateUtil.closeSession();
		
		return Tag;
	}
	
	
	
	
}






















