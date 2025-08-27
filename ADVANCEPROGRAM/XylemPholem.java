import java.util.Scanner;
class XylemPholem
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt(),eSum=0,mSum=0;
        for(int temp= n ; temp!=0 ; temp/=10)
        {
            int last = temp%10;
            if(temp == n || temp<10)
            {
                eSum+=last;
            }
            else
            {
                mSum+=last;
            }
        }
        System.out.println(eSum == mSum ? n +" is Xylem" : n+ " is Phloem");

    }
}