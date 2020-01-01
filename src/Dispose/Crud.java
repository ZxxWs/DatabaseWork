package Dispose;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Crud<Obj> {
/**
 * 采用泛型技术 将数据库表的操作都写到一个类中
 * 包含四个方法
 * C：create
 * R：read
 * U：update--未写
 * D：delete--未写
 * 
 * 
 * */
	
	public void Create(Obj obj) {
		Session session = null;
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			session.save(obj);
			transaction.commit();
		} catch (Exception e) {
			System.out.print("添加失败");
		}
		HibernateUtil.closeSession();
	}
	
	
	
	/**
	 * 查询方法。两个参数：一个表的对象，一个String语句
	 * 当String不空时，通过HQL语句查询
	 * 当String为空时，通过Obj对象查询整个表
	 * 								  或者通过对象主键查询某个对象
	 * 
	 * */
	@SuppressWarnings("unchecked")
	public ArrayList<Obj> Read(Obj obj,String HQL) {
		
		ArrayList<Obj> ReList=new ArrayList<>();
		Session session = null;
		
		try {
			session=HibernateUtil.getSession();
			Transaction transaction=session.beginTransaction();
			if(HQL.equals("")) {
				if(obj.toString()==null) {//查询整个表
					String hql = "from "+obj.getClass().toString().substring(obj.getClass().toString().lastIndexOf(".")+1); // from 后跟的是要查询的对象，而不是表
					Query query = session.createQuery(hql);
					ReList = (ArrayList<Obj>) query.list();
				}
				else{//通过主键来查询某个对象
					ReList.add((Obj) session.get(obj.getClass(),obj.toString()));
				}
			}	
			else {//通过语句来查询对象列表
				Query query = session.createQuery(HQL);
				ReList = (ArrayList<Obj>) query.list();
			}
			transaction.commit();
		} catch (Exception e) {
			System.out.print("查询失败");
		}
		HibernateUtil.closeSession();
		return ReList;
		

	}
	
	public void Update(Obj obj) {
		
	}
	
	public void Delete() {
		
	}
	

	
}
