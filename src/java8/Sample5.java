package java8;

public class Sample5 {

    // Create a method with variable arguments where if no parameter is passed
// then a welcome message will be displayed.
// for single parameter: add 10 and display
// for two parameters: average of the numbers
// for three parameters: sum of the numbers
    public static void main(String[] args) {


        Sample5 obj = new Sample5();
        obj.getVal();
        obj.getVal(3);


    }

    void getVal(int... value) {
        if (value.length == 0)
            System.out.println("Welcome");

        else if(value.length==1)
            System.out.println("The output is "+(value[0]+10));
    }


}

//

