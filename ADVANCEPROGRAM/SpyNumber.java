
import java.util.Scanner;

class SpyNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt(), sum = 0, prod = 1, temp = n;
        while (temp != 0) {
            int last = temp % 10;
            sum += last;
            prod *= last;
            temp /= 10;
        }

        System.out.println(sum == prod ? n + " is spyno" : n + " is not spyno");
    }
}
