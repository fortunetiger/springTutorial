package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	
private static final Throwable RedirectAttributes = null;
//	@Autowired
	private BoardService service;
	
	// 게시물 목록 얻기
	@GetMapping("/list")
	public void list(Model model) { //모델 객체가 자동으로 주입됨
		
		log.info("게시물 목록 얻기...");
		model.addAttribute("list", service.getList());
		
		return;
		
	}
	
	// 게시글 등록
	
	@GetMapping("/register")
	public void register() {
		// view : register.jsp
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		
		log.info("게시물 등록..."+board);
		service.register(board);
		
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("modify:" + board);
		
		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";

	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("remove..." + bno);

		if (service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
}
