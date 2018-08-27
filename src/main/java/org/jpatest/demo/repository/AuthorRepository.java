package org.jpatest.demo.repository;

import org.jpatest.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String>{
}
