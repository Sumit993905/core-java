class Narrowing1
{
     public static void main(String[] args) 
        {
           byte b = 65;
           char c = (char) b;

           System.out.println("b is : " + b);
           System.out.println("c is : " + c);
          
        }
}