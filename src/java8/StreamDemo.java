package java8;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(23, 21, 4, 7,8,10);
        Stream<Integer> numbersStream = numbers.stream();//this will create a Stream for numbers

        numbersStream.filter(x -> x % 2 == 0).map(x->x*10).forEach(n->System.out.println(n));
    }
}
