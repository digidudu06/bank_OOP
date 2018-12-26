package service;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;

	MemberServiceImpl() {
		members = new MemberBean[10];
	}

	@Override
	public void join(String name, String id, String pass, String ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existIfIdPass(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(String id, String pass, String ssn) {
		// TODO Auto-generated method stub
		
	}


}
