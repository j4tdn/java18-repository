package test;

import model.CouterModel;
import view.CouterView;

public class Test {
	public static void main(String[] args) {
		CouterModel ct =  new CouterModel();
		ct.increment();
		ct.increment();
		ct.increment();
		System.out.println(ct.getValue());
		ct.decrement();
		ct.decrement();
		System.out.println(ct.getValue());
		
		CouterView ctv = new CouterView(); 
	}
}
