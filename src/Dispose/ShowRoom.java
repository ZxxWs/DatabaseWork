package Dispose;

import java.util.ArrayList;

import TableClass.Room;

public class ShowRoom {

	private ArrayList<Room> RoomList;
	
	public ArrayList<Room> getRoomList() {
		/**
		 * ���ڲ�ѯRoom���з������˵ı�
		 * ����ֵΪһ�������б�
		 * ��Ӧ���Ǳ�SelectPage����ã�
		 * By:Ylj
		 * */
		Crud<Room> crud=new Crud<>();
		this.RoomList=crud.Read(new Room(),"from Room where Rcondition=0");
		
		return this.RoomList;
	}

	
}
