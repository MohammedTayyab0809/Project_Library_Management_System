import library_management_system.Book;
import library_management_system.Library;
import library_management_system.Members;


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
        Members member = new Members(1, "Thomas");
        Members member1 = new Members(2, "Thomsan");
        Members member2 = new Members(3, "John");
        library.addMembers(member);
        library.addMembers(member1);
        library.addMembers(member2);

        library.viewMembers();
        Members foundMember = library.findMembersById(5);
        if (foundMember != null){
            foundMember.displayMembers();
        } else {
            System.out.println("Entered member id is not available!");
        }


    }
}
