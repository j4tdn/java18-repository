package service;

import java.util.List;

import dao.ClassDao;
import dao.JdbcClassDao;
import dto.ClassDto;

public class ClassServiceImpl implements ClassService {
	private ClassDao classDao;
	
	public ClassServiceImpl() {
		classDao = new JdbcClassDao();
	}
	
	@Override
	public List<ClassDto> getClassInfoWithGoodScores() {
		return classDao.getClassInfoWithGoodScores();
	}

}
