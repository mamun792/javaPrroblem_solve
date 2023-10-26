public class problem8 {
    public   String colur;
    public  int duration;

    public  problem8(String colur,int duration){
        this.colur=colur;
        this.duration=duration;
    }



    public  void change_color(String color,int durat){
       colur=color;
       duration=durat;
    }

    public  boolean isRed(){
        return colur.equals("red");
    }

    public  boolean isGreen(){
        return  colur.equals("green") ;
    }
    public  String getDisplay(){
        return "Colur is"+colur+"Diuration is "+duration;
    }
}

class TrafficLightApp{
    public static void main(String[] args) {
        problem8 ob=new problem8("red",40);
      ob.change_color("red",22);
        System.out.println("Gren is "+ ob.isGreen());
        System.out.println(ob.getDisplay());
        // System.out.println("Reed is "+ ob.isRed());
    }
}