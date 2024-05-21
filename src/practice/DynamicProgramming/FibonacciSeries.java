package practice.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

    public static long fibonacciNumberWithMemoization(long n, Map<Long, Long> map){
        if(map.containsKey(n))
            return map.get(n);
        if (n <= 1) return 1;
        long temp = fibonacciNumberWithMemoization(n-1, map) + fibonacciNumberWithMemoization(n-2, map);
        map.put(n, temp);
        return temp;
    }

    public static long fibonacciNumberWithTabulation(int n) {
        long[] table = new long[n+1];
        for(int i=0;i<n; i++)
            table[i] = 0;
        table[0] = 1;
        table[1] = 1;
        for (int i = 2; i<=n; i++){
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }

    public static void main(String[] args) {
//        System.out.println(fibonacciNumberWithMemoization(10, new HashMap<Long, Long>()));
        System.out.println(fibonacciNumberWithMemoization(50, new HashMap<Long, Long>()));

        System.out.println(fibonacciNumberWithTabulation(10));
        System.out.println(fibonacciNumberWithTabulation(50));
    }
}
