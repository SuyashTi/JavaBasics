package Collections;

import java.util.ArrayList;
import java.util.List;
public class Employee{
    public static void main(String args[]){
        //Creating a List
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Suyash");
        list.add("Shailesh");
        list.add("Ravi");
        list.add("Vivek");
        //Iterating the List element using for-each loop
        for(String employee:list)
            if(employee.startsWith("S"))
            System.out.println(employee);

    }
}
