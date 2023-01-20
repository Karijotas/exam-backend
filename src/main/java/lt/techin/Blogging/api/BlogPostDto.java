package lt.techin.Blogging.api;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Objects;

public class BlogPostDto {

    private Long id;
    private String name;

    private String contents;
    private String summary;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime createdDate;
    private String createdBy;


    public BlogPostDto(){}

    public BlogPostDto( Long id, String name,String summary, String contents, LocalDateTime createdDate, String createdBy) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.contents = contents;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPostDto that = (BlogPostDto) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getContents(), that.getContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getContents());
    }

    @Override
    public String
    toString() {
        return "BlogPostDto{" +
                "name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}

