package com.site.aggregator.controller;

import com.site.aggregator.service.BookService;
import com.site.aggregator.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    private BookService bookService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex(Model model){
		List<BookVO> books = bookService.getAllVOBook();
		model.addAttribute("books",books);
		return "index";
	}
}
