package demo10;

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

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Book> hashSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("ISBN: ");
            String isbn = sc.nextLine();

            System.out.print("Category: ");
            Cat category = Cat.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Price: ");
            double price = sc.nextDouble();

            sc.nextLine();

            System.out.print("Publish Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Book book = new Book(isbn, category, price, date, author, quantity);
            hashSet.add(book);
        }

        List<Book> bookList = new ArrayList<>(hashSet);

        bookList.sort(Comparator.comparing(book -> book.publishDate));

        System.out.println("\nBooks Sorted by Publish Date:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
