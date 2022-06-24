package com.chuwa.blog.repository;

import com.chuwa.blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author b1go
 * @date 6/23/22 11:05 PM
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    /**
     * TODO: 不用实现。但要学语法
     * @param postId
     * @return
     */
    List<Comment> findByPostId(long postId);
}
