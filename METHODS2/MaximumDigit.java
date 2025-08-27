import java.util.Scanner;
class MaximumDigit
{
    public static int  maximumDigit(int n)
    { 
        int max=-1;
        while(n!=0)
        {
            int last = n%10;
            if(last > max)
            {
                max = last;
            }
            n/=10;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int max = maximumDigit(n);

        System.out.println("Maximum digit of "+n+" is : "+max);
    }
}
