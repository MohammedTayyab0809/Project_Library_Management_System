package library_management_system;

public class Book {
    private int id, quantity;
    private String title, author;

    public Book(int id, String title, String author, int quantity){
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getQuantity(){
        return quantity;
    }

    public void displayBook(){
        System.out.printf("ID: %d %s by author %s with total quantity of %d\n", getId(), getTitle(), getAuthor(), getQuantity());
    }
}
