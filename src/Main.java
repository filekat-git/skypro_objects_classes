public class Main {

    public static void main(String[] args) {

        Author authorFM = new Author("Fedor", "Dostoevskiy");
        Author authorFM2 = new Author("Fedor", "Dostoevskiy");
        Author authorWI = new Author("Walter", "Isaacson");

        Book book1 = new Book ("Karamazovs brothers", authorFM, 1879);
        System.out.println(book1);
        Book book2 = new Book("Elon Musk", authorWI, 2023);
        System.out.println(book2);
        Book book3 = new Book ("Karamazovs brothers", authorFM2, 1880);
        System.out.println(book3);
        System.out.println("book 1 is egual to book 3 = " + book1.equals(book3));

        System.out.println("Books in library: " + Book.bookCounter);

    }

}