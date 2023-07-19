package main.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import lombok.extern.slf4j.Slf4j;
import main.service.BoardService;
import main.service.BoardVO;

@Service("boardService")
@Slf4j
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService{

	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;
	
	@Override
	public String insertNBoard(BoardVO vo) throws Exception {
		log.info("@# BoardServiceImpl insertNBoard()");
		return boardDAO.insertNBoard(vo);
	}

	@Override
	public List<?> selectNBoardList() throws Exception {
		return boardDAO.selectNBoardList();
	}

	@Override
	public BoardVO selectNBoard(BoardVO vo) throws Exception {
		BoardVO resultVO = boardDAO.selectNBoard(vo);
		if (resultVO == null)
			throw processException("info.nodata.msg");
		return resultVO;
	}

	@Override
	public void updateNBoard(BoardVO vo) throws Exception {
		boardDAO.updateNBoard(vo);
	}

	@Override
	public void updateHits(BoardVO vo) throws Exception {
		boardDAO.updateHits(vo);
	}
}
