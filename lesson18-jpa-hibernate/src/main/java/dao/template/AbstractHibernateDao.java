package dao.template;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class AbstractHibernateDao {
private SessionFactory sessionFactory;
	
	public AbstractHibernateDao() {
		sessionFactory = DbConnection.getSessionFactory();
	}
	
	protected Session openSession() {
		return sessionFactory.openSession();
	}
	
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
