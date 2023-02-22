package com.website.cool.article;

import java.util.List;

public interface ArticleDAO {
	
	
	public void addArticle();
	
	public List<ArticleVO> getAllArticle();
	
	public ArticleVO getArticleId(Integer id);
	
	public void updateArticle(ArticleVO articleVO);
	
	public void deleteArticle(Integer id);
}
