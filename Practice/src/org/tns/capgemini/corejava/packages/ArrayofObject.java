package org.tns.capgemini.corejava.packages;

//Book class to represent each book
class Book {
 String title;
 String author;
 double price;

 // Constructor
 Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Display book details
 void display() {
     System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
 }
}

public class ArrayofObject {
 public static void main(String[] args) {
     // Create an array of Book objects
     Book[] books = new Book[3];  // Array to hold 3 books

     // Add books to the array
     books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
     books[1] = new Book("1984", "George Orwell", 8.99);
     books[2] = new Book("To Kill a Mockingbird", "Harper Lee", 7.99);

     // Display details of all books
     for (Book book : books) {
         book.display();
     }
 }
}
