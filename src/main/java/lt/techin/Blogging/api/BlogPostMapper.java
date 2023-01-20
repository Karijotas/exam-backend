package lt.techin.Blogging.api;

import lt.techin.Blogging.model.BlogPost;

public class BlogPostMapper {
    public static BlogPostDto toBlogPostDto(BlogPost blogPost) {
        var blogPostDto = new BlogPostDto();

        blogPostDto.setName(blogPost.getName());
        blogPostDto.setContents(blogPost.getContents());


        return blogPostDto;
    }

    public static BlogPostEntityDto toBlogPostEntityDto(BlogPost blogPost) {
        var blogPostEntityDto = new BlogPostEntityDto();

        blogPostEntityDto.setId(blogPost.getId());
        blogPostEntityDto.setName(blogPost.getName());
        blogPostEntityDto.setContents(blogPost.getContents());

        return blogPostEntityDto;
    }

    public static BlogPost toBlogPost(BlogPostDto blogPostDto) {
        var blogPost = new BlogPost();

        blogPost.setName(blogPostDto.getName());
        blogPost.setContents(blogPostDto.getContents());

        return blogPost;
    }

    public static BlogPost toBlogPostFromEntityDto(BlogPostEntityDto blogPostEntityDto) {
        var blogPost = new BlogPost();

        blogPost.setId(blogPostEntityDto.getId());
        blogPost.setName(blogPostEntityDto.getName());
        blogPost.setContents(blogPostEntityDto.getContents());

        return blogPost;
    }

}
