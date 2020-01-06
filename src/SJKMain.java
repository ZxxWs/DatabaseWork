import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mysql.jdbc.StringUtils;
import com.sjk.action.ChangeRoomInformation_Show;
import com.sun.swing.internal.plaf.basic.resources.basic;

import Dispose.CheckInUpdate;
import Dispose.Crud;
import Dispose.CrudCheckInByCID;
import Dispose.HibernateUtil;
import Dispose.RoomUpdate;
import TableClass.CheckIn;
import TableClass.Guest;
import TableClass.Principal;
import TableClass.Room;

public class SJKMain {

		
	
	public static void a(){
	/**
//			String a="123456789012345678";
//			System.out.println(a.charAt(16));
			
//			Room room=new Room();
//			room.setRno("001");
//			RoomUpdate.ChangeRoomRcondition(room);	
			CheckIn checkIn=new CheckIn();
//			checkIn.setAllTime(24);
//			checkIn.setInTime(new Date());
//			checkIn.setRno("001");
//			checkIn.setAllMoney(34);
//			checkIn.setGno("187898278876765676");

			String H="from CheckIn where CID=10000000000000000016";
//			checkIn.setCID(new BigInteger("10000000000000000016"));
//			Room room=new Room();
			Crud<CheckIn> crud=new Crud<>();
//			crud.Create(checkIn);
//			Crud<Room> crud2=new Crud<>();
			//System.out.println(checkIn.getCID());
			
			ArrayList<CheckIn> checkIns=crud.Read(checkIn,H);
//			for(CheckIn c:checkIns) {
//				System.out.println(c.getInTime());
//			}
//////			room.setRno("001");
//			crud2.Read(room,"");
//			
		//	room.setRno(checkIns.get(0).getRno());
			//RoomUpdate.ChangeRoomRcondition(room);
//			
//			Guest guest=new Guest();
//			guest.setGno("187898278876765676");
//			Crud<Guest> crud=new Crud<>();
//			crud.Read(guest, "");
			*/
	}
	
	private static void b() {
		
/**		CheckIn checkIn=new CheckIn();
//		checkIn.setCID(new BigInteger("10000000000000000065"));
		
//		Crud<CheckIn> crud=new Crud<>();
//		Crud<Room> crud2=new Crud<>();
//		Room room=new Room();
//		room.setRno("111");
//		crud2.Delete(room);
//		crud.Delete(checkIn);
//		crud.Delete(checkIn);
//		crud.Read(checkIn,"");
//		CheckInUpdate.OutCheckIn(checkIn);
//		FindCheckInByCID.getByCID(checkIn.getCID());
//		Room room=new Room();
//		Crud<Room> crud=new Crud<>();
//		String Rtype="单人间";
//		String HQL="from Room where Rcondition=0 and Rtype='单人间'";//查询可以换的房间
//		crud.Read(room, HQL);
//		this.CanRoomList=rooms;
//		if(CrudCheckInByCID.DeleteByCID(new BigInteger("10000000000000000065"))) {
//			System.out.print("\n\n\nasasa\n\n\n");
//		}
//		Crud<Principal> crud=new Crud<>();
//		Principal principal=new Principal();
//		principal.setPno("004");
//		crud.Delete(principal);
//		Room room=new Room();
//		room.setRno("004");
//		Principal principal=new Principal();
//		principal.setPno("004");
//		
//		Session session = null;
//
//		try {
//			session=HibernateUtil.getSession();
//			Transaction transaction=session.beginTransaction();
////			Obj NewObj=(Obj) session.get(obj.getClass(),obj.toString());
////			Room room2=(Room) session.get(Room.class,room.getRno());
//			Principal principal2=(Principal) session.get(Principal.class,principal.getPno());
////			System.err.println(NewObj.toString());
//			if(principal2!=null) {
//
//				session.delete(principal2);
//				session.flush();
//			}
//			transaction.commit();
//		} catch (Exception e) {
//			System.out.print(principal.toString()+"-删除失败\n");
//			e.printStackTrace();
////			Tag=false;
//		}
//		HibernateUtil.closeSession();
//		
		*/
	}

	
	private static void c() {
		
	}

	public static void main(String[] args) throws Exception {
		a();
		b();
		c();
	}
	

}
