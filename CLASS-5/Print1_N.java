import java.util.Scanner;

class Print1_N
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n Value");
        int start= 1 , end = s.nextInt();
        while(start <= end)
        {
            System.out.println(s);
            start++;
        }
                          
    }
}