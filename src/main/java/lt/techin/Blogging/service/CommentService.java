package lt.techin.Blogging.service;

import lt.techin.Blogging.dao.BlogPostRepository;
import lt.techin.Blogging.dao.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    private final BlogPostRepository blogPostRepository;
    @Autowired
    public CommentService(CommentRepository commentRepository, BlogPostRepository blogPostRepository) {
        this.commentRepository = commentRepository;
        this.blogPostRepository = blogPostRepository;
    }
}
