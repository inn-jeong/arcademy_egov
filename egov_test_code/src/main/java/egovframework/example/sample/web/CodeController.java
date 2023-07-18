package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.example.sample.service.CodeService;
import egovframework.example.sample.service.CodeVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CodeController {
	@Resource(name = "codeService")
	private CodeService codeService;
	
	@RequestMapping(value = "/codeWriteSave.do", method = RequestMethod.GET)
	public String addSample(CodeVO vo, Model model) throws Exception {

		String result = codeService.insertCode(vo);
		log.info("@# result ===>"+result);
//		return "forward:/codeWrite.do";
		return "forward:/codeList.do";
	}
	
	@RequestMapping("/codeWrite.do")
	public String codeWrite() {
		return "code/codeWrite";
	}
	
	@RequestMapping(value = "/codeList.do")
	public String selectSampleList(CodeVO vo,Model model) throws Exception {

		List<?> codeList = codeService.selectCodeList(vo);
		log.info("@# list ===>"+codeList);
		model.addAttribute("resultList", codeList);
		model.addAttribute("total", codeService.selectCodeListTotCnt());
		return "code/codeList";
	}
	
	@RequestMapping("/deleteCode.do")
	public String deleteSample(CodeVO vo) throws Exception {
		codeService.deleteCode(vo);
		return "redirect:/codeList.do";
	}
}
