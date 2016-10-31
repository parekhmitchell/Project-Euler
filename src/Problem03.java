/**
 * Created by Mitchell Parekh on 10/31/2016.
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem03 {
    public static void main(String[] args) {
        long num = (long)(6008514.75143*100000);
        long sol = solution(num);
        System.out.println("The largest prime factor of the number 600851475143 is: " + sol + ".");
    }

    public static long solution(long num) {
        long i;
        for(i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                i--;
            }
        }
        return i;
    }

}