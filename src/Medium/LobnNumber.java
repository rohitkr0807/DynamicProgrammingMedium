package Medium;
/*Added By Rohit*/
/*
In combinatorial mathematics, the Lobb number Lm, n counts the number of ways that n + m open parentheses can be arranged to form the start of a valid sequence of balanced parentheses.
The Lobb number are parameterized by two non-negative integers m and n with n >= m >= 0. It can be obtained by:
 L_{m,n} = \frac{2\times m + 1}{m + n + 1}\binom{2\times n}{m + n}

Lobb Number is also used to count the number of ways in which n + m copies of the value +1 and n – m copies of the value -1 may be arranged into a sequence such that all of the partial sums of the sequence are non- negative.

 */
public class LobnNumber {
    public static void main(String[] args) {
//        System.out.println(binomial(4,3));
        System.out.println(LobbNumber(5,3));
    }
    public static int LobbNumber(int n,int m)
    {
        int binomial = binomial(2*n,m+n);
        int ans= binomial*(2*m+1)/(m+n+1);
//        System.out.println(ans);
        return ans;
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
