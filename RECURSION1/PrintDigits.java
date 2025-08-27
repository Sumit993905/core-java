import java.util.Scanner;
class PrintDigits
{
    public static void print(int n)
    { 
        if(n==0)
        {
            return;
        }

        System.out.println(n%10);
        print(n/10);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        print(num);
    }
}

