import java.util.Scanner;
class SumDigit
{
    public static int sumDigit(int n)
    { 
        int sum = 0;
        while(n!=0)
        {
           int digit = n % 10;
           sum += digit;
           n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Sum of digits is: " + sumDigit(num));
    }
}

       