import java.util.ArrayList;

public class Book {

    private String title;
    private  String  author;
    private String IBAN;

    public Book(String title,String author,String IBAN){
        this.author=author;
        this.IBAN=IBAN;
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public  String  getAuthor(){
        return  author;
    }

    public String getIBAN() {
        return  IBAN;
    }

    @Override
    public  String toString(){
        return "Title: " + title + ", Author: " + author + ", ISBN: " + IBAN;
    }
}

class   Library{
    private ArrayList<Book> books=new ArrayList<>();

    public  void add(Book book){
        books.add(book);
    }

    public  void  remove(Book book){
        books.remove(book);
    }

    public  void  list(){
       for(Book book: books){
           System.out.println(book);
       }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("1984", "George Orwell", "978-0451524935") ;
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.list();

        System.out.println("Remove list");
        library.remove(book2);
        library.list();
    }
}
