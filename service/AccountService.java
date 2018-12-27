
package service;

import java.util.ArrayList;

import domain.AccountBean;

/**
 * @author Park EunJi
 * @date 2018. 12. 26.
 * @desc 은행 계좌 서비스
 */
public interface AccountService {
	
	/**
	 * CREATE
	 */
	public void creatAccount(int money);
	public String creatAccountNum();	//계좌 번호 생성

	/**
	 * READ
	 */
	public ArrayList<AccountBean> findAll();

	public AccountBean findByAccountNum(String accountNum);

	public int countAccount();

	public boolean existAccount(String accountNum);
	
	public String findToday();	//날짜 생성

	/**
	 * UPDATE
	 */
	public void depositMoney(String accountNum, int money);

	public void withdrawMoney(String accountNum, int money);

	/**
	 * DELETE
	 */
	public void deleteAccountNum(String accountNum);
	
}
