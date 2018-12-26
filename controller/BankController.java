package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start() {
		MemberBean member = null;
		AccountBean account = null;
//		MemberService memberService = new MemberServiceImpl();
//		AccountService accountService  = new AccountServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n 0.종료")) {
			case "0": JOptionPane.showMessageDialog(null, "종료"); return;
			}
		}
	}
}
