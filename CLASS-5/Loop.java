import java.util.Scanner;

class Loop{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N values");
        int start = 1 , end = s.nextInt();

        while(start<=end)
        {
            System.out.println(start);
            start++;
        }
        
    }
}