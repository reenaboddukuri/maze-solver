package recursion;

import  java.util.logging.*;;

public class FibGenerator {
    private int[] callCounter;
    //private static int[] knownFibonacciValues;

    public int nthFib(int n){
        callCounter = new int[n+1];
        int fib = computeFibRecurse(n);
        return fib;
    }

    private int computeFibRecurse(int n){

        Logger.getGlobal().info("Entering fib. n=" + n);
        callCounter[n]++;

        /*if (knownFibonacciValues[n] != 0){
            return knownFibonacciValues[n];
        }*/
        //else{
            if(n <= 2){
                Logger.getGlobal().info("Exiting fib. return=" + 1);
                //return knownFibonacciValues[n] = 1;
                return 1;
            }
            else{
                int first = computeFibRecurse(n-1);
                int second = computeFibRecurse(n-2);
                int result = first + second;
                Logger.getGlobal().info("Exiting fib. return=" + result);
                //return knownFibonacciValues[n] = result;
                return result;
            }
        //}
    }

    private void printCallCounter(){
		for (int i=0; i<callCounter.length; i++){
			System.out.println(callCounter[i] + " calls to fib(" + i + ")");
        }
    }

    public static void main(String[] args) {
        Logger.getGlobal().setLevel(Level.OFF); 
        System.out.println("STARTING");
		FibGenerator gen = new FibGenerator();
		
        for(int i = 1; i <=20; i++)
		{
			System.out.println("fib(" + i + ") = " + gen.nthFib(i));
		}
        gen.printCallCounter();
    }
}