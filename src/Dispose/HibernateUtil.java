package Dispose;


import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

/**
 * Session������
 * ��̬���ڱ����ʱ����������ļ�
 * ��Щ����δ�ܿ���
 * ��Ҫ��������ȡSession����ȡSessionFactry���ر�Session
 * 
 * �ο����ף���Java Web�����ŵ���ͨ��P371
 * Time:2019.12.29
 * By:Zxx
 * */	
	
	
	private static final ThreadLocal<Session> thredLocal=new ThreadLocal<>();
	private static SessionFactory sessionFactory=null;
	
	static {
		try {
			Configuration cfg=new Configuration().configure("/hibernate.cfg.xml");		//��������ļ�
		    StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
	        sessionFactory = cfg.buildSessionFactory(serviceRegistry);

//	        sessionFactory=cfg.buildSessionFactory();
	        
		} catch (Exception e) {
			System.out.println("Session��������ʧ��");
			e.printStackTrace();
		}
	}
	
	//��ȡSession
	public static Session getSession() throws HibernateError {
		Session session=(Session)thredLocal.get();
		if(session==null||!session.isOpen()) {
			if(sessionFactory==null) {
				rebuildSessionFactory();
			}
			session=(sessionFactory!=null)?sessionFactory.openSession():null;
			thredLocal.set(session);
		}
		return session;
	}
	
	/**
	 * �ؽ�Session����
	 * */
	public static void rebuildSessionFactory() {
		try {
			Configuration cfg=new Configuration().configure();
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		    sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	
		} catch (Exception e) {
			System.out.println("Session��������ʧ��");
			e.printStackTrace();
		}
	}
	
	//��ȡSessionFactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSession() throws HibernateError {
		Session session=(Session)thredLocal.get();
		thredLocal.set(null);
		if(session!=null) {
			session.close();
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
