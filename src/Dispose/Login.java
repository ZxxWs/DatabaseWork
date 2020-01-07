package Dispose;

import java.util.ArrayList;

import TableClass.*;

public class Login {

	/**
	 * ÅĞ¶ÏÃÜÂëÊÇ·ñÕıÈ·
	 * 
	 * 
	 * */
	public static Boolean IsTure(String pass) {
		
		Boolean Tag=new Boolean(false);
		Crud<TableClass.Password> crud=new Crud<>();
		Password password=new Password("Root");
		ArrayList<Password> list=crud.Read(password,"");
		String re=list.get(0).getPass();
		if(re.equals(pass)) {
			Tag=true;
		}
		return Tag;
	}
	
}
