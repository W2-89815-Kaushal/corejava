package demo08;
import java.util.*;

import demo09.Book;
import demo09.Cat;

enum Cat {
    FICTION, NON_FICTION, SCIENCE, HISTORY, ART, TECHNOLOGY
}

class Book {
    String isbn;
    Cat category;
    double price;
    String publishDate;
    String author;
    int quantity;

    public Book(String isbn, Cat category, double price, String publishDate, String author, int quantity) {
        this.isbn = isbn;
        this.category = category;
        this.price = price;
        this.publishDate = publishDate;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Category: " + category + ", Price: " + price + ", Date: " + publishDate + 
               ", Author: " + author + ", Quantity: " + quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Book> books = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("ISBN: ");
            String isbn = sc.nextLine();

            System.out.print("Category: ");
            Cat category = Cat.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Price: ");
            double price = sc.nextDouble();

            sc.nextLine();

            System.out.print("Publish Date: ");
            String date = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Book book = new Book(isbn, category, price, date, author, quantity);
            books.add(book);
        }

        System.out.println("\nBooks in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
