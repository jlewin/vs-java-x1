import java.util.Scanner;
/*
*   @input Read two strings (s1, s2) from System.in
*   @logic Evaluate if s2 is a substring of s1
*   @output "%s [is/is not] a substring of %s\n"
*   @author John Lewin
*   @date 20220624
*/
public class SubString {
    public static void main(String[] args) {
        // Init scanner object 
		Scanner in = new Scanner(System.in);

        // Prompt and collect
        System.out.print("Enter string s1: ");
        String s1 = in.nextLine();
        
        // Prompt and collect
        System.out.print("Enter string s2: ");
        String s2 = in.nextLine();

        // Output
        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s\n", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s\n", s2, s1);
        }
    }
}
