import java.util.Scanner;
class PrintOdd
{
    public static void print(int n)
    { 
        if(n==0)
        {
            return;
        }

        print(n-1);
        if(n%2==1)
          System.out.println(n);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        print(num);
    }
}

