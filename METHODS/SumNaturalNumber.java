import java.util.Scanner;
class SumNaturalNumber
{
    public static void sum(int n)
    { 
        int sum = 0;
        for(int i=1 ; i<=n ; i++)
        {
           sum += i;
        }
        System.out.println("Sum of natural numbers is :" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sum(num);
    }
}
