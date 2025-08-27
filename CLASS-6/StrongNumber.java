import java.util.Scanner;

class StrongNumber
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Digit");
        int n = s.nextInt() , sum = 0 ,temp=n;
        while(temp != 0)
        {
            int last = temp%10 ,fact=1 , st =1 ;
                while(st<=last)
                 {
                     fact*=st++;
                 } 

            sum +=fact;
            temp/=10;  
        }

        System.err.println(sum == n ? n+" is Strong number" : n+ " is not a Strong number");
    }
}