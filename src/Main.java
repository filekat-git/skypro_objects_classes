public class Main {

    public static void main(String[] args) {

        Author authorFM = new Author("Fedor", "Dostoevskiy");
        Author authorWI = new Author("Walter", "Isaacson");

        Book book1 = new Book ("Karamazovs brothers", authorFM, 1879);
        System.out.println("book1.publishYear = " + book1.getPublishYear());
        book1.setPublishYear(1880);
        System.out.println("book1.publishYear = " + book1.getPublishYear());

        Book book2 = new Book("Elon Musk", authorWI, 2023);

        System.out.println("Book 1:" + "\n" + book1.getName() + "\n" + book1.getAuthor().getAuthorName() + " " +
                book1.getAuthor().getAuthorLastname() + "\n" + book1.getPublishYear());
        System.out.println("Book 2:" + "\n" + book2.getName() + "\n" + book2.getAuthor().getAuthorName() + " " +
                book2.getAuthor().getAuthorLastname() + "\n" + book2.getPublishYear());

        System.out.println("Books in library: " + Book.bookCounter);

    }

}