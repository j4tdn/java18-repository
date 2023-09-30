package dao.template;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Query;
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
	
	@SuppressWarnings("unchecked")
	protected <T> List<T> sefeList(Query<?> query){
		return (List<T>)query.getResultList();
	}
}
