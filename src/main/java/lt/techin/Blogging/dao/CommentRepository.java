package lt.techin.Blogging.dao;

import lt.techin.Blogging.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
