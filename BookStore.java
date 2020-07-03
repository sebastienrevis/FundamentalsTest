package be.vdab.FundamentalsTest;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
        public static void main(String[] args) {
            Scanner book = new Scanner(System.in);  // Create a Scanner object
            System.out.print("Enter the book name: ");
            String bookTitle = book.nextLine();  // Read user input
            System.out.println("Enter the author: ");
            String bookAuthor = book.nextLine();  // Read user input
            System.out.println("Book: " +bookTitle +" is written by: " +bookAuthor);
        }
    }