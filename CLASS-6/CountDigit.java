import java.util.Scanner;
class CountDigit
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt() , count =0 , temp=n;
        while(temp !=0)
        {
           count++;
           temp/=10;

        }
        System.out.println("Count of digit of "+ n + " is : " + count);
    }
}