package com.devglan.userportal;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

	//User finOne(int id);

}