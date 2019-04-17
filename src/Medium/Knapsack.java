package Medium;
/*
0-1 Knapsack Problem | DP-10
Given weights and values of n items, \
put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively.
Also given an integer W which represents knapsack capacity,
find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

 */
public class Knapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        int n=val.length;
        System.out.println(knapsack01(weight,W,val,n));
        System.out.println(KnapSackBetter(weight,W,val,n));
    }
    public static int knapsack01(int Wt[],int W,int val[],int n)
    {
        if(n==0 || W==0)
            return 0;


        if(Wt[n-1]>W)
            return knapsack01(Wt,W,val,n-1);

       else return Math.max(val[n-1]+knapsack01(Wt,W-Wt[n-1],val,n-1),knapsack01(Wt,W,val,n-1));

    }
    public static int KnapSackBetter(int Wt[],int W, int val[],int n)
    {
        int ans[][]=new int[n+1][W+1];

        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=W ; j++) {

                if(i==0 ||j==0)
                    ans[i][j]=0;
               else if(Wt[i-1]<=j)
                    ans[i][j]=Math.max(val[i-1]+ans[i-1][j-Wt[i-1]],ans[i-1][j]);
                else
                    ans[i][j]=ans[i-1][j];
            }
        }
        
        return ans[n][W];
    }
}
