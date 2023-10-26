import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    private String title;
    private  String  author;
    private String IBAN;

   public Problem1(String title,String author,String IBAN){
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

    public static void main(String[] args) {
        List<Problem1> books=new ArrayList<>();
        books.add(new Problem1("Book 1", "Author 1", "ISBN-1111"));
        books.add(new Problem1("Book 2", "Author 1", "ISBN-1111"));
        books.add(new Problem1("Book 3", "Author 1", "ISBN-1111"));

        System.out.println("List of books:");

        for (Problem1 book: books){
            System.out.println(book);
        }
        books.remove(2);

        System.out.println(" update List of books:");

        for (Problem1 book: books){
            System.out.println(book);
        }
    }

}
