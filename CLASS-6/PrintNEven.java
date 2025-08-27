
import java.util.Scanner;

class PrintNEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n value where you start the even number");
        int n = s.nextInt();
        System.out.println("Enter how many even number you want ");
        int evenCount = s.nextInt();

        while (evenCount != 0) 
        {
          
            if (n % 2 == 0) {
                System.out.println(n);
                evenCount--;
            }
            n++;
        }
    }
}