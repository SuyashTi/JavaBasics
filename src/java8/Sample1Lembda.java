package java8;

import java.util.function.BiPredicate;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Sample1Lembda {
    public static void main(String[] args) {


        BiPredicate<Integer ,Integer> biPredicate = (n, s) ->
        {
            if (n == s)
                return true;
            return false;
        };
        System.out.println(biPredicate.test(2, 6));

        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());


        IntConsumer display = a -> System.out.println(a * 10);

        // Using accept() method
        display.accept(3);

    }
}
//The lambda expression assigned to an object of Supplier type is used to define its get(
//it represents a function which does not take in any argument but produces a value of type T.
