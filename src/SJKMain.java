import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

import com.mysql.jdbc.StringUtils;
import com.sun.swing.internal.plaf.basic.resources.basic;

import Dispose.Crud;
import Dispose.RoomUpdate;
import TableClass.CheckIn;
import TableClass.Guest;
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
		
		
		
	}


	public static void main(String[] args) throws Exception {
		a();
		b();
	}
	

}
