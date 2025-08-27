import java.util.Scanner;
class CountDigit
{
    public static int count(int n)
    { 
        if(n==0)
        {
            return 0;
        }

       return 1+count(n/10);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Count of digit of " + num + " is : " + count(num));
    }
}

