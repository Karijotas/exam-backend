package lt.techin.Blogging.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import lt.techin.Blogging.model.Comment;

import java.time.LocalDateTime;
import java.util.List;

public class BlogPostEntityDto extends BlogPostDto {



    public BlogPostEntityDto() {

    }


    public BlogPostEntityDto(Long id, String name, String contents, String summary, LocalDateTime createdDate, String createdBy, List<Comment> comments) {
        super(id, name, contents, summary, createdDate, createdBy, comments);
    }

    @Override
    public List<Comment> getComments() {
        return super.getComments();
    }

    @Override
    public void setComments(List<Comment> comments) {
        super.setComments(comments);
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @Override
    public void setCreatedDate(LocalDateTime createdDate) {
        super.setCreatedDate(createdDate);
    }

    @Override
    public void setCreatedBy(String createdBy) {
        super.setCreatedBy(createdBy);
    }

    @Override
    public LocalDateTime getCreatedDate() {
        return super.getCreatedDate();
    }

    @Override
    public String getSummary() {
        return super.getSummary();
    }

    @Override
    public void setSummary(String summary) {
        super.setSummary(summary);
    }

    @Override
    public String getCreatedBy() {
        return super.getCreatedBy();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getContents() {
        return super.getContents();
    }

    @Override
    public void setContents(String contents) {
        super.setContents(contents);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
