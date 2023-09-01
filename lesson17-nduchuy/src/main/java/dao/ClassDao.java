package dao;

import java.util.List;

import dto.StudentWithMathAndLiterateOver8Dto;

public interface ClassDao {
	public List<StudentWithMathAndLiterateOver8Dto> getClassInfoWithScoresOver8();
	
	

}