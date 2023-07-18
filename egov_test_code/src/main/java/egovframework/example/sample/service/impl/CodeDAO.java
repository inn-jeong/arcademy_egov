package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.CodeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("codeDAO")
public class CodeDAO extends EgovAbstractDAO{
	public String insertCode(CodeVO vo) throws Exception {
		return (String) insert("codeDAO.insertCode", vo);
	}
	public List<?> selectCodeList(CodeVO vo) throws Exception {
		return list("codeDAO.selectCodeList", vo);
	}
	public int selectCodeListTotCnt() {
		return (Integer) select("codeDAO.selectCodeListTotCnt");
	}
	public void deleteCode(CodeVO vo) throws Exception {
		delete("codeDAO.deleteCode", vo);
	}
}
