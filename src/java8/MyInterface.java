package java8;
@FunctionalInterface//Anotation are instruction to compiler
public interface MyInterface {
    int getSum(int a,int b);

    //common behaviour
    static void hello(){
        System.out.println("Static method example");
    }
    //give default behavior to implementing class if not ovrtrifdden ;
    default void defMethod(){
        System.out.println("Default method example");
    }

}

// functional interface : Only one method will be abstract
//static method
//default method
//Lembda Expression : it convert a funtion into a corresponding lambda expression
