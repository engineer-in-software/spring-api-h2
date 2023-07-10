package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.model.MemberService;

@RestController
public class TestController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/member")
    public List<Member>  getAllMembers() {
        return memberService.getAllMembers();
    }
	@GetMapping("/members/{memberid}")
	
	private Member getMembers(@PathVariable("memberid") int memberid) {
		return memberService.getMembersById(memberid);
		
	}
	@DeleteMapping("/members/{memberid}")
	
	private void deleteMembers(@PathVariable("memberid") int memberid) {
		 memberService.delete(memberid);
		
	}
	
	@PostMapping("/member")  
	private int saveMember(@RequestBody Member members)   
	{  
	memberService.saveOrUpdate(members);  
	return members.getId();  
	}  
	
	 @PutMapping("/members/{memberid}") private Member update(@RequestBody Member members, @PathVariable("memberid") int memberid) {
	 memberService.update(members, memberid); 
	 return members; }
	 
	

}
