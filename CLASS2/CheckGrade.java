import java.util.Scanner;

class CheckGrade
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your test score(0-100)");
        int score = s.nextInt();

    if(score>=90)
        System.out.println("Grade: A");

    else if(score>=80 && score<=89)
        System.out.println("Grade: B");
    else if(score>=70 && score<=79)
        System.out.println("Grade: C");
    else if(score>=60 && score<=69)
        System.out.println("Grade: D");
    else 
        System.out.println("Grade: F");
    
    }
}