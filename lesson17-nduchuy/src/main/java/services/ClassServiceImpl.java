package services;

import dao.ClassDao;
import dao.JdbcClassDao;

public class ClassServiceImpl implements ClassService {
	
	private ClassDao classDao;
	
	public ClassServiceImpl() {
		classDao = new JdbcClassDao();
	}

	@Override
	public void getClassInfoWithScoresOver8() {
		classDao.getClassInfoWithScoresOver8().forEach(e->{
			System.out.println("--> "+e);
		});
	}

}
