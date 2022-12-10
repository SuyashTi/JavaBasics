package Collections;
import  java.util.Scanner;
public class LibraryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1:Add Members 2:Delete 3:Search for a Member ");
             int choice = sc.nextInt();
             if(choice==1){
                 System.out.println("Enter Member ID");
                 int memberId = sc.nextInt();
                 System.out.println("Enter Name");
                 String name= sc.next();
                 System.out.println("Enter address");
                 String address= sc.next();
               //  Member member = new Member(memberId);

             }
        }
    }
}
