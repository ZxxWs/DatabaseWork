package Dispose;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.Guest;
import TableClass.Password;

public class PasswordUpdate {
/**
 * �����޸��������
 * 
 * */
	public static Boolean ChangePassWord(String Pass) {
		Boolean Tag=new Boolean(true);

		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();

			Password password=(Password) session.get(Password.class,"Root");			

			password.setPass(Pass);
			
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.RoomUpdate.UpdateAllInformation-ʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();
		
		return Tag;
	}
	
}
