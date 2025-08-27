class Test3
{
    static int a;
    static 
    {
        System.out.println("SIB1-TEST3");
        a= demo(20);
    }

    public static int demo(int a)
    {
        return a+a;
    }
}