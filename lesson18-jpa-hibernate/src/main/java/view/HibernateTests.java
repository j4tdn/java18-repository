package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class HibernateTests {
	
	public static void main(String[] args) {
		
		// Khởi tạo session factory từ configuration
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		
		// Tạo session (giống thread - luồng thực thi truy cập dến DB) từ session factory
		
		
		// Cách 1: openSession --> luôn tạo ra session mới
		// multi thread
		Session s1 = sessionFactory.openSession();
		Session s2 = sessionFactory.openSession();
		
		System.out.println("s1 --> " + System.identityHashCode(s1));
		System.out.println("s2 --> " + System.identityHashCode(s2));
		
		// Cách 2: currentSession --> khởi tạo ban đầu khi tạo session factory
		// Khi gọi getCurrentSession --> luôn trả về 1 đối tượng session duy nhất
		// --> Cần cấu hình thêm chỗ Hibernate configuration để thực hiện idea này
		// singleton - single thread
		Session s3 = sessionFactory.getCurrentSession();
		Session s4 = sessionFactory.getCurrentSession();
		
		System.out.println("\ns3 --> " + System.identityHashCode(s3));
		System.out.println("s4 --> " + System.identityHashCode(s4));
		
		
	}

}
