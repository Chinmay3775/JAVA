public class For_loop
{
    public static void main(String[] args) 
    {
        int i=1;
        for(i=i;i<=5;i++)
        {
            System.out.println("Day " + i);
            int j =9;
            for(j=j;j<17;j++)
            {
                if(j<12)
                System.out.println(" " + j + "am");
                else
                System.out.println(" " + j + "pm");
            }

        }
    }
}
