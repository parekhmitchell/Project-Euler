/**
 * Created by Mitchell Parekh on 11/14/2016.
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 *
 * What is the 10,001st prime number?
 */
public class Problem07 {
    public static void main(String[] args) {
        int n = 10001;
        int guess = 2;
        while(n >= 1) {
        	if(isPrime(guess)) {
				n--;
			}
        	guess++;
        }
        System.out.println("The 10,001st prime number is: " + (guess - 1) + ".");
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
