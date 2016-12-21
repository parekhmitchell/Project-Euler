import java.util.*;
/**
 * Created by parekhmitchell on 11/17/16.
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 *
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */
public class Problem08 {
    public static void main(String[] args) {
        String pfile = "~/Desktop/Research/Stuff/Project-Euler/data/p08.txt";
        File file = new File(pfile);
        Scanner input = new Scanner(file);

        file.getParentFile().mkdirs();
        try
        {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println ("hello");
            printWriter.close();
        }
        catch (FileNotFoundException ex)
        {

            // insert code to run when exception occurs
        }

        while(input.hasNext()) {
        	System.out.print(input.nextInt());
        }
        //System.out.println("The value of this product is: " + "" + ".");
    }
}
