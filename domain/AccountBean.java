package domain;

/**
 * @author Park EunJi
 * @date 2018. 12. 26.
 * @desc 은행계좌 빈객체
 */
public class AccountBean {
	private final String BANK_NAME = "비트";
	private String accountNum, today;
	private int money;
	//ALT SHIFT S R, ALT SHIFT S S
	
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "AccountBean [BANK_NAME=" + BANK_NAME + ", accountNum=" + accountNum + ", today=" + today + ", money="
				+ money + "]";
	}


}
