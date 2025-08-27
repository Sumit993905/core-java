import java.util.Scanner;
class Vowels
{
    public static void countVowels(char ch)
    { 
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a character:");
       char ch = sc.next().charAt(0);
       countVowels(ch);
   }
}

       