import java.util.Scanner;
class GreatestTwoDigit
{
    public static int  greatestTwoDigitDigit(int n)
    { 
        int max=-1;
        while(n!=0)
        {
            int last = n%100;
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
        int max =  greatestTwoDigitDigit(n);

        System.out.println("Maximum digit of "+n+" is : "+max);
    }
}
