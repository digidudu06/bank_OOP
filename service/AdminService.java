package service;

import java.util.ArrayList;
import java.util.HashMap;

import domain.AdminBean;

public interface AdminService {
	//CREATE
	public void creatAdmin(String name, String pass, String auth);
	//READ
	public ArrayList<AdminBean> list();
	public ArrayList<AdminBean> findByAuth(String auth);
	public AdminBean findById(String adminNum);
	public int countAdmin();
	public boolean existAdmin(String adminNum, String pass);
	//UPDATE
	public void updatePass(String adminNum, String pass, String newPass);
	public void updateAuth(String adminNum, String newAuth);
	//DELETE
	public void deleteAdmin(String adminNum);

}
