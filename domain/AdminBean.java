package domain;

public class AdminBean {
	private String adminNum, name, pass, auth;	//auth권한


	public String getAdminNum() {
		return adminNum;
	}

	public void setAdminNum(String adminNum) {
		this.adminNum = adminNum;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "관리자 \n"
				+ "[관리자 번호 =" + adminNum 
				+ "\n이름 =" + name
				+ "\n비밀번호 =" + pass 
				+ "\n권한 =" + auth + "]";
	}
	

}
