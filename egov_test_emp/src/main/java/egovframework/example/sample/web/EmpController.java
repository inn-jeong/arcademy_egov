package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.EmpService;
import egovframework.example.sample.service.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmpController {
	@Resource(name = "empService")
	private EmpService empService;

	@RequestMapping(value = "/empWrite.do")
	public String empWrite() {
		return "emp/empWrite";
	}
	
	@RequestMapping(value = "/empWriteSave.do")
//	public String deptWriteSave(String deptno,String dname) {
	public String empWriteSave(EmpVO vo) throws Exception {
		log.info("사원번호: "+vo.getEmpno());
		log.info("사원이름: "+vo.getEname());
		log.info("부서번호: "+vo.getDeptno());
		
		String result = empService.insertEmp(vo); 
		log.info("@result ===>"+result);
		
		return "forward:/empList.do";
	}
	
	@RequestMapping(value = "/empList.do")
	public String selectDeptList(EmpVO vo, ModelMap model) throws Exception {

		List<?> list = empService.selectEmpList(vo);
		log.info("@# list ====> "+list);
		
		model.addAttribute("resultList", list);

		return "emp/empList";
	}
	@RequestMapping(value = "/empDetail.do")
	public String selectempDetail(int empno, ModelMap model) throws Exception {

		EmpVO vo = empService.selectEmpDetail(empno);
		log.info("@# vo ===>"+vo);
		model.addAttribute("empVO", vo);

		return "emp/empDetail";
	}
	
	@RequestMapping("/empDelete.do")
	public String deleteEmp(int empno) throws Exception {
		empService.deleteEmp(empno);
		return "forward:/empList.do";
	}
	
	@RequestMapping("/empModify.do")
	public String updateEmp(int empno, Model model) throws Exception {
		EmpVO vo = empService.selectEmpDetail(empno);
		log.info("@# vo ===>"+vo);
		
		model.addAttribute("empVO",vo);
		return "emp/empModify";
	}
	
	@RequestMapping("/empModifySave.do")
	public String updateEmp(EmpVO vo) throws Exception {

		empService.updateEmp(vo);
		
		return "forward:/empList.do";
	}
}
