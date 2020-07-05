package be.vdab.FundamentalsTest;

public class AuthorList {

    public static void main(String[] args) {
        Author author1, author2, author3;

        author1 = new Author("Ben", "ben@ben.com", 'M');
        author2 = new Author("John", "john@john.com", 'M');
        author3 = new Author("Marie", "marie@marie.com", 'F');

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
    }
}


