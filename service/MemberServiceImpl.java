package service;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private MemberBean[] membersName;
	private int count;

	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}

	@Override
	public void join(String name, String id, String pass, String ssn) {
		MemberBean member = new MemberBean();
		member.setName(name);
		member.setId(id);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member;
		count++;
	}

	@Override
	public MemberBean[] findAll() {
		return members;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int a=0;
		for(int i=0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				a++;
			}
		}
		membersName = new MemberBean[a];
		for(int i=0, b=0;i<count;i++) {
			if(members[i].getName().equals(name)) {
				membersName[b] = members[i];
				b++;
			}
		}
		
		return membersName;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
			if(members[i].getName().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public int countMember() {
		return count;
	}

	@Override
	public boolean existIfIdPass(String id, String pass) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		for(int i=0;i<count;i++) {
			if(existIfIdPass(id, pass)) {
				members[i].setPass(newPass);
				break;
			}
		}
	}

	@Override
	public void deleteMember(String id, String pass, String ssn) {
		for(int i=0;i<count;i++) {
			if(existIfIdPass(id, pass) && members[i].getSsn().equals(ssn)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				break;
			}
		}
	}


}
