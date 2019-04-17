package Medium;
/*
Jacobsthal and Jacobsthal-Lucas numbers
The Jacobsthal sequence is an additive sequence similar to the Fibonacci sequence, defined by the recurrence relation Jn = Jn-1 + Jn-2, with initial terms J0 = 0 and J1 = 1. A number in the sequence is called a Jacobsthal number. They are a specific type of Lucas sequence Un(P, Q) for which P = -1 and Q = -2.
The first Jacobsthal numbers are:
0, 1, 1, 3, 5, 11, 21, 43, 85, 171, 341, 683, 1365, 2731, 5461, 10923, 21845, 43691, ……

Jacobsthal numbers are defined by the recurrence relation:
{\displaystyle J_{n}=\left\{\begin{matrix} 0   &   &  if n=0\\1&&ifn=1  \\ J_{n-1} + 2J_{n-2}&&ifn>1  \end{matrix}\right.}

Jacobsthal-Lucas numbers
Jacobsthal-Lucas numbers represent the complementary Lucas sequence Vn(1, -2). They satisfy the same recurrence relation as Jacobsthal numbers but have different initial values:{\displaystyle L_{n}=\left\{\begin{matrix} 2   &   &  if n=0\\1&&ifn=1  \\ L_{n-1} + 2L_{n-2}&&ifn>1  \end{matrix}\right.}

Given a positive integer n. The task is to find nth Jacobsthal and Jacobsthal-Lucas numbers.
 */
public class Jacobsthal {
    public static void main(String[] args) {
        System.out.println(jacobfib(5));
    }
    public static int jacobfib(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return jacobfib(n-1)+2*jacobfib(n-2);
    }

}
