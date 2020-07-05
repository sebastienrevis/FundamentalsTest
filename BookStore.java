package be.vdab.FundamentalsTest;

import java.util.Scanner;

public class BookStore {
        public static void main(String[] args) {
            Scanner book = new Scanner(System.in);  // Create a Scanner object
            System.out.print("Enter the book title: ");
            String bookTitle = book.nextLine();  // Read user input
            System.out.print("Enter the author's name: ");
            String authorName = book.nextLine();  // Read user input
            System.out.print("Enter the author's email: ");
            String authorEmail = book.nextLine();  // Read user input
            System.out.print("Enter the author's gender: ");
            String authorGender = book.nextLine();  // Read user input
            System.out.print("Enter the book price: ");
            String bookPrice = book.nextLine();  // Read user input
            System.out.print("Enter the book quantity: ");
            String bookQuantity = book.nextLine();  // Read user input

            System.out.println("Book: " +bookTitle
                              +" written by: " +authorName
                              +" Email: " + authorEmail
                              +" Gender: " + authorGender
                              +" Price: " + bookPrice
                              +" Quantity: " + bookQuantity);
        }
    }
