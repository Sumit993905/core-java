import java.util.Scanner;
class Factorial
{
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = s.nextInt() , st = 2 , fact =1 ;
        while(st<=n)
        {
            fact*=st;
            st++;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}