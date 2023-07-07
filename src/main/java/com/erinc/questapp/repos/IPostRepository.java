package com.erinc.questapp.repos;

import com.erinc.questapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
}
