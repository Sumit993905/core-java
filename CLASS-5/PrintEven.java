import java.util.Scanner;

class PrintEven
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        int start = 1 , end = s.nextInt();
        while(start <= end)
        {
            if(start % 2== 0)
            {
                System.out.println(start);
            }
            start++;
        }
    }
}