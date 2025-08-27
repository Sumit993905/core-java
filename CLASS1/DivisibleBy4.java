
import java.util.Scanner;


class DivisibleBy4
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Eneter a Number : ");
        int n = s.nextInt();

        if( n%4 == 0)
           System.out.println(n+" is divisible by 4");
        else 
           System.out.println(n+" is not divisible by 4");
    }
}