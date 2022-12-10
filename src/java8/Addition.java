package java8;

public interface Addition {
    int add(int a, int b);
}

class Test{
    public static void main(String[] args){
        Addition add = (a,b)->{
            if(a>b)
                return a;
               // System.out.println("A");
            else
                return b;
               // System.out.println("B");
        };
        System.out.println("Greater no is :"+add.add(12,45));

    }
}
