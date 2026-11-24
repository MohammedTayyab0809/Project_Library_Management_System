package library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Members> members = new ArrayList<>();

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

    public void addMembers(Members newMember){
        members.add(newMember);
    }

    public Members findMembersById(int id){
        for (Members member : members){
            if (member.getRegID() == id){
                return member;
            }
        }
        return null;
    }

    public void viewMembers(){
        for (Members member : members){
            member.displayMembers();
        }
    }
}
