package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.EmpVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

//@Repository("deptDAO") : 스프링 컨테이너가 관리하는 빈(스프링이 관리하는 객체)
@Repository("empDAO")
public class EmpDAO extends EgovAbstractDAO{
	
	public String insertEmp(EmpVO vo) throws Exception {
		return (String) insert("empDAO.insertEmp", vo);
	}
	public List<?> selectEmpList(EmpVO deptVO) throws Exception {
		return list("empDAO.selectEmp", deptVO);
	}
}
