package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    //query method to find list of blog post with respect to category id
    List<Post> findByCategoryId(Long categoryId);
}
