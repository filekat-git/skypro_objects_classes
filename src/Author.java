import java.util.Objects;

public class Author {

    private String name;
    private String lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getAuthorName () {
        return this.name;
    }

    public String getAuthorLastname() {
        return this.lastname;
    }

    @Override
    public String toString() {
        return "author \'" + name + " " + lastname + "\'";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
