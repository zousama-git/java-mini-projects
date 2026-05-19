package com.example.test.reporisitory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.test.util.User;

public interface UserRepository extends JpaRepository<User,Long>{
}