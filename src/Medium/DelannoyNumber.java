package Medium;
/*
In mathematics, a Delannoy number D describes the number of paths from the southwest corner (0, 0) of a rectangular grid to the northeast corner (m, n), using only single steps north, northeast, or east.
For Example, D(3, 3) equals 63.

Delannoy Number can be calculated by:

Delannoy number can be used to find:

Counts the number of global alignments of two sequences of lengths m and n.
Number of points in an m-dimensional integer lattice that are at most n steps from the origin.
In cellular automata, the number of cells in an m-dimensional von Neumann neighborhood of radius n.
Number of cells on a surface of an m-dimensional von Neumann neighborhood of radius n.
 */


public class DelannoyNumber {
    public static void main(String[] args) {
//        System.out.println(amount(45.88));
//        System.out.println(amount2(1050));
//        System.out.println(delannoyfib(3,3));
//        System.out.println(delannoy(3,4));

        System.out.println(facBetter(15));
        System.out.println(fac(15));
    }
    public static String amount(double amount)
    {
        StringBuilder sb = new StringBuilder();
        amount=(amount*100);
        sb.append((int)amount);
        String str=  "00000000"+sb.toString();
        return str;
    }
    public static String amount2(double amount)
    {
        int amountinPaise= (int)(amount*100);
        String formatted= String.format("%012d",amountinPaise);
        return formatted;
    }
    public static int delannoyfib(int m, int n)
    {
        if(m==0 ||n==0)
            return 1;

        return delannoyfib(m-1,n-1)+delannoyfib(m-1,n)+delannoyfib(m,n-1);
    }
    public static int delannoy(int m, int n)
    {
        int ans[][]= new int[m+1][n+1];
        for (int i = 0; i <=m ; i++) {
            ans[i][0]=1;
        }
        for (int i = 0; i <=n ; i++) {
            ans[0][i]=1;
        }
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j]+ans[i][j-1];
            }
        }


        return ans[m][n];
    }
    public static int fac(int n)
    {
        if(n==1)
            return 1;

        return fac(n-1)*n;
    }
    public static int facBetter(int n)
    {
        int fac[]= new int[n+1];
        fac[0]=0;
        fac[1]=1;
        for (int i = 2; i <=n ; i++) {
            fac[i]=i*fac[i-1];
        }

        return fac[n];
    }
}
