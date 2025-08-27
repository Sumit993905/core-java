import java.util.Scanner;

class Count
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the n value");
       int st =1 , n = s.nextInt() , count =0  ;
       while(st<=n)
       {
        count++;
        st++;
       }

       System.out.println("Count of "+n+" is : "+count);


        
    }
}