package xezi.spring.service;

import xezi.spring.domain.model.User;

public interface UserService {

	User findById(Long id);
	User create(User userToCreate);
	
	
	
}
