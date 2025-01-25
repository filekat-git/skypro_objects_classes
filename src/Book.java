public class Book {

    private String name;
    private Author author;
    private int publishYear;
    public static int bookCounter;

    public Book(String name, Author author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        bookCounter++;
    }

    public String getName(){
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }


}
