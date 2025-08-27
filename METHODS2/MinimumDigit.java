import java.util.Scanner;
class MinimumDigit
{
    public static int  minimumDigit(int n)
    { 
        int min=10;
        while(n!=0)
        {
            int last = n%10;
            if(last < min)
            {
                min = last;
            }
            n/=10;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int min = minimumDigit(n);

        System.out.println("Maximum digit of "+n+" is : "+min);
    }
}
