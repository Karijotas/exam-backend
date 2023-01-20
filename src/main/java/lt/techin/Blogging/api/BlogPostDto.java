package lt.techin.Blogging.api;

import java.util.Objects;

public class BlogPostDto {

    private Long id;
    private String name;

    private String contents;

    public BlogPostDto(){}

    public BlogPostDto( Long id, String name, String contents) {
        this.id = id;
        this.name = name;
        this.contents = contents;
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

