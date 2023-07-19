package main.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import main.service.BoardService;
import main.service.BoardVO;

@Controller
@Slf4j
public class BoardController {
	
	@Resource(name = "boardService")
	private BoardService boardService;
	
	@RequestMapping("/boardWrite.do")
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	@RequestMapping("/boardWriteSave.do")
	@ResponseBody
	public String boardWriteSave(BoardVO vo) throws Exception {
		log.info("@# WriteSave title ===>"+vo.getTitle());
		log.info("@# WriteSave pass ===>"+vo.getPass());
		log.info("@# WriteSave content ===>"+vo.getContent());
		String result = boardService.insertNBoard(vo); 
		log.info("@result ===>"+result);
		String msg = "";
		if(result == null) {
			msg = "ok";
		}else {
			msg = "fail";
		}
		log.info("@# msg ===>"+msg);
		return msg;
	}
	
	@RequestMapping(value = "/boardList.do")
	public String selectNBoardList(Model model) throws Exception {

		List<?> boardList = boardService.selectNBoardList();
		model.addAttribute("resultList", boardList);

		return "board/boardList";
	}
	
	@GetMapping("/boardDetail")
	public String boardDetail(BoardVO vo, Model model) throws Exception {
		boardService.updateHits(vo);
		BoardVO boardVO = boardService.selectNBoard(vo);
		model.addAttribute("boardVO",boardVO);
		return "board/boardDetail";
	}
	
	@RequestMapping("/checkPass.do")
	@ResponseBody
	public String checkPass(BoardVO vo) throws Exception {
		BoardVO board = boardService.selectNBoard(vo);
		String msg = "";
		if(board.getPass().equals(vo.getPass())) {
			msg = "same";
		}else {
			msg = "fail";
		}
		return msg;
	}
	
	@RequestMapping("/boardModify.do")
	public String boardModifyView(BoardVO vo, Model model) throws Exception {
		BoardVO board = boardService.selectNBoard(vo);
		model.addAttribute("boardVO", board);
		return "board/boardModify";
	}
	
	@RequestMapping("/boardModifySave.do")
	@ResponseBody
	public String boardModifySave(BoardVO vo, Model model) throws Exception {
		log.info("@# modify board ===>"+vo.getName());
		boardService.updateNBoard(vo);
		return "ok";
	}
}
