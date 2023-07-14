package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	String insertDept(DeptVO vo) throws Exception;
	List<?> selectDeptList(DeptVO deptVO) throws Exception;
	DeptVO selectDeptDetail(int deptno) throws Exception;
	void deleteDept(int deptno) throws Exception;
}
