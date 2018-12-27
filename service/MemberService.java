package service;

import domain.MemberBean;

/**
 * @author Park EunJi
 * @date 2018. 12. 26.
 * @desc 회원 관리 서비스
 */
public interface MemberService {
	/**
	 * CREATE
	 */
	public void join(String name, String id, String pass, String ssn);

	/**
	 * READ
	 */
	public MemberBean[] findAll();

	public MemberBean[] findByName(String name);

	public MemberBean findById(String id);

	public int countMember();

	public boolean existIfIdPass(String id, String pass);

	/**
	 * UPDATE
	 */
	public void updatePass(String id, String pass, String newPass);

	/**
	 * DELETE
	 */
	public void deleteMember(String id, String pass, String ssn);

}
