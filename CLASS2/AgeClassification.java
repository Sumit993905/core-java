import java.util.Scanner;

class AgeClassification
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        if(age<13) 
          System.out.println("child");
        else if(age>=13 && age<=19)
          System.out.println("Teenager");
        else if(age>=20 && age<=59)
          System.out.println("Adult");
        else
          System.out.println("senior citizen");
    }
}