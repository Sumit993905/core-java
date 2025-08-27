class Sample
{
    static int a;
    static int b;

    static
    {
        System.out.println(a);
        int a=5;
        b=a;
    }
    public static void main(String[] args) 
    {
        System.out.println(a);
        System.out.println(b);   
    }
    static {
        System.out.println(b);
        int b=9;
        System.out.println(a);
        a=b;
    }
}