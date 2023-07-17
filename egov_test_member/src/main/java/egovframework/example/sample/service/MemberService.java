package egovframework.example.sample.service;

public interface MemberService {
	String insertMember(MemberVO vo) throws Exception;
	MemberVO selectMember(MemberVO vo) throws Exception;
}
