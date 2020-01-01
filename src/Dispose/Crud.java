package Dispose;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Crud<Obj> {
/**
 * ���÷��ͼ��� �����ݿ��Ĳ�����д��һ������
 * �����ĸ�����
 * C��create
 * R��read
 * U��update--δд
 * D��delete--δд
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
			System.out.print("���ʧ��");
		}
		HibernateUtil.closeSession();
	}
	
	
	
	/**
	 * ��ѯ����������������һ����Ķ���һ��String���
	 * ��String����ʱ��ͨ��HQL����ѯ
	 * ��StringΪ��ʱ��ͨ��Obj�����ѯ������
	 * 								  ����ͨ������������ѯĳ������
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
				if(obj.toString()==null) {//��ѯ������
					String hql = "from "+obj.getClass().toString().substring(obj.getClass().toString().lastIndexOf(".")+1); // from �������Ҫ��ѯ�Ķ��󣬶����Ǳ�
					Query query = session.createQuery(hql);
					ReList = (ArrayList<Obj>) query.list();
				}
				else{//ͨ����������ѯĳ������
					ReList.add((Obj) session.get(obj.getClass(),obj.toString()));
				}
			}	
			else {//ͨ���������ѯ�����б�
				Query query = session.createQuery(HQL);
				ReList = (ArrayList<Obj>) query.list();
			}
			transaction.commit();
		} catch (Exception e) {
			System.out.print("��ѯʧ��");
		}
		HibernateUtil.closeSession();
		return ReList;
		

	}
	
	public void Update(Obj obj) {
		
	}
	
	public void Delete() {
		
	}
	

	
}
