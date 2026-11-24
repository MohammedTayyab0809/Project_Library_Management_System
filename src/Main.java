import library_management_system.Book;
import library_management_system.Library;
import library_management_system.Member;


public class Main {
    public static void main(String[] args) {
        /*
        Library management system with following features
        Add book, View all books, search book, Register member, view all members, borrow books, return books,
        view borrowed books, exit
         */

        // Books

        Library library = new Library();
        Book book1 = new Book(1, "Summer Story", "Thomas", 10);
        Book book2 = new Book(2, "Winter Story", "Thomsan", 10);
        Book book3 = new Book(3, "Spring story", "John", 10);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Book found = library.findBookById(11);
        if (found != null){
            found.displayBook();
        } else {
            System.out.println("Entered Book id is not available");
        }

        // Members
        Member member = new Member(1, "Thomas");
        Member member1 = new Member(2, "Thomsan");
        Member member2 = new Member(3, "John");
        library.addMembers(member);
        library.addMembers(member1);
        library.addMembers(member2);

        library.viewMembers();
        Member foundMember = library.findMembersById(5);
        if (foundMember != null){
            foundMember.displayMembers();
        } else {
            System.out.println("Entered member id is not available!");
        }


    }
}
