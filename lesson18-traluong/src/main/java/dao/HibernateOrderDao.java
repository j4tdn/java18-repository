package dao;

import java.util.List;

import dao.template.AbstractHibernateDao;
import persistence.Order;

public class HibernateOrderDao extends AbstractHibernateDao implements OrderDao {
	
	private final String GET_ALL_ORDER = "SELECT * FROM `order`";
	
	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return openSession().createNativeQuery(GET_ALL_ORDER, Order.class)
				.getResultList();
	}
}
