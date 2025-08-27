import java.util.Scanner;
class Factorial
{
    public static int factorial(int n)
    { 
        int fact = 1 , st=2;
        while(st<=n)
        {
           fact *=st;
           st++;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Factorial is: " + factorial(num));
    }
}

       