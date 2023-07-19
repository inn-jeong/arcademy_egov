package egovframework.example.sample.service;

import java.util.List;

public interface CodeService {
	String insertCode(CodeVO vo) throws Exception;
	List<?> selectCodeList(CodeVO vo) throws Exception;
	int selectCodeListTotCnt();
	void deleteCode(CodeVO vo) throws Exception;
	void updateCode(CodeVO vo) throws Exception;
	CodeVO selectCode(CodeVO vo) throws Exception;
}
