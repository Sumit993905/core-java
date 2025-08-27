import java.util.Scanner;
class SumEvenOdd
{
    public static void SumEvenOdd(int n)
    { 
        int sumEven = 0;
        int sumOdd  = 0;
        for(int i=1 ; i<=n ; i++)
        {
          if(i % 2 == 0) {
            sumEven += i;
          } else {
            sumOdd += i;
          }
        }
        System.out.println("Sum of even numbers is :" + sumEven);
        System.out.println("Sum of odd numbers is :" + sumOdd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        SumEvenOdd(num);
    }
}
