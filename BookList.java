package be.vdab.FundamentalsTest;

public class BookList {

    public static void main(String[] args) {
        Book book1, book2, book3;

        book1 = new Book("Great book", "Ben", 10.0, 3);
        book2 = new Book("Best book", "John", 12.0, 5);
        book3 = new Book("Ultimate book", "Marie", 15.0, 2);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
