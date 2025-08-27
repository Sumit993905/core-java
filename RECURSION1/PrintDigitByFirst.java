import java.util.Scanner;
class PrintDigitByFirst
{
    public static void print(int n)
    { 
        if(n==0)
        {
            return;
        }

        print(n/10);
        System.out.println(n%10);
       
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        print(num);
    }
}

