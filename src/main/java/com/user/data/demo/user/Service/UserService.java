package com.user.data.demo.user.Service;

import java.util.List;
import com.user.data.demo.user.Entity.User;

public interface UserService {
	
	
	public User createUser(User user);
	
	public List <User> getAllUser();
	
//	public User getUserById();

	public User updateUser(Long id,User updatedUser);
	
	public void deleteUser(Long userId);
}
