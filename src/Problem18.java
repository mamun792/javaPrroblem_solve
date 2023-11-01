import java.util.ArrayList;

import java.util.List;

public class Problem18 {

    private List<String> menuItems;
    private List<Double> prices;
    private List<Integer> ratings;

    public  Problem18(){
        this.menuItems=new ArrayList<>();
        this.prices=new ArrayList<>();
        this.ratings=new ArrayList<>();

    }

    public  void addItem(String item,double ppric,int rat){
        menuItems.add(item);
        prices.add(ppric);
        ratings.add(rat);
    }

    public void  RemoveItem(String item,double pric,int rat){
    int index= menuItems.indexOf(item);

     if(index!=-1){
         menuItems.remove(item);
         prices.remove(pric);
         ratings.remove(rat);
     }
    }

    public  double CalcluteRating(){
        if(ratings.isEmpty()){
            return 0.0;
        }
            int rating=0;
            for(double ratisngs:ratings){
                rating+=ratisngs;
            }

        return (double)rating /ratings.size();
    }

    public void displayMenu() {
        System.out.println("Menu Items:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " - $" + prices.get(i) + " - Rating: " + ratings.get(i));
        }
    }
}

class RestudentApp{
    public static void main(String[] args) {
        Problem18 m1=new Problem18();
       m1.addItem("Burger", 8.99, 4);
       m1.addItem("Pizza", 12.99, 5);
       m1.addItem("Salad", 6.99, 3);
       m1.displayMenu();
        System.out.println( m1.CalcluteRating());

    }
}
