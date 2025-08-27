import java.util.Scanner;
class SecondGreatest
{
    public static int  secondGreatestDigit(int n)
    { 
        int max1=-1 , max2=-1;
        while(n!=0)
        {
            int last = n%10;
            if(last > max1)
            {
                max2=max1;
                max1 = last;
            }
            else if(last> max2)
            {
                max2=last;
            }
            n/=10;
        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int secondMax = secondGreatestDigit(n);

        System.out.println(" second Maximum digit of "+n+" is : "+secondMax);
    }
}
