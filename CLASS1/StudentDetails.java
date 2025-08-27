import java.util.Scanner;
class StudentDetails
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student details : ");

        System.out.println("Enter Student Id: ");
        int id = s.nextInt();
        System.out.println("Enter Student Name: ");
        String name = s.next();
        System.out.println("Enter Student Age: ");
        int age = s.nextInt();
        System.out.println("Enter Student Weight: ");
        double weight = s.nextDouble();
        System.out.println("Enter Student Gender: ");
        char gender = s.next().charAt(0);

        System.out.println("------");
        System.out.println("------");


        System.out.println("Student Details are : ");
        System.out.println("Id is : " + id);
        System.out.println("Name is : " + name);    
        System.out.println("Age is : " + age);
        System.out.println("Weight is : " + weight);
        System.out.println("Gender is : " +gender);


    }
}