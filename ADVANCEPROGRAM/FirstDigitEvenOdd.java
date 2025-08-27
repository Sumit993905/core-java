import java.util.Scanner;
class FirstDigitEvenOdd
{
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = s.nextInt();
     int firstDigit=0;
     while(n!=0)
     {
        firstDigit = n%10;
        n/=10;
     }
     System.out.println(firstDigit%2==0? " First digit is Even" : "First digit is odd");
    }

    

}