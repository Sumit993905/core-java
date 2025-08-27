
import java.util.Scanner;

class StrongNumber
{
    public static int fact(int n)
    {
        if(n==0)
           return 1;

        return n*fact(n-1);
    }

    public static int sum(int n)
    {
        if(n==0)
          return 0;
        
        return fact(n%10) + sum(n/10);
    }



    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int sum = sum(n);
        String res = (sum==n)? n+" is Strong-Number" : n+" is not Strong-Number";
        System.out.println(res);

    }
}