package br.com.fiap.healthmater.repository;

import br.com.fiap.healthmater.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}