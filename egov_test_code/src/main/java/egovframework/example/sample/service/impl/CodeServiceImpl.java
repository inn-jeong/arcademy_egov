package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.CodeService;
import egovframework.example.sample.service.CodeVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("codeService")
public class CodeServiceImpl extends EgovAbstractServiceImpl implements CodeService {

	@Resource(name = "codeDAO")
	private CodeDAO codeDAO;
	
	@Override
	public String insertCode(CodeVO vo) throws Exception {
		return codeDAO.insertCode(vo);
	}

	@Override
	public List<?> selectCodeList(CodeVO vo) throws Exception {
		return codeDAO.selectCodeList(vo);
	}

	@Override
	public int selectCodeListTotCnt() {
		return codeDAO.selectCodeListTotCnt();
	}

	@Override
	public void deleteCode(CodeVO vo) throws Exception {
		codeDAO.deleteCode(vo);
	}

	@Override
	public void updateCode(CodeVO vo) throws Exception {
		codeDAO.updateCode(vo);
	}

	@Override
	public CodeVO selectCode(CodeVO vo) throws Exception {
		CodeVO resultVO = codeDAO.selectCode(vo);
		if (resultVO == null)
			throw processException("info.nodata.msg");
		return resultVO;
	}
	

}
