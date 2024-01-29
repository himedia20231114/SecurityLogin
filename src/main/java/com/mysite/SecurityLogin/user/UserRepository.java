package com.mysite.SecurityLogin.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long>{
	// findAll(), findById(), save(), delete() 
	
	// 인증을 처리하는 컬럼에서 객체를 가져오는 메소드 생성 
	// select * from site_user where username = '?'
	Optional<SiteUser> findByusername(String username); 
}
