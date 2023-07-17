package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DeptController {
	
	@Resource(name = "deptService")
	private DeptService deptService;
	
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	
	@RequestMapping(value = "/deptWriteSave.do")
//	public String deptWriteSave(String deptno,String dname) {
	public String deptWriteSave(DeptVO vo) throws Exception {
//		log.info("부서번호: "+deptno);
//		log.info("부서이름: "+dname);
		log.info("부서번호: "+vo.getDeptno());
		log.info("부서이름: "+vo.getDname());
		log.info("부서위치: "+vo.getLoc());
		
		String result = deptService.insertDept(vo); 
		log.info("@result ===>"+result);
		
		return "forward:/deptList.do";
	}
	
	@RequestMapping(value = "/deptList.do")
	public String selectDeptList(DeptVO vo, ModelMap model) throws Exception {

		List<?> list = deptService.selectDeptList(vo);
		log.info("@# list ====> "+list);
		model.addAttribute("resultList", list);

		return "dept/deptList";
	}
	
	@RequestMapping(value = "/deptDetail.do")
	public String selectDeptDetail(int deptno, ModelMap model) throws Exception {

		DeptVO vo = deptService.selectDeptDetail(deptno);
		log.info("@# vo ===>"+vo);
		model.addAttribute("deptVO", vo);

		return "dept/deptDetail";
	}
	
	@RequestMapping("/deptDelete.do")
	public String deleteDept(int deptno) throws Exception {
		deptService.deleteDept(deptno);
		return "forward:/deptList.do";
	}
	
	@RequestMapping("/deptModify.do")
	public String updateDept(int deptno, Model model) throws Exception {
		DeptVO vo = deptService.selectDeptDetail(deptno);
		log.info("@# vo ===>"+vo);
		
		model.addAttribute("deptVO",vo);
		return "dept/deptModify";
	}
	
	@RequestMapping("/deptModifySave.do")
	public String updateDept(DeptVO vo) throws Exception {

		deptService.updateDept(vo);
		
		return "forward:/deptList.do";
	}
	
}
