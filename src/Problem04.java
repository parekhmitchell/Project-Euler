import java.util.ArrayList;

/**
 * Created by Mitchell Parekh on 11/4/2016.
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem04 {
    public static void main(String[] args) {
        int sol = solution();
        System.out.println("The largest palindrome made from the product of two 3-digit numbers: " + sol + ".");
    }

    public static int solution() {
        int a;
        int b;
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(a = 999; a >= 100; a--) {
            for(b = 999; b >= 100; b--) {
                String c = "" + a*b;
                StringBuilder sb = new StringBuilder();
                sb.append("" + a*b);
                if(c.equals(sb.reverse().toString())) {
                    al.add(a*b);
                }
            }
        }
        int max = al.get(0);
        for(int i : al)
            if(i >= max)
                max = i;

        return max;
    }

}
