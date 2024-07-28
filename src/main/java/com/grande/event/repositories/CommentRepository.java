package com.grande.event.repositories;

import com.grande.event.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Long, Comment> {
}
