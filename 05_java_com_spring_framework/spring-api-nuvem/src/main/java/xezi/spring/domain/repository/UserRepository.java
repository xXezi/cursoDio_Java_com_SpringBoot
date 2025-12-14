package xezi.spring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xezi.spring.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existsByAccountNumber(String accountNumber);
}