package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class HibernateTests {
	public static void main(String[] args) {
		// Khởi tạo session factory từ configration
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		
		// Tạo sesion (thread, luồng thực thi truy cập đến database) từ session factory
		// Cách 1: openSession --> luôn tạo ra session mới
		//multi thread
		Session s1 = sessionFactory.openSession();
		Session s2 = sessionFactory.openSession();
		
		System.out.println("s1--->"+System.identityHashCode(s1));
		System.out.println("s2--->"+System.identityHashCode(s2));
		
		// Cách 2: currentSession --> Khởi tạo ban đầu (cấu hình thêm chỗ hibernate configration)
		// Khởi tạo session factory, gọi getCurrentSession luôn trả về 1 đối tượng  session duy nhất
		Session s3 = sessionFactory.getCurrentSession();
		Session s4 = sessionFactory.getCurrentSession();
		System.out.println("s3--->"+System.identityHashCode(s3));
		System.out.println("s4--->"+System.identityHashCode(s4));
	}
}
