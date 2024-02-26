package collections2;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

class Book {
    // Book class definition with attributes like title, author, publication year, etc.
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return publicationYear+" - "+title+" by "+author;
    }
}


public class BookshelfManagement {
    public static void main(String[] args) {
        Set<Book> bookshelf = new TreeSet<>(Comparator.comparingInt(Book::getPublicationYear).reversed());
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        System.out.println("Add book");
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int publicationYear = scanner.nextInt();
        Book inputBook = new Book(title, author, publicationYear);
        bookshelf.add(inputBook);
        bookshelf.add(new Book("book1", "author1", 1973));
        bookshelf.add(new Book("book2", "author2", 1976));
        bookshelf.add(new Book("book3", "author3", 2000));
        System.out.println("Remove book");
        int eleToRemYear = scanner.nextInt();
        for(Book book: bookshelf){
            if(book.getPublicationYear()==eleToRemYear){
                bookshelf.remove(book);
                break;
            }
        }
        System.out.println("Display all books");
        for(Book book: bookshelf){
            System.out.println(book);
        }

        scanner.close();

    }
}
