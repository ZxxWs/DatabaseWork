package Dispose;

import java.util.ArrayList;

import TableClass.Room;

public class ShowRoom {

	private ArrayList<Room> RoomList;
	
	public ArrayList<Room> getRoomList() {
		/**
		 * 用于查询Room表中房间无人的表
		 * 返回值为一个对象列表
		 * （应该是被SelectPage类调用）
		 * By:Ylj
		 * */
		Crud<Room> crud=new Crud<>();
		this.RoomList=crud.Read(new Room(),"from Room where Rcondition=0");
		
		return this.RoomList;
	}

	
}
