package com.bjit.Security.repository;

import com.bjit.Security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{
    public UserEntity findByEmail(String email);
    
}
