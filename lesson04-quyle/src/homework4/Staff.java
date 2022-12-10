package homework4;

public class Staff extends CompanyA{
private String unitName;
public Staff() {
	// TODO Auto-generated constructor stub
}
public Staff(String name, String dateOfBirth, double coefficientsSalary, String unitName) {
	super(name, dateOfBirth, coefficientsSalary);
	this.unitName = unitName;
}
public String getUnitName() {
	return unitName;
}
public void setUnitName(String unitName) {
	this.unitName = unitName;
}
@Override
public String toString() {
	return super.toString() + "Staff " + unitName  ;
}

}
