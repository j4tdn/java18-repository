package homework4;

public class AppCompany {
	public static void main(String[] args) {
		double Wage;
		Manager m1 = new Manager("Lê Hữu Quý", "8/2/2004", 500, 3);
		Generalinchief g1 = new Generalinchief("Nguyễn Văn A", "3/3/2001", 400, 3);
		Staff s1 = new Staff("Lê Văn B", "4/4/1999", 300, "java");
		Staff s2 = new Staff("Lê Nguyễn C", "5/9/1998", 300, "C++");
		CompanyA[] companyAs = { m1, g1, s1, s2 };
		for (CompanyA companyA : companyAs) {
			System.out.println(companyA);
		}
		for (CompanyA companyA : companyAs) {
			if (companyA instanceof Manager) {
				double a = ((Manager) companyA).getJobCoefficient();
				Wage = (companyA.getCoefficientsSalary() + a) * 3000000;
				System.out.println(companyA.getName() + " có lương là : " + Wage);
			}
			if (companyA instanceof Generalinchief) {
				Wage = companyA.getCoefficientsSalary() * 2200000;
				System.out.println(companyA.getName() + " có lương là : " + Wage);
			}
			if (companyA instanceof Staff) {
				Wage = companyA.getCoefficientsSalary() * 1250000;
				System.out.println(companyA.getName() + " có lương là : " + Wage);
			}
		}
	}
}
