import java.util.ArrayList;
import java.util.List;

public class problem10 {
    private   String name;
    private List<String> courese;
    private   String grade;

    public  problem10(String name,String grade){
        this.name=name;
        this.grade=grade;
       this.courese=new ArrayList<>();
    }

    public  String getName(){
        return name;
    }
    public  String getGrade(){
        return  grade;
    }

public  List<String> getCourese(){
        return  courese;
}



public  void addCourse(String corse){
     courese.add(corse);
}
public  void remeveCouse(String cor){
        courese.remove(cor);
}

    public  String  Display(){
        return "Name is "+name +"Course is  "+courese +"Grade is"+grade;
    }
}

class  StudentApp{
    public static void main(String[] args) {
        problem10 s1=new problem10("Mamun","A+");
        s1.addCourse("c");
        s1.addCourse("java");
        s1.addCourse("php");

        System.out.println(s1.Display());
        s1.remeveCouse("c");
        System.out.println(s1.Display());

    }
}
