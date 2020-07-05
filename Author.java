package be.vdab.FundamentalsTest;

public class Author {

    // private variables
    private String authorName;
    private String authorEmail;
    private char authorGender;

    // constructor
    public Author(String name, String email, char gender) {
        authorName = name;
        authorEmail = email;
        authorGender = gender;
    }

    //getters
    public String getName() {
        return authorName;
    }

    public String getEmail() {
        return authorEmail;
    }

    public char getGender() {
        return authorGender;
    }

     //setters
    public void setName(String name) {
        authorName = name;
    }

    public void setEmail(String email) {
        authorEmail = email;
    }

    public void setGender(char gender) {
        authorGender = gender;
    }

    public String toString() {
        return ("Author: " + authorName + "\n"
                + "Email: " + authorEmail + "\n"
                + "Gender: " + authorGender + "\n");
    }
}
