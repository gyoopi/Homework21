import java.util.*;
import java.util.stream.*;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Stream<Integer> stream = intList.stream();

        System.out.print("Do: ");
        intList.stream().
                forEach(x -> System.out.print(x +" "));
        System.out.println("");
        System.out.print("Posle: ");
        intList.stream().
                filter(x -> x > 0).
                filter(x -> x % 2 == 0).
                sorted().
                forEach(x -> System.out.print(x +" "));

    }
}
