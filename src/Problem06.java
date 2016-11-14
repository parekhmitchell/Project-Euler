/**
 * Created by Mitchell Parekh on 11/13/2016.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem06 {
    public static void main(String[] args) {
        long sol = solution(100);
        System.out.println("The difference between the sum of the squares of" +
        	"the first one hundred natural numbers and the square of the sum is: " + sol + ".");
    }

    public static long solution(int n) {
    	long sqsum = 0;
    	long sumsq = 0;
    	for(int i = 1; i <= n; i++) {
    		sqsum += i;
    		sumsq += (long)Math.pow(i, 2);
    	}

    	sqsum = (long)Math.pow(sqsum, 2);

    	return sqsum - sumsq;
    }
}