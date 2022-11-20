package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import bean.Customer;
import bean.Device;
import bean.DeviceDetail;
import bean.Order;
import utils.Utils;

public class App {
	public static void main(String[] args) {
		Customer customer = new Customer("A", 2468, 234, "Le Van Hien");

		Device device = new Device(9, "ios", "black", 22d);
		Device device2 = new Device(9, "android", "black", 22d);

		DeviceDetail[] details1 = new DeviceDetail[] { new DeviceDetail(device, 2) };

		Order order = new Order(customer, details1,

				LocalDateTime.of(LocalDate.now(), LocalTime.now()));

		System.out.println("Tổng tiền khách hàng phải trả là: "+Utils.sumTotal(order));
		
		System.out.println("-------------------------------------------");
		System.out.println("Thông tin Khách hàng:");
		System.out.println(order.getCustomer().toString());
		
		System.out.println("-------------------------------------------");
		System.out.println("Thông tin thiết bị");
		
		for (DeviceDetail a : order.getDevicedetails()) {
			System.out.println(a.getDevice().toString() + "Số lượng: " + a.getQuantity());
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Thời gian đặt hàng:"+order.getTime());

	}

}
