package com.personalproject2.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.personalproject2.per.dto.Board;
import com.personalproject2.per.dto.Test;
import com.personalproject2.service.BoardService;
import com.personalproject2.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private TestService testService;
	
	@Autowired
	private BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
			
		List<Test> test = testService.getTestList();
		List<Board> board = boardService.getBoardList();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		logger.info("Welcome home! The client locale is {}.", test.toString());
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("test",test);
		model.addAttribute("board",board);
		return "home";
	}
	
}
