package com.erinc.questapp.repos;

import com.erinc.questapp.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepository extends JpaRepository<Like, Long> {

}
