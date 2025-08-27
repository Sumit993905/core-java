import java.util.Scanner;
class LastDigit
{
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter n values");
      int n = s.nextInt();
      while(n != 0)
      {
        int last = n%10;
        System.out.println(last);
        n/=10;
      }
    }
}