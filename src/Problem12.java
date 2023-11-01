import java.util.Date;

public class Problem12 {
    private String flightNumber;
    private String destination;
    private Date departureTime;
    private boolean delayed;

    public Problem12(String flightNumber,String destination,Date departureTime){
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.departureTime=departureTime;
        this.delayed=false;
    }

    public  String getDestination(){
        return  destination;
    }

    public  String getFlightNumber(){
        return  flightNumber;
    }

    public  Date getDepartureTime(){
        return departureTime;
    }

    public  boolean getDelay(){
        return  delayed;
    }

    public  boolean setdleay(boolean delayed){
       return this.delayed=delayed;
    }

    public String ChekDleayStatus(){
        if(delayed){
           return "Flight " + flightNumber + " to " + destination + " is delayed.";
        }else{
            return "Flight " + flightNumber + " to " + destination + " is delayed.";
        }
    }

    public  void DelayFlight(){
       delayed=true;
    }

    public String getFlightInfo() {
        return "Flight Number: " + flightNumber + "\nDestination: " + destination + "\nDeparture Time: " + departureTime;
    }
}

class Ariplan{
    public static void main(String[] args) {
        Problem12 ob=new Problem12("AA123", "Dhaka", new Date());
        ob.ChekDleayStatus();
        System.out.println( ob.getFlightInfo());
        ob.DelayFlight();
        System.out.println(ob.ChekDleayStatus());
    }
}
