import java.util.ArrayList;
import java.util.List;

public class Wildcards_and_upper_lower_bounds {
   private  String name;
   private  double salary;

   public Wildcards_and_upper_lower_bounds(String name,double salary){
       this.name=name;
       this.salary=salary;
   }

   public  String getName(){
       return  name;
   }

   public  double getSalary(){
       return  salary;
   }
}

class Salary{
    public  static <T extends  Wildcards_and_upper_lower_bounds> T findmaxSalary(List<T> emplye){
        if(emplye.isEmpty()){
            return  null;
        }
         T max=emplye.get(0);

        for (T salary : emplye){
           if(salary.getSalary()>max.getSalary()){
               max=salary;
           }
        }
        return  max;
    }
}

class  emplyees{
    public static void main(String[] args) {
        List<Wildcards_and_upper_lower_bounds> emplye=new ArrayList<>();    /// hold Wildcards_and_upper_lower_bounds  class object;
        emplye.add(new Wildcards_and_upper_lower_bounds("mamun",2000));
        emplye.add(new Wildcards_and_upper_lower_bounds("mamun",1000));
        emplye.add(new Wildcards_and_upper_lower_bounds("mamun",5000));
        emplye.add(new Wildcards_and_upper_lower_bounds("mamun",9000));

        Wildcards_and_upper_lower_bounds maximum=Salary.findmaxSalary(emplye);
        if(emplye!=null){
            System.out.println("max slary is : "+maximum.getSalary());
        }
    }
}






