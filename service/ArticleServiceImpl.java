package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService {
	private HashMap<String, ArticleBean> map;
	private int seq;
	public ArticleServiceImpl() {
		map = new HashMap<>();
		seq = 1;
	}

	@Override
	public void creatBulletinBoard(String title, String content, String writer, String bulletinPass) {
		ArticleBean article = new ArticleBean();
		article.setTitleSeq(seq);
		article.setWriter(writer);
		article.setTitle(title);
		article.setContent(content);
		article.setBulletinPass(bulletinPass);
		article.setRegDate(findRegDate());
		map.put(String.valueOf(article.getTitleSeq()),article);
		seq++;
	}

	@Override
	public ArrayList<ArticleBean> findAll() {
		ArrayList<ArticleBean> list = new ArrayList<>();
		Set<String> set = map.keySet();
		for(String key : set) {
			list.add(map.get(key));
		}
		return list;
	}

	@Override
	public ArrayList<ArticleBean> findTitles(String writer) {
		ArrayList<ArticleBean> list = new ArrayList<>();
		Set<String> set = map.keySet();
		for(String key : set) {
			if(map.get(key).getWriter().equals(writer)) {
				list.add(map.get(key));
			}
		}
		return list;
	}

	@Override
	public ArticleBean findOne(int seq) {
		return null;
	}

	@Override
	public int countTitle() {
		return 0;
	}

	@Override
	public boolean existTitle(String title) {
		return false;
	}

	@Override
	public String findRegDate() {
		return null;
	}

	@Override
	public void updateBulletin(String title, String content, String wirter, String bulletinPass, String newContent) {
		
	}

	@Override
	public void deleteBulletin(String title, String bulletinPass) {
		
	}


}
