package org.jpatest.demo.repository;

import org.jpatest.demo.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, String> {
}
