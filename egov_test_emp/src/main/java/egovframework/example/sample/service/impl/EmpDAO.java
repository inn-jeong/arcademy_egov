package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.EmpVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

//@Repository("deptDAO") : 스프링 컨테이너가 관리하는 빈(스프링이 관리하는 객체)
@Repository("empDAO")
public class EmpDAO extends EgovAbstractDAO{
	
	public String insertEmp(EmpVO vo) throws Exception {
		return (String) insert("empDAO.insertEmp", vo);
	}
	public List<?> selectEmpList(EmpVO vo) throws Exception {
		return list("empDAO.selectEmp", vo);
	}
	public EmpVO selectEmpDetail(int empno) throws Exception {
		return (EmpVO) select("empDAO.selectEmpDetail", empno);
	}
	public void deleteEmp(int empno) throws Exception {
		delete("empDAO.deleteEmp", empno);
	}
	public void updateEmp(EmpVO vo) throws Exception {
		update("empDAO.updateEmp", vo);
	}
}
