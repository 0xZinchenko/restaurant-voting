package com.zim4ik.restaurantvoting.repository;

import com.zim4ik.restaurantvoting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}