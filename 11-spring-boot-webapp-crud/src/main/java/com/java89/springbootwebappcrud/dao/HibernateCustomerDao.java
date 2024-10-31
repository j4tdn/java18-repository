package com.java89.springbootwebappcrud.dao;

import com.java89.springbootwebappcrud.entity.Customer;
import com.java89.springbootwebappcrud.sorting.SortOrder;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Primary
public class HibernateCustomerDao implements CustomerDao {

	private EntityManager entityManager;

	@Autowired
	public HibernateCustomerDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Customer> getAll() {
		System.out.println("HibernateCustomerDao --> getAll ...");
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}

	@Override
	public List<Customer> getAll(SortOrder sortOrder) {
		// sortOrder#sortParams{new SortParam(first_name, true), new SortParam(last_name, false)}
		Session session = entityManager.unwrap(Session.class);

		return session.createNativeQuery("SELECT * FROM customer" + sortOrder.getSqlOrder(), Customer.class)
				.getResultList();
	}

	@Override
	public List<Customer> getAll(SortOrder sortOrder, int offset, int recordsPerPage) {
		final String sql = "SELECT * FROM customer " + sortOrder.getSqlOrder() + " LIMIT :offset, :rowcount";
		return entityManager.unwrap(Session.class)
				.createNativeQuery(sql, Customer.class)
				.setParameter("offset", offset)
				.setParameter("rowcount", recordsPerPage)
				.getResultList();
	}

	@Override
	public int countTotalRecords() {
		Session session = entityManager.unwrap(Session.class);
		// INT >>> BigInteger
		// Number >>> BigDecimal
		return (int) session.createNativeQuery("SELECT COUNT(*) counter FROM customer")
				.addScalar("counter", StandardBasicTypes.INTEGER)
				.uniqueResult();
	}

	@Override
	public Customer get(Long id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Customer.class, id);
	}

	@Override
	public void save(Customer customer) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(customer);
	}

	@Override
	public void delete(Long id) {
		Session session = entityManager.unwrap(Session.class);
		session.createQuery("DELETE FROM Customer WHERE id = :id")
				.setParameter("id", id)
				.executeUpdate();
	}

	@Override
	public List<Customer> search(String keyword) {
		// search by firstName || lastName with case insensitive
		Session session = entityManager.unwrap(Session.class);

		// additional: mark insensitive
		String sql = "SELECT * FROM customer \n"
				+ "WHERE first_name LIKE :keyword\n"
				+ "OR last_name LIKE :keyword";

		return session.createNativeQuery(sql, Customer.class)
				.setParameter("keyword", "%" + keyword + "%")
				.getResultList();
	}

}
