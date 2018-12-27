package controller;


import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * @author Park EunJi
 * @date 2018. 12. 27.
 * @desc 은행 컨트롤러
 */
public class BankController {
	public void start() {
		MemberBean member = null;
		AccountBean account = null;
		MemberService memberService = new MemberServiceImpl();
		AccountService accountService = new AccountServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n " + "0.종료\n" + "1.회원가입\n" + "2.전체조회\n" + "3.이름으로 조회\n"
					+ "4.아이디로 조회\n" + "5.가입자 수\n" + "6.로그인\n" + "7.비밀번호 변경\n" + "8.회원 탈퇴\n"
							+ "9.계좌 생성\n"
							+ "10.계좌 확인\n"
							+ "11.계좌로 찾기\n"
							+ "12.계좌 수\n"
							+ "13.계좌 유무\n"
							+ "14.입금\n"
							+ "15.출금\n"
							+ "16.계좌 삭제")) {
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
		/*		+ "9.계좌 생성\n"
				+ "10.계좌 확인\n"
				+ "11.계좌로 찾기\n"
				+ "12.계좌 수\n"
				+ "13.계좌 유무\n"
				+ "14.입금\n"
				+ "15.출금\n"
				+ "16.계좌 삭제")*/
			case "9": 
				accountService.creatAccount(0);
				break;
			case "10":
				JOptionPane.showMessageDialog(null, accountService.findAll());
				break;
			case "11": 
				String accountNum = JOptionPane.showInputDialog("계좌 번호 입력");
				JOptionPane.showMessageDialog(null, accountService.findByAccountNum(accountNum));
				break;
			case "12": 
				JOptionPane.showMessageDialog(null, accountService.countAccount());
				break;
			case "13": //
				accountNum = JOptionPane.showInputDialog("확인할 계좌 번호 입력");
				if(accountService.existAccount(accountNum)) {
					JOptionPane.showMessageDialog(null, "계좌가 존재합니다.");
				}else {
					JOptionPane.showMessageDialog(null, "계좌가 존재하지 않습니다.");
				}
				break;
			case "14": 
				accountService.depositMoney(JOptionPane.showInputDialog("입금 할 계좌 입력"), Integer.parseInt(JOptionPane.showInputDialog("입금액")));
				break;
			case "15":
				accountService.withdrawMoney(JOptionPane.showInputDialog("출금 할 계좌 입력"), Integer.parseInt(JOptionPane.showInputDialog("출금액")));
				break;
			case "16":
				accountService.deleteAccountNum(JOptionPane.showInputDialog("없앨 계좌"));
				break;

			}
		}
	}
}
