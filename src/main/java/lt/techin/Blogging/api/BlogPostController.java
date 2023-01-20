package lt.techin.Blogging.api;

import lt.techin.Blogging.model.BlogPost;
import lt.techin.Blogging.service.BlogPostService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static lt.techin.Blogging.api.BlogPostMapper.toBlogPost;
import static lt.techin.Blogging.api.BlogPostMapper.toBlogPostDto;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/blogger")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<BlogPostEntityDto> getBlogPosts() {
        return blogPostService.getAll().stream()
                .map(BlogPostMapper::toBlogPostEntityDto)
                .collect(toList());
    }
    @GetMapping(value = "/{blogPostId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BlogPost> getBlogPost(@PathVariable Long blogPostId) {
        var blogPostOptional = blogPostService.getById(blogPostId);

        var responseEntity = blogPostOptional
                .map(blogPost -> ok(blogPost))
                .orElseGet(() -> ResponseEntity.notFound().build());

        return responseEntity;
    }

    @DeleteMapping(value = "/{blogPostId}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> deleteBlogPost(@PathVariable Long blogPostId) {
        boolean deleted = blogPostService.deleteById(blogPostId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BlogPostDto> createBlogPost(@RequestBody BlogPostDto blogPostDto) {
        var createdBlogPost = blogPostService.create(toBlogPost(blogPostDto));

        return ok(toBlogPostDto(createdBlogPost));
    }

    @PutMapping("/{blogPostId}")
    public ResponseEntity<BlogPostDto> replaceBlogPost(@PathVariable Long blogPostId, @RequestBody BlogPostDto blogPostDto) {
        var updatedBlogPost = blogPostService.replace(blogPostId, toBlogPost(blogPostDto));

        return ok(toBlogPostDto(updatedBlogPost));
    }



    @PatchMapping("/{blogPostId}")
    public ResponseEntity<BlogPostDto> updateBlogPost(@PathVariable Long blogPostId, @RequestBody BlogPostDto blogPostDto) {
        var updatedBlogPost = blogPostService.update(blogPostId, toBlogPost(blogPostDto));

        return ok(toBlogPostDto(updatedBlogPost));

    }

}
