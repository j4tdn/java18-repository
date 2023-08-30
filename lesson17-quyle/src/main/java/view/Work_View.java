package view;

import dao.GoodStudentWork;
import dao.JdbcGoodStudentWork;
import dao.JdbcStudenWork;
import dao.JdbcStudentOnClass;
import dao.StudentOnClassWork;
import dao.StudentWork;
import utils.SqlUtils;

public class Work_View {
	private static StudentWork studentWork;
	private static GoodStudentWork goodStudentWork;
	private static StudentOnClassWork studentOnClassWork;

	static {
		studentWork = new JdbcStudenWork();
		goodStudentWork = new JdbcGoodStudentWork();
		studentOnClassWork = new JdbcStudentOnClass();
	}

	public static void main(String[] args) {
		SqlUtils.generate("cau 1", studentWork.get(1));
		SqlUtils.generate("cau 2", goodStudentWork.getAll());
		SqlUtils.generate("cau 3", studentOnClassWork.getAll());
		SqlUtils.generate("cau 4", goodStudentWork.getAllOut82());
		SqlUtils.generate("cau 5", goodStudentWork.GetTheBestStudent());
	}
}
