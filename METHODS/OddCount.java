import java.util.Scanner;
class OddCount
{
    public static void print(int n)
    { 
        int count = 0;
        for(int i=1 ; i<=n ; i++)
        {
           if(i%2==1)
           {
            count++;
           }
        }
        System.out.println("count of odd number is :" + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        print(num);
    }
}
