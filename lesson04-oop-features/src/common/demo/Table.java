package common.demo;

import inheritance.Rectangle;

public class Table extends Rectangle{
	public static void main(String[] args) {
		Table table = new Table();
		table.paint();
		table.clear(); // lớp con kế thừa từ lớp cha và phương thức clear có phạm vi truy cập là protected
	}
}
