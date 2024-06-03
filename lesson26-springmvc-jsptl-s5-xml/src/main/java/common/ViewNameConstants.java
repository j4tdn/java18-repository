package common;

public final class ViewNameConstants {
	
	private ViewNameConstants() {
	}
	
	private static final String STARTPAGE = "startpage";
	
	private static final String STUDENT_PAGE = "student";
	
	private static final String CUSTOMER_PAGE = "customer";
	
	private static final String EMPLOYEE_PAGE = "employee";
	
	private static final String INDEX = "index";
	
	private static final String REGISTER = "register";
	
	private static final String SUCCESS = "success";
	
	// ================= start page =============================
	public static final String VN_STARTPAGE_INDEX = STARTPAGE + "/" + INDEX;
	
	// ================= student page =============================
	public static final String VN_STUDENT_PAGE_INDEX = STUDENT_PAGE + "/" + INDEX;
	public static final String VN_STUDENT_PAGE_REGISTER = STUDENT_PAGE + "/" + REGISTER;
	public static final String VN_STUDENT_PAGE_SUCCESS = STUDENT_PAGE + "/" + SUCCESS;
	
	// ================= customer page =============================
	public static final String VN_CUSTOMER_PAGE_INDEX = CUSTOMER_PAGE + "/" + INDEX;
	
	// ================= employee page =============================
	public static final String VN_EMPLOYEE_PAGE_INDEX = EMPLOYEE_PAGE + "/" + INDEX;
}
