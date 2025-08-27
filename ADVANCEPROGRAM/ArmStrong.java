import java.util.Scanner;
class ArmStrong
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt() , count=0 , sum=0;
        for(int temp=n ; temp!=0 ; temp/=10)
        {
            count++;
        }

        for(int temp=n ; temp!=0 ; temp/=10)
        {
            int last = temp%10 , pow=1;
            for(int i=1;i<=count;i++)
            {
                pow = pow*last;
            }
            sum+=pow;
        }
        System.out.println(sum == n ? n+" is ArmStrong" : n+" is not ArmStrong");
    }
}