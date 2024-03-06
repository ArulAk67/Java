public class knapsack {
    public static int solve(int []price,int []weight,int wi,int ind)
    {
        int sum=0,nsum=0;
        if(ind==price.length)
            return 0;
        if(wi-weight[ind]>=0)
        {
            sum=price[ind]+solve(price,weight,wi-weight[ind],ind+1);

        }
            nsum=solve(price,weight,wi,ind+1);

        return Math.max(sum,nsum);
    }
    public static void main(String[] args) {
        int[] prices={60,20,10,50,40};
        int[] weight={4,5,1,2,3};
        int wi=8;
        int a=solve(prices,weight,wi,0);
        System.out.println(a);
    }
}
