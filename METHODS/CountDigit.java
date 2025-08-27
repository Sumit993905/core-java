import java.util.Scanner;
class CountDigit
{
    public static int countDigit(int n)
    { 
        int count = 0;
        while(n!=0)
        {
           
           count++;
           n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Count of digits is: " + countDigit(num));
    }
}
