package Dispose;

import java.util.ArrayList;

import TableClass.CheckIn;
import TableClass.Guest;
import TableClass.Principal;
import TableClass.Room;

public class FindInformation {

/**
 * ��������	��	��	��	��	��	��	��	��	��	��	��	��	��	��	
 * ��ѯ�������Ҫ�߼�����
 * ͨ���������Ĳ�������ѯ
 * 
 * ��Action����FindAction����
 * Time:2020.1.1|20:05
 * By:Zxx
 * */


	private ArrayList<Room> RoomList;
	private ArrayList<CheckIn> CheckInList;
	private ArrayList<Guest> GuestList;
	private ArrayList<Principal> PrincipalList;
	
	/**
	 *ͨ�����֤�Ų�ѯ 
	 *��Guest���CheckIn���ѯ
	 * */
	public void setByGno(String Gno) {
		
		String HQL="from CheckIn where Gno="+Gno;
		Guest guest=new Guest();
		CheckIn checkIn=new CheckIn();
		guest.setGno(Gno);
		
		Crud<Guest> crud=new Crud<>();
		this.GuestList=crud.Read(guest,"");//��ѯ���˱�
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//��ѯ��ס��ϵ��
		
	}
	
	/**
	 * ͨ������Ų�ѯ
	 * ��Ҫ��ѯRoom��CheckIn��
	 * */
	public void setByRno(String Rno) {
		
		String HQL="from CheckIn where Rno="+Rno;

		Room room=new Room();
		CheckIn checkIn=new CheckIn();
		room.setRno(Rno);
		
		Crud<Room> crud=new Crud<>();
		this.RoomList=crud.Read(room,"");//�÷���Ų�ѯ�����
		
		Crud<CheckIn> crud2=new Crud<>();
		this.CheckInList=crud2.Read(checkIn,HQL);//�÷���Ų�ѯ��ס��ϵ��
		
	}
	

	//ͨ������Ա���Ų�ѯ
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
