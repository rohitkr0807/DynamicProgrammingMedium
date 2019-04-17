package Medium;
/*
Given two numbers, n >= 0 and 0 <= k <= n, count the number of derangements with k fixed points.

Examples:

Input : n = 3, k = 0
Output : 2
Since k = 0, no point needs to be on its
original position. So derangements
are {3, 1, 2} and {2, 3, 1}

Input : n = 3, k = 1
Output : 3
Since k = 1, one point needs to be on its
original position. So partial derangements
are {1, 3, 2}, {3, 2, 1} and {2, 1, 3}

 */
public class ReContres {
    public static void main(String[] args) {
        System.out.println(reContres(7,2));
    }
    public static int reContres(int n,int k)
    {
        if(n==0 && k==0)
            return 1;
        if(n==1 && k==0)
            return 0;
        if(k==0)
        {
            return (n-1)*(reContres(n-1,0)+reContres(n-2,0));
        }
        return binomial(n,k)*reContres(n-k,0);

//        return 0;
    }
    public static int binomial(int n,int r)
    {
        int ans[][]= new int[n+1][r+1];
//        ans[n][1]=n;
//        ans[n][n]=1;
//        ans[n][0]=1;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=Math.min(i,r) ; j++) {
                if(j==i || j==0)
                {
                    ans[i][j]=1;
                }
                else
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
        }

        return ans[n][r];
    }
}
