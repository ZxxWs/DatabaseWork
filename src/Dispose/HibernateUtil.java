package Dispose;


import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

/**
 * Session工厂类
 * 静态块在编译的时候添加配置文件
 * 有些代码未能看懂
 * 主要方法：获取Session、获取SessionFactry、关闭Session
 * 
 * 参考文献：《Java Web从入门到精通》P371
 * Time:2019.12.29
 * By:Zxx
 * */	
	
	
	private static final ThreadLocal<Session> thredLocal=new ThreadLocal<>();
	private static SessionFactory sessionFactory=null;
	
	static {
		try {
			Configuration cfg=new Configuration().configure("/hibernate.cfg.xml");		//添加配置文件
		    StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
	        sessionFactory = cfg.buildSessionFactory(serviceRegistry);

//	        sessionFactory=cfg.buildSessionFactory();
	        
		} catch (Exception e) {
			System.out.println("Session工厂创建失败");
			e.printStackTrace();
		}
	}
	
	//获取Session
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
	 * 重建Session工厂
	 * */
	public static void rebuildSessionFactory() {
		try {
			Configuration cfg=new Configuration().configure();
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		    sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	
		} catch (Exception e) {
			System.out.println("Session工厂创建失败");
			e.printStackTrace();
		}
	}
	
	//获取SessionFactory
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
