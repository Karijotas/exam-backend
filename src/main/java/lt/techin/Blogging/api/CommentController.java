package lt.techin.Blogging.api;

import lt.techin.Blogging.dao.BlogPostRepository;
import lt.techin.Blogging.dao.CommentRepository;
import lt.techin.Blogging.model.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")

public class CommentController {


    private final BlogPostRepository blogPostRepository;
    private final CommentRepository commentRepository;

    public CommentController(BlogPostRepository blogPostRepository, CommentRepository commentRepository) {
        this.blogPostRepository = blogPostRepository;
        this.commentRepository = commentRepository;
    }

    @PostMapping("/comment/{blogPostid}")
    public Comment createComment(@PathVariable Long blogPostId, @RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    @GetMapping("/comment/{blogPostid}")
    public List<Comment> getComments(@PathVariable Long blogPostId) {
        return commentRepository.findAll();
    }


}


