package com.website.cool.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleDAO articleDAO;
}
