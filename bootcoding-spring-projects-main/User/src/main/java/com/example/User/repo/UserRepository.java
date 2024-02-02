package com.example.User.repo;

import com.example.User.model.ModelUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ModelUser,Integer> {

}
