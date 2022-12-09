package inhertance;

//require: login
//optional: login2Step

public abstract class EmailServide {
	//require override in sub classes
	//abstract methed
	abstract void login();
	
	void login2Steps() {
		System.out.println("Optionnal --> login whit 2 step ...");
	}
	
	
}
