import java.util.Scanner;
class PrintOddDigit
{
    public static void print(int n)
    { 
        if(n==0)
        {
            return;
        }


        int last = n%10;
        if(last%2==1)
           System.out.println(last);

        print(n/10);
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        print(num);
    }
}

