import java.time.LocalDate;
import java.time.Period;

public class problem9 {

    public  String Name;
    public  double salary;
    public LocalDate date;

    public  problem9(String Name,double salary,LocalDate date){
        this.Name=Name;
        this.date=date;
        this.salary=salary;
    }


    public  void  YearofService(){
       Period period= Period.between(date, LocalDate.now());
       int year=period.getYears();
        System.out.println("Years of Service: " + year + " years");
    }

    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2010, 5, 15);
        problem9 ob = new problem9("John Doe", 50000.0, hireDate);
        System.out.println("Hire Date: " + ob.date);
        ob.YearofService();
    }
}
