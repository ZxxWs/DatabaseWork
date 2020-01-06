package Dispose;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.Principal;

public class PrincipalUpdate {
	/**
	 * Principal��������ݿ�����࣬һ����̬������
	 * 			UpdateAllInformation-����һ������Tag
	 * 
	 * 
	 * */
	
	public static Boolean UpdateAllInformation(String NewPno,String Pname,String OldPno) {
		Boolean Tag=true;
		
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			
			Principal principal=(Principal) session.get(Principal.class,OldPno);
			principal.setPno(NewPno);
			principal.setPname(Pname);
			transaction.commit();
		} catch (Exception e) {
			System.out.print("Dispose.PrincipalUpdate.UpdateAllInformation-ʧ��");
			Tag=false;
		}
		HibernateUtil.closeSession();
		
		return Tag;
	}
}
