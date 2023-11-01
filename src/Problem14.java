import java.util.ArrayList;

public class Problem14 {
    private ArrayList<Student> students;
    private  ArrayList<Texher> texhers;
    private  ArrayList<Schoolclass>schoolclasses;

    public  Problem14(){
        this.students=new ArrayList<Student>();
        this.texhers=new ArrayList<Texher>();
        this.schoolclasses=new ArrayList<Schoolclass>();

    }

    public  void AddStudent(Student student){
        students.add(student);
    }

    public  void RemoveStudent(Student student){
       students.remove(student);
    }

    public  void  AddTeacher(Texher texher){
        texhers.add(texher);
    }

    public  void removeTecher(Texher texher){
        texhers.remove(texher);
    }

    public  void AddClass(Schoolclass schoolclass){
     schoolclasses.add(schoolclass);
    }

    public  void RemobveShollClass(Schoolclass schoolclass){
        schoolclasses.remove(schoolclass);
    }

    public  ArrayList<Student> getStudents(){
        return  students;
    }

    public  ArrayList<Texher> getTexhers(){
        return  texhers;
    }

    public  ArrayList<Schoolclass> getSchoolclasses(){
        return  schoolclasses;
    }
}

class  Student{
    private  String name;
    private  int age;

    public  Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public  String getName(){
        return  name;
    }

    public String setname(){
        return  this.name=name;
    }
    public  int getAge(){
        return  age;
    }

    public  int setAge(){
        return  this.age=age;
    }
}

class  Texher{
    private  String name;
    private  String sunject;

    public   Texher(String name,String sunject){
        this.name=name;
        this.sunject=sunject;
    }
    public  String getName(){
        return  name;
    }

    public  String setName(){
      return   this.name=name;
    }

    public  String getSunject(){
        return  sunject;
    }

    public  String setSubject(){
        return  this.sunject=sunject;
    }
}

class  Schoolclass{
    private  String classname;
    private   Texher texher;  // Teacher object to represent the teacher for the class
    private  ArrayList<Student> students;

    public  Schoolclass(String classname,Texher texher){
        this.classname=classname;
        this.texher=texher;
        this.students=new ArrayList<>();
    }

    public  String getClassname(){
        return  classname;
    }
    public  String setSchol(){
        return  this.classname=classname;
    }

    public  Texher getTexher(){
        return  texher;
    }

    public Texher setThecher(){
        return  this.texher=texher;
    }

    public  ArrayList<Student> getStudents(){
        return  students;
    }

    public  void AddStudent(Student student){
        students.add(student);
    }

    public  void removeStudent(Student student){
        students.remove(student);
    }

}

 class SchoolApp {
    public static void main(String[] args) {
        // Create a new instance of Problem14
        Problem14 school = new Problem14();

        // Create some students
        Student student1 = new Student("Alice", 16);
        Student student2 = new Student("Bob", 15);

        // Create some teachers
        Texher teacher1 = new Texher("Mr. Smith", "Math");
        Texher teacher2 = new Texher("Mrs. Johnson", "Science");

        // Create some school classes
        Schoolclass class1 = new Schoolclass("Math Class", teacher1);
        Schoolclass class2 = new Schoolclass("Science Class", teacher2);

        // Add students, teachers, and classes to the school
        school.AddStudent(student1);
        school.AddStudent(student2);
        school.AddTeacher(teacher1);
        school.AddTeacher(teacher2);
        school.AddClass(class1);
        school.AddClass(class2);

        // Retrieve and display the list of students, teachers, and classes
        System.out.println("List of students:");
        for (Student student : school.getStudents()) {
            System.out.println(student.getName() + " (Age: " + student.getAge() + ")");
        }

        System.out.println("\nList of teachers:");
        for (Texher teacher : school.getTexhers()) {
            System.out.println(teacher.getName() + " (Subject: " + teacher.getSunject() + ")");
        }

        System.out.println("\nList of classes:");
        for (Schoolclass schoolclass : school.getSchoolclasses()) {
            System.out.println(schoolclass.getClassname() + " (Teacher: " + schoolclass.getTexher().getName() + ")");
        }

        // Remove a student, a teacher, and a class
        school.RemoveStudent(student1);
        school.removeTecher(teacher2);


        // Updated lists after removal
        System.out.println("\nUpdated list of students:");
        for (Student student : school.getStudents()) {
            System.out.println(student.getName() + " (Age: " + student.getAge() + ")");
        }

        System.out.println("\nUpdated list of teachers:");
        for (Texher teacher : school.getTexhers()) {
            System.out.println(teacher.getName() + " (Subject: " + teacher.getSunject() + ")");
        }


    }
}

