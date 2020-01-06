package Dispose;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TableClass.Principal;

public class PrincipalUpdate {
	/**
	 * Principal对象的数据库更新类，一个静态方法：
	 * 			UpdateAllInformation-返回一个布尔Tag
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
			System.out.print("Dispose.PrincipalUpdate.UpdateAllInformation-失败");
			Tag=false;
		}
		HibernateUtil.closeSession();
		
		return Tag;
	}
}
