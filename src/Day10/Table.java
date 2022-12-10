package Day10;
//Use synchronized method to display table of 5 and table of 8 in the same way that we did in last example

class Table
{
    void tab(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = " +n*i);
            try
            {
                Thread.sleep(400);

            }
            catch(Exception e)
            {

            }
        }

    }
}