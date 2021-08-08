import java.util.ArrayList;

public class FibonacciDynamic {

    // time complexity - O(2^n)
    //recursive solutıon
    public static int RecursiveFibonacci(int n) {
        if (n < 2)
            return n;
        return RecursiveFibonacci(n - 1) + RecursiveFibonacci(n - 2);
    }

    // time complexity - O(n)
    // space complexity - O(n)
    public static int MemorizationFibonacci(int n,int cache[]) {
        if (n < 2)
            return n;
        if (cache[n] != 0)
            return cache[n];
        return cache[n] = MemorizationFibonacci(n - 1,cache) + MemorizationFibonacci(n - 2,cache);
    }

    // Bottom up approach-time complexity - O(n)
    // space complexity - O(n)

    public static int BottomUpApproachFibonacci(int n) {
        int cache[] = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= n; i++)
            cache[i] = cache[i - 1] + cache[i - 2];

        return cache[n];
    }

    public static int MainFibonacci(int nb) {
        if(nb <= 2)
            return nb;
        ArrayList<Integer> FibonacciArray = new ArrayList<>();
        FibonacciArray.add(1);
        FibonacciArray.add(1);
        for(int i = 1; i < nb-1; i++) {
            FibonacciArray.add(FibonacciArray.get(i)+FibonacciArray.get(i-1));
        }
        return FibonacciArray.get(nb-1);
    }

    public static void main (String args[])  {
        int n = 20;

        long startTime = 0, finishTime = 0, executionTime = 0;

        startTime = System.nanoTime();
        System.out.println("MemorizationFibonacci :" + MemorizationFibonacci(n, new int[n+1]));
        finishTime = System.nanoTime();
        executionTime = finishTime - startTime;
        System.out.println("ExecutionTime for MemorationFibonacci :" + executionTime);

        System.out.println("\n");

        startTime = System.nanoTime();
        System.out.println("RecursiveFibonacci :" + RecursiveFibonacci(n));
        finishTime = System.nanoTime();
        executionTime = finishTime - startTime;
        System.out.println("ExecutionTime for RecursiveFibonacci :" + executionTime);

        System.out.println("\n");

        startTime = System.nanoTime();
        System.out.println("BottomUpApproachFibonacci :" + BottomUpApproachFibonacci(n));
        finishTime = System.nanoTime();
        executionTime = finishTime - startTime;
        System.out.println("ExecutionTime for BottomUpApproachFibonacci :" + executionTime);

        System.out.println("\n");

        startTime = System.nanoTime();
        System.out.println("MainFibonacci :" + MainFibonacci(n));
        finishTime = System.nanoTime();
        executionTime = finishTime - startTime;
        System.out.println("ExecutionTime for MainFibonacci :" + executionTime);

    }
}