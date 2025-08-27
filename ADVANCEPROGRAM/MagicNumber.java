
import java.util.Scanner;

class MagicNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt(), sum = 0;
       for(int i=1 ; i<n ;i++)
       {
            if(n%i==0)
            {
                sum+=i;
            }
       }

        System.out.println(n%sum==0? n + " is MagicNumber" : n + " is not MagicNumber");
    }
}
