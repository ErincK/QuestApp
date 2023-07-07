package com.erinc.questapp.repos;

import com.erinc.questapp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepository extends JpaRepository<Comment, Long> {
}
