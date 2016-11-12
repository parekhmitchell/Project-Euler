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
        int guess = 1;
        boolean flag = true;

        while(flag) {
            for (int i = 1; i < 21; i++) {
                if (guess % i != 0)
                    break;
                else if (i == 20)
                    return guess;
            }
            guess++;
        }
        //error if returned
        return -1;
    }

}
