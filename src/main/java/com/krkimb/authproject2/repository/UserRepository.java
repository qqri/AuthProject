package com.krkimb.authproject2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.krkimb.authproject2.entity.User;
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}