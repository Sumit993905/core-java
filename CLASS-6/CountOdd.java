
import java.util.Scanner;


class CountOdd 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int st = 1 , n = s.nextInt() , oddCount =0;
        while(st<=n)
        {
            if(st % 2 != 0)
              oddCount++;
            st++;
        }
        System.out.println("Count of odd number is:" + oddCount);

    }

    
}