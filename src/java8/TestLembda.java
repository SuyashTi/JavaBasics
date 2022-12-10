package java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestLembda {

    public static void main(String[]  args){
       Consumer<String> con = n-> System.out.println(n);
       con.accept("hello");

        Predicate<Integer> obj1 = x -> x%2!=0;
        System.out.println((obj1.test(3)));
        SuyashInterface obj =  (a,b)->{
            if (a>b){
                return a;
            }
            else{
                return b;
            }
        };
        System.out.println("Greater no is" +obj.getGreater(10,30));
    }

}
