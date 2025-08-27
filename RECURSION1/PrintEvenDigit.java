import java.util.Scanner;
class PrintEvenDigit
{
    public static void print(int n)
    { 
        if(n==0)
        {
            return;
        }

        print(n/10);
        int last = n%10;
        if(last%2==0)
           System.out.println(last);
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        print(num);
    }
}

