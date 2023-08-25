package utils;

import java.security.cert.X509CRLSelector;
import java.util.List;

import javax.lang.model.element.VariableElement;

public class SqlUtils {

	private SqlUtils() {

	}
	
	public static void close(AutoCloseable ... objectNeedToBeClosed) {
		for(AutoCloseable closeableObject: objectNeedToBeClosed) {
			try {
				closeableObject.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void generate(String text, Runnable runnable) {
		System.out.println(text + " ----> {");
		System.out.print("   running .... ");
		runnable.run();
		System.out.println("}\n");
	}
	
	public static void generate(String text, Object ... elements) {
		System.out.println(text + "---> {" );
		for(Object element: elements) {
			System.out.println("   " + element);
		}
		System.out.println("}\n");
	}
	
	public static <Element> void generate(String text, List<Element> elements) {
		System.out.println(text + "---> {" );
		elements.forEach(element ->{
			System.out.println("   " + element);
		});
		System.out.println("}\n");
	}
	
}
