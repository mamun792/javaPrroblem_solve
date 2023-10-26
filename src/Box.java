public class Box<T> {
    private  T contents;

    public  Box(T contents){
        this.contents=contents;
    }

    public   T getContents(){
        return  contents;
    }
}

class GenaricClass{
    public static void main(String[] args) {
        Box<Integer> roll=new Box<>(42);
        System.out.println("Rooll is "+ roll.getContents());

        Box<String> name=new Box<>("mamun");
        System.out.println("Rooll is "+ name.getContents());
    }
}
