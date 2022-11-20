package utils;

import java.time.LocalDate;

import bean.Device;
import bean.DeviceDetail;
import bean.Order;

public class Utils {
	public Utils() {
	
	}
	
	public static Double sumTotal(Order order) {

		Double total = 0.0;

		DeviceDetail[] details = order.getDevicedetails();

		for (DeviceDetail detail : details) {
			Device device = detail.getDevice();

			Double idCost = device.getPrice() * detail.getQuantity();

			if (device.getPrice() > 590.000 && LocalDate.of(2021, 5, 5).equals(order.getTime().getDayOfMonth())) {
				idCost = idCost * 0.9;
			}

			total += idCost;
		}

		return total;
	}
	
}
