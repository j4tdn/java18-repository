package demo;

import bean.Itemm;

public class Ex02ItemmApp {
	public static void main(String[] args) {
		Itemm item1 = new Itemm(1,"item1","Vietnam",120);
		Itemm item2 = new Itemm(2,"item2","Lao",250);
		double t1 = totalOfSalesPrice(item1, item2);
		System.out.println("tt cua i1 , i2 == " + t1);
	}
	private static double totalOfSalesPrice(Itemm item1,Itemm item2) {
		return item1.getSalesPrice() + item2.getSalesPrice();
	}
}
