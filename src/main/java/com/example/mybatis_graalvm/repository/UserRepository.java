package com.example.mybatis_graalvm.repository;

import com.example.mybatis_graalvm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here
    // For example:
    // User findByName(String name);
}
