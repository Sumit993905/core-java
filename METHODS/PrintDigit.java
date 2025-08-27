import java.util.Scanner;
class PrintDigit
{
    public static void printDigit(int n)
    { 
        //12345
        while(n!=0)
        {
           int digit = n % 10;
           System.out.println("Digit at unit place is: " + digit);
           n = n / 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        printDigit(num);
    }
}
