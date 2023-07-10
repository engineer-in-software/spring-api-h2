package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long>  {

	void save(int memberid);

}
