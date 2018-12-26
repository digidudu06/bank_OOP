package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start() {
		MemberBean member = null;
		AccountBean account = null;
		MemberService memberService = new MemberServiceImpl();
		AccountService accountService = new AccountServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n " + "0.종료\n" + "1.회원가입\n" + "2.전체조회\n" + "3.이름으로 조회\n"
					+ "4.아이디로 조회\n" + "5.가입자 수\n" + "6.로그인\n" + "7.비밀번호 변경\n" + "8.회원 탈퇴")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				memberService.join(JOptionPane.showInputDialog("이름 입력"), JOptionPane.showInputDialog("아이디 입력"),
						JOptionPane.showInputDialog("비밀번호 입력"), JOptionPane.showInputDialog("주민번호 입력"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, memberService.findAll());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, memberService.findByName(JOptionPane.showInputDialog("이름입력")));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, memberService.findById(JOptionPane.showInputDialog("찾을 아이디 입력")));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, memberService.countMember());
				break;
			case "6":
				if(memberService.existIfIdPass(JOptionPane.showInputDialog("아이디"), JOptionPane.showInputDialog("비밀번호"))) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
				}else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
				
				break;
			case "7":
				memberService.updatePass(JOptionPane.showInputDialog("현재 아이디"), JOptionPane.showInputDialog("현재 비밀번호"), 
						JOptionPane.showInputDialog("새 비밀번호"));
				break;
			case "8":
				memberService.deleteMember(JOptionPane.showInputDialog("아이디"),	JOptionPane.showInputDialog("비밀번호"),
						JOptionPane.showInputDialog("주민"));
				break;

			}
		}
	}
}
