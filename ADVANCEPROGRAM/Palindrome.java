import java.util.Scanner;
class palindrome
{
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = s.nextInt();
     int rev =0 , temp=n;
     while(temp!=0)
     {
        rev = rev*10 + (temp%10);
        temp/=10;
     }

     System.out.println(rev==n? "Given Number is palindrome": "Given Number is not palindrome ");

     
    }

    

}