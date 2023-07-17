package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.ItemService;
import egovframework.example.sample.service.ItemVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	@Resource(name = "itemService")
	private ItemService itemService;
	
	@RequestMapping("/itemWrite.do")
	public String insertItem() {
		log.info("@# insertItem");
		return "item/itemWrite";
	}
	
	@RequestMapping("/insert.do")
	public String item(ItemVO vo) throws Exception {
		itemService.insertItem(vo);
		
		return "item/itemWrite";
	}
	
	@RequestMapping("/content_view.do")
	public String list(ItemVO vo, Model model) throws Exception{
		log.debug("@# content");

		model.addAttribute("list",itemService.selectItemList(vo));
		
		return "item/content_view";
	}
	
	@RequestMapping("/writeResult.do")
	public String result() throws Exception{
		log.info("@# result");

		return "item/writeResult";
	}
}
