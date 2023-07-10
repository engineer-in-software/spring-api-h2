package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;  
import java.util.List; 
@Service
public class MemberService {
	
	
	@Autowired
	MemberRepository memberRepository;
	
	public List<Member> getAllMembers(){
		List<Member> members = new ArrayList<Member>();  
		memberRepository.findAll().forEach(member1 -> members.add(member1));  
		return members;  
	}
	public Member getMembersById(int id)   
	{  
	return memberRepository.findById((long) id).get();  
	}  
	public void saveOrUpdate(Member members)   
	{  
	memberRepository.save(members);  
	}  
	public void delete(int id)   
	{  
	memberRepository.deleteById((long) id);  
	}  
	//updating a record  
	public void update(Member members, int memberid)   
	{  
	memberRepository.save(memberid);  
	}  
}
