package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

// create a Stream of String Collection and filter all the names that start with 'S'
// and then append 'Moris' to all those names and then display
public class Tiwari {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Suyash", "Tiwari", "XML", "CSS","Shailesh");


         names.stream().filter(name -> name.startsWith("S")).map(x->x+" Moris").sorted().forEach(System.out::println);




        }
    }
