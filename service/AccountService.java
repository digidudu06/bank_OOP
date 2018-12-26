package service;

import domain.AccountBean;

/**
 * @author Park EunJi
 * @date 2018. 12. 26.
 * @desc 은행계좌 서비스
 */
public interface AccountService {
	
	/**
	 * CREATE
	 */
	public void creatAccountNum(int money);

	/**
	 * READ
	 */
	public AccountBean[] findAll();

	public AccountBean findByAccountNum(String accountNum);

	public int countAccount();

	public boolean existAccount(String accountNum);
	
	public void findToday();

	/**
	 * UPDATE
	 */
	public void withdrawMoney(int money);

	public void depositMoney(int money);

	/**
	 * DELETE
	 */
	public void deleteAccountNum(String accountNum);
}
