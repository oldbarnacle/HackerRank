import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(count + " " + input);
            count++;
            
        }
    }
}
