
import java.util.Scanner;


class Greatest 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = s.nextInt(),b = s.nextInt(),c = s.nextInt();

        if(a >= b && a >= c)
            System.out.println(a + " is the greatest number.");
        else if( b >= c)
            System.out.println(b + " is the greatest number.");
        else
            System.out.println(c + " is the greatest number.");

    }
}