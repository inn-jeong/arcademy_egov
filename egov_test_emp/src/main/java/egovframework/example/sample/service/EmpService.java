package egovframework.example.sample.service;

import java.util.List;

public interface EmpService {
	String insertEmp(EmpVO vo) throws Exception;
	List<?> selectEmpList(EmpVO vo) throws Exception;
}
