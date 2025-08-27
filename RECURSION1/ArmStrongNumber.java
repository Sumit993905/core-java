
import java.util.Scanner;

class ArmStrongNumber
{
    public static int count(int n)
    {
        if(n==0)
           return 0;
        
        return 1+count(n/10);
    }
    public static int power(int base , int exp)
    {
        if(exp==0)
          return 1;
        
        return base * power(base, exp-1);
    }

    public static int sum(int n , int count)
    {
        if(n==0)
          return 0;

        return power(n%10,count) + sum(n/10 , count);
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int count = count(n);
        int sum = sum(n,count);
        String res = (sum==n)? n+" is Arm-Strong-Number" : n+" is not Arm-Strong-Number";
        System.out.println(res);

    }
}