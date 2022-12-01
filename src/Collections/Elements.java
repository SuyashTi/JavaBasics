package Collections;
//create an ArrayList of integers and add 5 elements to it.


    import java.util.ArrayList;

    class Elements {
        public static void main(String[] args)
        {
            ArrayList<Integer> list = new ArrayList<>();
            int sum =0;

            // add method for integer ArrayList
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

           for(Integer l : list)
               if(l%2!=0)
                   sum=sum+l;

           // System.out.println(l+);
            System.out.println(sum);
        }

    }



