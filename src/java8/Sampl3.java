package java8;

public class Sampl3 {

    public static  void main(String... args){
        Sampl3 obj = new Sampl3();
        obj.getVal();
        obj.getVal(1,4);
        obj.getVal(1,4,8);

    }
    int getVal(int... value){
        if(value.length==0)
        System.out.println("Variale argument");
        return 350;
    }

}
//
