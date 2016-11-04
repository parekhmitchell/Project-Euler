import java.util.ArrayList;

/**
 * Created by Mitchell Parekh on 11/4/2016.
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem05 {
    public static void main(String[] args) {
        long sol = solution(20);
        System.out.println("The smallest positive number that is evenly divisible by " +
                "all of the numbers from 1 to 20 is: " + sol + ".");
    }

    public static long solution(int n) {
        long high = 1;
        for(long i = n; i >= 1; i--)
            high *= i;

        ArrayList<Long> al = new ArrayList<Long>();
        al.add(high);

        for(long i = high; high >= 2; high--) {
            boolean check = true;
            for(long j = n; j >= 1; j--) {
                if(i % j == 0 && j == 1 && check)
                    //System.out.println(i);
                    al.add(i);
                else if(i % j != 0)
                    check = false;
            }
        }

        long minnie = al.get(0);
        for(long i : al)
            if(i <= minnie)
                minnie = i;

        return minnie;
    }

}
