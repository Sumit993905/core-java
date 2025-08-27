
import java.util.Scanner;

class HarsadNumber2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt(), sum = 0, temp = n;
        while (temp != 0) {
            int last = temp % 10;
            sum += last;
            temp /= 10;
        }

        System.out.println(n%sum==0 ? n + " is HarsadNumber" : n + " is not HarsadNumber");
    }
}
