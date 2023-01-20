package lt.techin.Blogging.api;

import lt.techin.Blogging.model.BlogPost;

public class BlogPostMapper {
    public static BlogPostDto toBlogPostDto(BlogPost blogPost) {
        var blogPostDto = new BlogPostDto();

        blogPostDto.setName(blogPost.getName());
        blogPostDto.setSummary(blogPost.getSummary());
        blogPostDto.setContents(blogPost.getContents());
        blogPostDto.setCreatedBy(blogPost.getCreatedBy());
        blogPostDto.setCreatedDate(blogPost.getCreatedDate());


        return blogPostDto;
    }

    public static BlogPostEntityDto toBlogPostEntityDto(BlogPost blogPost) {
        var blogPostEntityDto = new BlogPostEntityDto();

        blogPostEntityDto.setId(blogPost.getId());
        blogPostEntityDto.setName(blogPost.getName());
        blogPostEntityDto.setSummary(blogPost.getSummary());
        blogPostEntityDto.setContents(blogPost.getContents());
        blogPostEntityDto.setCreatedBy(blogPost.getCreatedBy());
        blogPostEntityDto.setCreatedDate(blogPost.getCreatedDate());

        return blogPostEntityDto;
    }

    public static BlogPost toBlogPost(BlogPostDto blogPostDto) {
        var blogPost = new BlogPost();

        blogPost.setName(blogPostDto.getName());
        blogPost.setSummary(blogPostDto.getSummary());
        blogPost.setContents(blogPostDto.getContents());



        return blogPost;
    }

    public static BlogPost toBlogPostFromEntityDto(BlogPostEntityDto blogPostEntityDto) {
        var blogPost = new BlogPost();

        blogPost.setId(blogPostEntityDto.getId());
        blogPost.setName(blogPostEntityDto.getName());
        blogPost.setSummary(blogPostEntityDto.getSummary());
        blogPost.setContents(blogPostEntityDto.getContents());

        return blogPost;
    }

}
