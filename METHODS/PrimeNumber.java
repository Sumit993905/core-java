import java.util.Scanner;
class PrimeNumber
{
    public static void prime(int n)
    { 
        int count = 0;
        for(int i=1 ; i<=n ; i++)
        {
           if(n%i==0)
           {
            count++;
           }
        }
        System.out.println(count == 2 ? n + " is a prime number." : n + " is not a prime number.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        prime(num);
    }
}
