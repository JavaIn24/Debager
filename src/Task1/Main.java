package Task1;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer [] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        Optional <Integer> max = Arrays.stream(arrayNumbers).filter(num -> num % 2 == 0 ).max(Integer::compare);
        System.out.println(max.get());

    }

}
