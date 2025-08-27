import java.util.Scanner;   
class ValidateNumber
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int a = s.nextInt();

        if(a>0) 
          System.out.println(a+ " is a positive number");
        else if(a<0)
          System.out.println(a+ " is a negative number");
        else
          System.out.println( a+ " is neutral number");

    }
}