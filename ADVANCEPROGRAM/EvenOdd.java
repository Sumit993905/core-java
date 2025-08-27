import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        if((n/2 + n/2 == n))  //See the logic here
        {
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }

    }
}