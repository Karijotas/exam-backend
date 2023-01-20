package lt.techin.Blogging.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String summary;

    private String contents;
    //
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "comments_id")
//    private List<Comment> comments;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @CreatedDate
    private LocalDateTime createdDate;

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;

    @PrePersist
    public void prePersist() {
        createdDate = LocalDateTime.now();
        modifiedDate = LocalDateTime.now();
        createdBy = "API app";
        modifiedBy = "API app";
    }

    @PreUpdate
    public void preUpdate() {
        modifiedDate = LocalDateTime.now();
        modifiedBy = "API app";
    }

    public Long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
//
//    public List<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<Comment> comments) {
//        this.comments = comments;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(getId(), blogPost.getId()) && Objects.equals(getName(), blogPost.getName()) && Objects.equals(getContents(), blogPost.getContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getContents());
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
