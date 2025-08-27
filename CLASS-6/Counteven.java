
import java.util.Scanner;

class CountEven
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int st = 1, evenCount = 0;
        int n = s.nextInt();
        while (st <= n)
        {
            if (st % 2 == 0) {
                evenCount++;
            }
            st++;
        }
        System.out.println("Number of even numbers from 1 to " + n + " is: " + evenCount); 
    }
}