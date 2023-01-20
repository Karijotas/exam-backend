package lt.techin.Blogging.service;

import lt.techin.Blogging.dao.BlogPostRepository;
import lt.techin.Blogging.dao.CommentRepository;
import lt.techin.Blogging.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;
import java.util.Optional;


public class BlogPostService {

    private final BlogPostRepository blogPostRepository;
    private final CommentRepository commentRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository, CommentRepository commentRepository) {
        this.blogPostRepository = blogPostRepository;
        this.commentRepository = commentRepository;
    }

    public List<BlogPost> getAll() {
        return blogPostRepository.findAll();
    }

    public Optional<BlogPost> getById(Long id) {
        return blogPostRepository.findById(id);
    }


    public BlogPost create(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost update(Long id, BlogPost blogPost) {
        var existingBlogPost = blogPostRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());

        existingBlogPost.setName(blogPost.getName());


        return blogPostRepository.save(existingBlogPost);
    }

    public BlogPost replace(Long id, BlogPost blogPost) {
        blogPost.setId(id);

        return blogPostRepository.save(blogPost);
    }

    public boolean deleteById(Long id) {
        try {
            blogPostRepository.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException exception) {
            return false;
        }
    }
}
