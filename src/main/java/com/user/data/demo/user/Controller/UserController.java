package com.user.data.demo.user.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.data.demo.user.Entity.User;
import com.user.data.demo.user.Payload.ApiResponse;
import com.user.data.demo.user.Service.UserService;

@RestController
@RequestMapping("/Api")
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@PostMapping("/UserData")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user){
		User cUser = this.userService.createUser(user);
		return new ResponseEntity<User>(cUser,HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getUser(){
		return ResponseEntity.ok(this.userService.getAllUser());
	}
	
	
	@PutMapping("/user/{id}")
	public ResponseEntity<ApiResponse> updateUser(@RequestBody User updatedUser, @PathVariable long  id){
		this.userService.updateUser(id,updatedUser);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Update successfully !!", true),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ApiResponse> deleteRecord(@PathVariable("id") long id){
		userService.deleteUser(id);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted successfully !!",true),HttpStatus.OK);
	}
		
	}


