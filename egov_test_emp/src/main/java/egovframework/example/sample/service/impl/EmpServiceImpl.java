package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.EmpService;
import egovframework.example.sample.service.EmpVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("empService")
public class EmpServiceImpl extends EgovAbstractServiceImpl implements EmpService{

	//deptDAO 이름으로 dao 사용
	@Resource(name = "empDAO")
	private EmpDAO empDAO;
	
	@Override
	public String insertEmp(EmpVO vo) throws Exception {
		return empDAO.insertEmp(vo);
	}
	
	@Override
	public List<?> selectEmpList(EmpVO vo) throws Exception {
		return empDAO.selectEmpList(vo);
	}

	@Override
	public EmpVO selectEmpDetail(int empno) throws Exception {
		return empDAO.selectEmpDetail(empno);
	}

	@Override
	public void deleteEmp(int empno) throws Exception {
		empDAO.deleteEmp(empno);
	}

	@Override
	public void updateEmp(EmpVO vo) throws Exception {
		empDAO.updateEmp(vo);		
	}

}
