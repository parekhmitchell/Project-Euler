import java.io.File;
import java.util.Scanner;
/**
 * Created by parekhmitchell on 11/17/16.
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 *
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */
public class Problem08 {
    public static void main(String[] args) {
        String pfile = "data/p08.txt";
        File file = new File(pfile);
        Scanner input = new Scanner(file);
        while(input.hasNext()) {
        	System.out.print(input.nextInt());
        }
        //System.out.println("The value of this product is: " + "" + ".");
    }
}
