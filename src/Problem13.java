import java.util.ArrayList;
import java.util.List;

public class Problem13 {
    private  String name;
    private  int quantity;

   public Problem13(String name,int quantity){
       this.name=name;
       this.quantity=quantity;
   }

   public  String getName(){
       return  name;
   }

   public  int getQuantity(){
       return  quantity;
   }

   public  int setQunatity(){
       return  this.quantity=quantity;
   }

   public  String toString(){
       return name + " (Quantity: " + quantity + ")";
   }
}

class  Inventey{
    List<Problem13> products;

    public  Inventey(){
        products=new ArrayList<>();
    }

    public  void addProduct(Problem13 product){
        products.add(product);
    }

    public  void removeProduct(Problem13 produ){
        products.remove(produ);
    }

    public  void ChekQuantity(Problem13 qu){
        for(Problem13 product: products){
            if(product.getQuantity()<100){
                System.out.println(product);
            }
        }

    }
    public void displayInventory() {
        for (Problem13 product : products) {
            System.out.println(product);
        }
    }
}

class  InventoryApp{
    public static void main(String[] args) {
        Problem13 ob=new Problem13("Apple",200);
        Problem13 ob1=new Problem13("Banala",300);
        Problem13 ob2=new Problem13("Oriange",10);

        Inventey inventey=new Inventey();
        inventey.addProduct(ob1);
        inventey.addProduct(ob);
        inventey.addProduct(ob2);
 inventey.displayInventory();
        System.out.println("Chek inventory ");
        inventey.ChekQuantity(ob2);

    }
}
