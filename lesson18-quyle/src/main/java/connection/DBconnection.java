package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBconnection {
	private static final String HIBERNATE_CFG_XML = "hibernate.cfg.xml";
	private static SessionFactory sessionFactory;
	
	private DBconnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure(HIBERNATE_CFG_XML).buildSessionFactory();
		}
		return sessionFactory;
	}
}
