package be.vdab.FundamentalsTest;

public class Book {

    // private variables
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;
    private int bookQuantity=0;

    // constructor
public Book (String title, String author, double price, int quantity) {
    bookTitle = title;
    bookAuthor = author;
    bookPrice = price;
    bookQuantity = quantity;
}

    //getters
    public String getTitle(){ return bookTitle;}
    public String getAuthor(){ return bookAuthor;}
    public double getPrice(){ return bookPrice;}
    public int getQuantity(){ return bookQuantity;}

    //setters
    public void setTitle(String title){ bookTitle = title;}
    public void setAuthor(String author){ bookAuthor = author;}
    public void setPrice(double price){ bookPrice = price;}
    public void setQuantity(int quantity){ bookQuantity = quantity;}

    public String toString() {
        return ("Book: " +bookTitle +"\n"
                +"Author: " +bookAuthor +"\n"
                +"bookPrice: " +bookPrice +"\n"
                +"Quantity: " +bookQuantity +"\n");
    }
}
