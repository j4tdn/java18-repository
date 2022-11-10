package control;
/*
 * khi dang duyet vong lap thu i trong n vong lap: neu gap "break"--> thoat khoi for
 * --> gap "continue" thoat khoi vong lap hien tai --> ket thuc som vong lap hien tai
 */
public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n = 10;
		for (int i=1; i<=n; i++)
		{
			System.out.println("--> start body ");
			if(i == 5) {
//				break
				continue;
			}
			System.out.println(i);
			System.out.println("end body<---");
		}
	}

}
