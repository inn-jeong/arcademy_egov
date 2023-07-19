package main.service;

import java.util.List;

public interface BoardService {
	String insertNBoard(BoardVO vo) throws Exception;
	List<?> selectNBoardList() throws Exception;
	BoardVO selectNBoard(BoardVO vo) throws Exception;
	void updateHits(BoardVO vo) throws Exception;
	void updateNBoard(BoardVO vo) throws Exception;
}
