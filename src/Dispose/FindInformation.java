package Dispose;

import java.util.ArrayList;

import TableClass.CheckIn;
import TableClass.Guest;
import TableClass.Principal;
import TableClass.Room;

public class FindInformation {


/**
 * 查询界面的主要逻辑代码
 * 通过传过来的参数来查询
 * 
 * 被Action包的FindAction调用
 * Time:2020.1.1|20:05
 * By:Zxx
 * 
 * */


	private ArrayList<Room> RoomList;
	private ArrayList<CheckIn> CheckInList;
	private ArrayList<Guest> GuestList;
	private ArrayList<Principal> PrincipalList;
	
	
	//通过身份证号查询
	public void setByGno(String Gno) {
		
		String HQL="from CheckIn where Gno="+Gno;//001
		
		Guest guest=new Guest();
		CheckIn checkIn=new CheckIn();
		guest.setGno(Gno);
		
		Crud<Guest> crud=new Crud<>();
		this.GuestList=crud.Read(guest,"");//查询客人表
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//查询入住关系表
		
	}
	

	//通过房间号查询
	public void setByRno(String Rno) {
		
		
		
		
	}
	

	//通过管理员工号查询
	public void setByPno(String Pno) {
		
		
		
		
	}
	
	
	public ArrayList<Room> getRoomList(){
		return this.RoomList;
	}
	
	public ArrayList<CheckIn> getCheakInList() {
		return this.CheckInList;
	}
	
	public ArrayList<Guest> getGuestList(){
		return this.GuestList;
	}
	
	public ArrayList<Principal> getPrincipalList(){
		return this.PrincipalList;
	}
	
}
