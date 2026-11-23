package library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book newBook){
        books.add(newBook);
    }

    public void viewBooks(){
        for(Book book : books){
            book.displayBook();
        }
    }

    public Book findBookById(int id){
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
