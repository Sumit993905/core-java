import java.util.Scanner;

class TicketPrice
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Age");
        int age = s.nextInt();

        System.out.println("Enter the time between(1-24)");
        int time = s.nextInt();

        if(age < 12 )
        {
            System.out.println("Ticket price is 50rs");
        }
        else if(age>=12 && age<=60)
        {
            if(time < 17)
              System.out.println("Ticket price is 100rs");
            else 
              System.out.println("Ticket price is 120rs");
        }
        else
           System.out.println("Ticket price is 125rs");

    }
}
