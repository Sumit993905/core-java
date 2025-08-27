import java.util.Scanner;

class PrintEven_B
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        int start = s.nextInt() , end = 1;
        while(start >= end)
        {
            if(start % 2== 0)
            {
                System.out.println(start);
            }
            start--;
        }
    }
}