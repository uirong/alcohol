package com.al.biz.user;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")  // session 영역에 저장
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;

	//////////////////////////////////////////////////////////////////////////////////////////

	// 회원가입 폼페이지
	@RequestMapping(value="/joinMemForm.do")
	public String insertUserForm(UserVO vo/* , BoardDAO boardDAO */) throws IllegalStateException, IOException { 
		//boardDAO.insertBoard(vo);
		
		
		
		
		
		
		
		return "redirect:/member/joinMember.jsp";
	}
	
	// 회원가입
	@RequestMapping(value="/joinMem.do")
	public String insertUser(UserVO vo/* , BoardDAO boardDAO */) throws IllegalStateException, IOException { 
		//boardDAO.insertBoard(vo);
		
		   userService.insertUser(vo); 
		   return "redirect:/member/Login.jsp";
	}
	
	
	//로그인!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(@ModelAttribute("board") BoardVO vo/* , BoardDAO boardDAO */) {
//		
//		
//		System.out.println(vo.getSeq());
//		System.out.println(vo.getTitle());
//		System.out.println(vo.getWriter());
//		System.out.println(vo.getContent());
//		System.out.println(vo.getRegDate());
//		System.out.println(vo.getCnt());
//
//	
//		//boardDAO.updateBoard(vo);
//		boardService.updateBoard(vo);
//		return "redirect:getBoardList.do";
//	}
	
	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo/* , BoardDAO boardDAO */) {
//		//boardDAO.deleteBoard(vo);
//		boardService.deleteBoard(vo);
//		return "redirect:getBoardList.do";
//	}
	
	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public String getBoard(BoardVO vo/* , BoardDAO boardDAO */, Model model/*ModelAndView mav*/) {
//		
//		model.addAttribute("board", boardService.getBoard(vo));     // request영역에 저장
//		return "getBoard.jsp";
//		
//		mav.addObject("board", boardDAO.getBoard(vo)); // Model 정보 저장
//		mav.setViewName("getBoard.jsp"); // View 정보 저장
//		return mav;	
//	}
}












