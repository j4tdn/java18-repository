package demo;

public class sachdemo {
	public static void main(String[] args) {
		sachgiai sg1 = new sachgiai("12","toan" , 12000, false);
		sachgiai sg2 = new sachgiai("13","ly" , 12000, true);
		sachgiai sg3 = new sachgiai("14","hoa" , 12000, true);
		sachgiai sg4 = new sachgiai("15","tin" , 12000, false);
		sachgiai sg5 = new sachgiai("16","anh" , 12000, true);
		
		sachgiakhoa sgk1= new sachgiakhoa("45", "su", 12120, 12);
		sachgiakhoa sgk2= new sachgiakhoa("45", "dia", 12120, 1);
		sachgiakhoa sgk3= new sachgiakhoa("45", "sinh", 12120, 17);
		
		sach[] sachs= {sg1,sg2,sg3,sg4,sg5,sgk1,sgk2,sgk3};
		for(sach sach : sachs) {
			if(sach instanceof sachgiai) {
				boolean x = ((sachgiai) sach).isMoi();
				if(x==true) {
					System.out.println(sach);
				}
			}
			if(sach instanceof sachgiakhoa) {
				double y = ((sachgiakhoa) sach).getThue();
				if(y>=10) {
					System.out.println(sach);
				}
			}
		}
		
	}
}
