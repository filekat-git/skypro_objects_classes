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

}
