class AdjacentProduct
{
    public static void main(String[] args) {
        int n = 1235 , sum=0;
        while(n!=0)
        {
            int last = n%10;
            int sLast = (n/10)%10;
            sum+=(last*sLast); 
            n/=10;    
        }

        System.out.println("Sum is :"+sum);
    }
}