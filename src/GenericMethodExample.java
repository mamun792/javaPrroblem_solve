public class GenericMethodExample {

    public  static  <T extends  Comparable<T>> T findMaxNumber(T [] array){
        if(array==null || array.length==0){
            return  null;
        }
        T min=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i].compareTo(min)<0){
                min=array[i];
            }
        }
        return  min;
    }

    public static void main(String[] args) {
        GenericMethodExample ob=new GenericMethodExample();
        Integer[] integers={2,5,8,9,6,3,1};
        Double[] doubles = {2.0, 3.0, 5.2, 6.3, 9.0};


        System.out.println(ob.findMaxNumber(integers));
        System.out.println(ob.findMaxNumber(doubles));


    }
}
