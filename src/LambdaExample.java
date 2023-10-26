
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);

        Consumer<Integer> num=(number)->{
            System.out.println(number);
        };
        System.out.println("Original Numbers: ");
        numbers.forEach(num);
        System.out.println();

        //functional

        Function<Integer, Integer>  sq=(n)->n*n;
        System.out.println("Square Number is: ");
        numbers.stream().map(sq).forEach(num);
        System.out.println();

        // Using a Predicate to filter even numbers
        Predicate<Integer> isEven=(number)->number%2==0;
        System.out.println("Even Number is: ");
        numbers.stream().filter(isEven).forEach(num);
    }
}
