import java.util.Scanner;
class Sum 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = s.nextInt() , st = 1 , sum=0;
        while(st<=n){
            sum+=st;
            st++;

        } 
        System.out.println("Sum is : " + sum);
    }
}