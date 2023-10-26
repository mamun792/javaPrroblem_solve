import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Person {
    private String name;
    private  int age;
    private  String city;

    public  Person(String name,String city,int age){
        this.name=name;
        this.city=city;
        this.age=age;
    }
    public  String getName(){
        return  name;
    }
    public  String getCity(){
        return  city;
    }
    public  int getAge(){
        return  age;
    }
}

class  RealLifeExample{
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Person("Mamun","Dhaka",25));
        list.add(new Person("Mim","rangpur",25));
        list.add(new Person("Mitu","Kurigram",26));
        list.add(new Person("Moni","Dhaka",25));

        //consumer
        Consumer<Person> detiles=(person)->{
            System.out.println("Name: "+person.getName()+" City: "+person.getCity()+" Age: "+person.getAge());
        };

        System.out.println("Details of People:");
        list.forEach(detiles);

        // 2. Calculate the average age using a Function
        double avgerAge=calculateAveAge(list);
        System.out.println("AverageAge : "+avgerAge);

        // 3. Filter and list people from Dhaka using a Predicate
        Predicate<Person> fromDhaka = (persons) -> "Dhaka".equals(persons.getCity());
        List<Person> dhakaResidents = filterPeople(list, fromDhaka);

        System.out.println("Dhaka List ");
        dhakaResidents.forEach(detiles);
    }

    public  static  double calculateAveAge(List<Person> list){
         return  list.stream().mapToDouble(Person::getAge).average().orElse(0.0);
    }
    public  static  List<Person> filterPeople(List<Person> list, Predicate<Person> filter){
        return  list.stream().filter(filter).toList();
    }
}

