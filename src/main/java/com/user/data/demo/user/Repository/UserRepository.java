package com.user.data.demo.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.data.demo.user.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
