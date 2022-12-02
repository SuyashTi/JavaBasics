package LinkedList;
//// Create separate Maps of student where the key will represent the grade and value will be all
//  // students who has that grade
//HashMap<String, String> postalCodes = new HashMap<>();
 //       postalCodes.put("00710", "Helsinki");
  //      postalCodes.put("90014", "Oulu");
  //      postalCodes.put("33720", "Tampere");
 //       postalCodes.put("33014", "Tampere");

import java.util.HashMap;

//      System.out.println(postalCodes.get("00710"));
public class StudentMap {
    public static void main(String[] args){

        HashMap<String,String>  studentNames = new HashMap<>();
        studentNames.put("A" , "Suyash");
        studentNames.put("B" , "Shailesh");
        studentNames.put("C" , "Ravi");
        studentNames.put("D" , "Suraj");


        System.out.println(studentNames.get("A"));







    }


}
