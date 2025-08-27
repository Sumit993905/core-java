class Widening
{
    public static void main(String[] args) {
        {
            byte b = 26;
            short s = b;
            int i = b;
            long l = b;
            float f = b;
            double d = b;
            System.out.println("b is:"+b);
            System.out.println("s is :"+s);
            System.out.println("i is :"+i);
            System.out.println("l is :"+l);
            System.out.println("f is :"+f);
            System.out.println("d is :"+d);
            
        }
    }
}