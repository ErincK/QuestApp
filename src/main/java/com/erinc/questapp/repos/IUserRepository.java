package com.erinc.questapp.repos;

import com.erinc.questapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

}
