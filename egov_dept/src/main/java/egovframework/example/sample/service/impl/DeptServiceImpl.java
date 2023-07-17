package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("deptService")
public class DeptServiceImpl extends EgovAbstractServiceImpl implements DeptService{

	//deptDAO 이름으로 dao 사용
	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	@Override
	public String insertDept(DeptVO vo) throws Exception {
		return deptDAO.insertDept(vo);
	}
	
	@Override
	public List<?> selectDeptList(DeptVO vo) throws Exception {
		return deptDAO.selectDeptList(vo);
	}

	@Override
	public DeptVO selectDeptDetail(int deptno) throws Exception {
		return deptDAO.selectDeptDetail(deptno);
	}

	@Override
	public void deleteDept(int deptno) throws Exception {
		deptDAO.deleteDept(deptno);
	}

	@Override
	public void updateDept(DeptVO vo) throws Exception {
		deptDAO.updateDept(vo);
	}

}
