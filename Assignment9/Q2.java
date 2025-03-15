package demo09;

import java.util.*;

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

public class Library2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Book> hashSet = new HashSet<>();
        Set<Book> linkedHashSet = new LinkedHashSet<>();

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
            hashSet.add(book);  // Add to HashSet
        }

              linkedHashSet.addAll(hashSet);

        System.out.println("\nBooks in LinkedHashSet (Insertion Order):");
        for (Book book : linkedHashSet) {
            System.out.println(book);
        }
    }
}
