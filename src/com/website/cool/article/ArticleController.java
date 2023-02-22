package com.website.cool.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	
}
