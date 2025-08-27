import java.util.Scanner;
class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Number which is greater then 100");
        int n = s.nextInt() , temp=n;
        int rev =0 ;
        while(temp!=0)
        {
            int digit = temp%10;
            rev = rev*10 + digit;
            temp/=10;
        }
        System.out.println("Original Number is : "+n);
        System.out.println("Reverse of Given number is : "+rev);

    }
}