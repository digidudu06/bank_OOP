package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	public void creatBulletinBoard(String title, String content, String writer, String bulletinPass);

	public ArrayList<ArticleBean> findAll();

	public ArrayList<ArticleBean> findTitles(String writer);

	public ArticleBean findOne(int seq);

	public int countTitle();

	public boolean existTitle(String title);
	
	public String findRegDate();

	public void updateBulletin(String title, String content, String wirter, String bulletinPass, String newContent);

	public void deleteBulletin(String title, String bulletinPass);

}
