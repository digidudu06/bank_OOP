package domain;

public class ArticleBean {
	private int titleSeq; //글번호
	private String title, content, writer, regDate, bulletinPass;
	
	public int getTitleSeq() {
		return titleSeq;
	}

	public void setTitleSeq(int titleSeq) {
		this.titleSeq = titleSeq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getBulletinPass() {
		return bulletinPass;
	}

	public void setBulletinPass(String bulletinPass) {
		this.bulletinPass = bulletinPass;
	}

	@Override
	public String toString() {
		return "게시판 [글번호=" + titleSeq 
				+ ", 글제목=" + title 
				+ ", 내용=" + content 
				+ ", 작성자=" + writer
				+ ", 작성일=" + regDate + "]\n";
	}
	

}
