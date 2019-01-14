package org.jpatest.demo.repository;

import org.jpatest.demo.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {
    Post findById(Integer id);
    Long countByAuthor(Integer author);
    Page<Post> findAll(Pageable pageable);
}
