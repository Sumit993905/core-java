
import java.util.Scanner;
class OnlineStore
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println(" Are you a Premium member (yes or no)");
        String isPremium = s.next();
       
        System.out.println("Enter your Total bill : ");
        double totalBill = s.nextDouble();
        if(totalBill > 5000)
            {
                if(isPremium.equals("yes"))
                    {
                      
                        totalBill -= (totalBill*20/100);
                        System.out.println("Hurray ! you got 20% discount");
                        System.out.println("your Bill is : "+totalBill);
                    
                    }
                else
                {
                     totalBill -= (totalBill*10/100);
                     System.out.println("Yeah! you got 10% discount");
                     System.out.println("Your bill is : " + totalBill);
                }
            }
        else
        {

            if(isPremium.equals("yes"))
                {
                    System.out.println("You got free shipping");
                }
            else
            {
                 System.out.println("Sorry you didn't ger free shipping");
            }
        }
            
       
    }
}