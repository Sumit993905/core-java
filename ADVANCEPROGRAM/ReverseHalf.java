import java.util.Scanner;
class ReverseHalf
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number For Half reverse");
        int n = s.nextInt();

        // This if-block handle the 2-digit number only 
        if(n<100)
        {
            int temp=n,rev=0;
            while(temp!=0)
            {
                rev = rev*10 +(temp%10);
                temp/=10;
            }
            System.out.println(" Half Reverse of the given number is : "+rev);
        }
        else // This will handle the Greater then 2-digit number
        {   
            int temp=n,count=0;
            while(temp!=0)
            {
                count++;
                temp/=10;
            }

            // find the pow number which is used for finding the first and last half
            int halfCount = count/2; 
            int pow=1 , temp1=halfCount;
            while(temp1!=0)
            {
                pow*=10;
                temp1--;
            }

            //find first half and second half of thr number
            int firstHalf=n/pow;
            int lastHalf = n%pow;
            int copyFirstHalf =  firstHalf;
            int copyLastHalf =  lastHalf;


            //reverse the first half  n=123456 fh=123  rfh = 321
            int revFirst=0;
            while(copyFirstHalf!=0)
            {
                revFirst= revFirst*10 + (copyFirstHalf%10);
                copyFirstHalf/=10;
            }

            // reverse the last half  n=123456 lh=456 rlh=654
            int revLast=0;
            while(copyLastHalf!=0)
            {
                revLast= revLast*10 + (copyLastHalf%10);
                copyLastHalf/=10;
            }

            // store the final value in result variable
            int res = (revFirst*pow)+revLast;
            System.out.println("Half Reverse  of the given Number is : "+res);

        }
    }
}