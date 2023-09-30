package dao.template;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DBconnection;

public class AbstractHibernateDao {
	private static SessionFactory sessionFactory;
	
	public AbstractHibernateDao() {
		sessionFactory = DBconnection.getSessionFactory();
	}
	
	protected Session openSession() {
		return sessionFactory.openSession();
	}
	
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
