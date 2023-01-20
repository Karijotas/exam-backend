package lt.techin.Blogging.api;

public class BlogPostEntityDto extends BlogPostDto {



    public BlogPostEntityDto() {

    }

    public BlogPostEntityDto(Long id, String name, String contents) {
        super(id, name, contents);
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
