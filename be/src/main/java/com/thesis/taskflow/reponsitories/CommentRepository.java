package com.thesis.taskflow.reponsitories;

import com.thesis.taskflow.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
//    @Query("SELECT c FROM comment c WHERE c.parent.id = :parentId")
//    public List<Comment> findCommentByParent(int parentId);
}
