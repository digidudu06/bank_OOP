package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

/**
 * @author Park EunJi
 * @date 2018. 12. 26.
 * @desc 은행 계좌 구현객체
 */
public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;

	/*
	 * private ArrayList<String> list2; private ArrayList<int> list3; //ArrayList는
	 * 객체 배열이므로 int들어갈 수 없다.
	 */
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void creatAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(creatAccountNum());
		account.setMoney(money);
		account.setToday(findToday());
		list.add(account);
	}

	@Override
	public String creatAccountNum() {
		String accountNum = "";
		Random random = new Random();
		accountNum = random.nextInt(9000) + 1000 + "-";
		for (int i = 0; i < 4; i++) {
			accountNum += random.nextInt(10) + "";
		}
		return accountNum;
	}

	@Override
	public ArrayList<AccountBean> findAll() {
		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}

	@Override
	public int countAccount() {
		return list.size();
	}

	@Override
	public boolean existAccount(String accountNum) {
		boolean ok = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public String findToday() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		return sdf.format(date);
	}

	@Override
	public void depositMoney(String accountNum, int money) {
		int depositMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum) && money > 0) {
				depositMoney = list.get(i).getMoney() + money;
				list.get(i).setMoney(depositMoney);
				break;
			} 
		}
	}

	@Override
	public void withdrawMoney(String accountNum, int money) {
		int withdrawMoney = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum) && money > 0 && list.get(i).getMoney() > money) {
				withdrawMoney = list.get(i).getMoney() - money;
				list.get(i).setMoney(withdrawMoney);
				break;
			}
		}
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				list.remove(i);
			}
		}

	}

}
