import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        // 9
        // 2 4 8 16 20 21 30 34
        List<Integer> newIntList = new ArrayList<>();
        for (Integer i : intList) {
            if (!(i > 0 && i % 2 == 0)) continue;
            newIntList.add(i);
        }
        newIntList.sort(Comparator.naturalOrder());
        intList = newIntList;
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
    }
}