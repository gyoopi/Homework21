import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedIntList = new ArrayList<>();

        System.out.println("Do: " + intList);
        for (int i = 0; intList.size() > i; i++) {
            if (((intList.get(i) > 0) && (intList.get(i) % 2 == 0))) {
                sortedIntList.add(intList.get(i));
            }
        }
        Collections.sort(sortedIntList);
        System.out.println("Posle: " + sortedIntList);
    }
}
