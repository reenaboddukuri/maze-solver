package recursion;

public class FactorialGenerator {
    public double nthFactorial(int n){
        return computeFactorialRecurse(n);
    }

    private double computeFactorialRecurse(int n){
        assert n >= 0 : "AssertionError";
        if (n!=0)
			return n * computeFactorialRecurse(n - 1);
		else
			return 1;

    }

    public static void main(String[] args) {
        FactorialGenerator instance = new FactorialGenerator();
        
        /*for (int i = 1; i <= 32; i++){
            System.out.println(i+" " +instance.nthFactorial(i));

        }*/
        instance.nthFactorial(-1);
    }
}
