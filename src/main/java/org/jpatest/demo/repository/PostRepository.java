package org.jpatest.demo.repository;

import org.jpatest.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {
}
