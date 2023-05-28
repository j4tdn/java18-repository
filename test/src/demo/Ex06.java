package demo;

import java.util.ArrayList;
import java.util.List;

import bean.Trader;
import utils.Fileutils;

public class Ex06 {
	public static void main(String[] args) {
		List<String> lines = Fileutils.readfile("trader.txt");
		lines.forEach(s -> System.out.println(s));
		System.out.println("=======================");
		List<Trader> traders = new ArrayList<>();
		for(String line : lines) {
			String[] tokens = line.split("-");
			if(tokens.length == 2) {
				Trader trader = new Trader(tokens[0], tokens[1]);
				traders.add(trader);
			}
		}
		traders.forEach(System.out::println);
		
	}

	
}
