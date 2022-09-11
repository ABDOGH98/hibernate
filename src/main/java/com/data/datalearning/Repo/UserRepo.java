package com.data.datalearning.Repo;

import com.data.datalearning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
