import java.util.Scanner;
class EvenNumber
{
    public static void print(int n)
    { 
        int count = 0;
        for(int i=1 ; i<=n ; i++)
        {
           if(i%2==0)
           {
            count++;
           }
        }
        System.out.println("count of even number is :" + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        print(num);
    }
}
