import java.util.ArrayList;
import java.util.List;

public class problem11 {

    private  String bookName;
    private String title;

    public  problem11(String bookName,String title){
        this.bookName=bookName;
        this.title=title;
    }

    public  String getTitle(){
        return  title;
    }
    public  String getBookName(){
        return  bookName;
    }

    public String toString(){
        return  "Nam is "+bookName + " title is "+title;
    }
}

interface  LibearService{
    void addBook(problem11 book);
     boolean removeBook(problem11 book);

     void dispaly();
}

class  Libeary implements  LibearService{
    private  List<problem11> book=new ArrayList<>();
@Override
    public  void  addBook(problem11 books){
        book.add(books);
    }
@Override
   public  boolean removeBook(problem11 boos){
        return  book.remove(boos);
   }
@Override
   public  void dispaly(){
     for(problem11 books: book){
         System.out.println(books);
     }
   }
}

class LibearyApp{
    public static void main(String[] args) {

       problem11 book=new problem11("c","progeam");
        problem11 book1=new problem11("c++","progeam");
        problem11 book2=new problem11("java","progeam");
        problem11 book3=new problem11("python","progeam");


        LibearService ob=new Libeary();
        ob.addBook(book);
        ob.addBook(book1);
        ob.addBook(book3);

        System.out.println("List of book ");
        ob.dispaly();

        ob.removeBook(book1);

        System.out.println("Update list book ");
        ob.dispaly();

    }
}
