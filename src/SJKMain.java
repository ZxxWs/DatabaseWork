
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import Dispose.Crud;
import Dispose.FindInformation;
import Dispose.ShowCheckIn;
import TableClass.CheckIn;
import TableClass.Guest;

public class SJKMain {

	public static void main(String[] args) throws Exception {
		


		FindInformation findInformation=new FindInformation();
		findInformation.setByGno("001");
		ArrayList<Guest> arrayList=findInformation.getGuestList();
		ArrayList<CheckIn> arrayList2=findInformation.getCheakInList();
		
//		for (Guest g:arrayList) {
//			System.out.print(g.getGno());
//		}
		for(CheckIn c:arrayList2) {
			System.out.println(c.getCID());
		}
//		
	}

	

}
