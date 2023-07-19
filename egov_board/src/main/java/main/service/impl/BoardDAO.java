package main.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import lombok.extern.slf4j.Slf4j;
import main.service.BoardVO;

@Repository("boardDAO")
@Slf4j
public class BoardDAO extends EgovAbstractDAO{
	
	public String insertNBoard(BoardVO vo) throws Exception {
		log.info("@# BoardDAO insertNBoard()");
		return (String) insert("boardDAO.insertNBoard", vo);
	}
	public List<?> selectNBoardList() throws Exception {
		return list("boardDAO.selectNBoardList");
	}
	public BoardVO selectNBoard(BoardVO vo) throws Exception {
		return (BoardVO) select("boardDAO.selectNBoard", vo);
	}
	public void updateHits(BoardVO vo) throws Exception {
		update("boardDAO.updateHits", vo);
	}
	public void updateNBoard(BoardVO vo) throws Exception {
		update("boardDAO.updateNBoard", vo);
	}
}
