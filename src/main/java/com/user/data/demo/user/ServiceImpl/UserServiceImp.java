package com.user.data.demo.user.ServiceImpl;

import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

//import com.contact.mangt.system.exception.ResourceNotFoundException;
import com.user.data.demo.user.Entity.User;
import com.user.data.demo.user.Repository.UserRepository;
import com.user.data.demo.user.Service.UserService;

@Service
public class UserServiceImp implements UserService {

	
	private UserRepository userRepo;
	
	public UserServiceImp(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public User createUser(User user) {
		return this.userRepo.save(user);
		
	}

	@Override
	public List<User> getAllUser() {
		List<User> users = userRepo.findAll();
		return users;
		
	}

	@Override
	public void deleteUser(Long userId) {
		User u = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User deleted", "userId",userId));
		
		this.userRepo.delete(u);
	}

	@Override
	public User updateUser(Long id, User updatedUser) {
		User users = userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Id Updated !!", "User Updated!!", id));
		users.setUsername(updatedUser.getUsername());
		users.setEmail(updatedUser.getEmail());
		users.setPassword(updatedUser.getPassword());
		return users;
	}	

}
