import java.util.Scanner;
class CountEvenOddDigit
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n= s.nextInt() , evenCount = 0 , oddCount = 0 , temp =n;
        while(temp != 0)
        {
            int last = temp%10;

            if(last % 2 ==0 )
                evenCount++;
            else 
                oddCount++;
        }

        System.out.println("EvenCount is :" + evenCount);
        System.out.println("OddCount is :" + oddCount);
    }
}