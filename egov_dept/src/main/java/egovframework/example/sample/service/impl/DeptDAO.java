package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

//@Repository("deptDAO") : 스프링 컨테이너가 관리하는 빈(스프링이 관리하는 객체)
@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO{
	
	public String insertDept(DeptVO vo) throws Exception {
		return (String) insert("deptDAO.insertDept", vo);
	}
	
	public List<?> selectDeptList(DeptVO deptVO) throws Exception {
		return list("deptDAO.selectDept", deptVO);
	}
	
	public DeptVO selectDeptDetail(int deptno) throws Exception {
		return (DeptVO) select("deptDAO.selectDeptDetail", deptno);
	}
	
	public void deleteDept(int deptno) throws Exception {
		delete("deptDAO.deleteDept", deptno);
	}
}
