package lt.techin.Blogging.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String contents;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comments_id")
    private List<Comment> comments;

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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(getId(), blogPost.getId()) && Objects.equals(getName(), blogPost.getName()) && Objects.equals(getContents(), blogPost.getContents()) && Objects.equals(getComments(), blogPost.getComments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getContents(), getComments());
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                ", comments=" + comments.size() +
                '}';
    }
}
