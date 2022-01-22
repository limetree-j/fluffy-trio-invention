import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution0207DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'pangrams' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String pangrams(String s) {
            Set<Character> alphabets = new HashSet<Character>();
            for (char c:s.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    alphabets.add(c);
                } else if (c >= 'A' && c <= 'Z') {
                    alphabets.add(Character.toLowerCase(c));
                }

            }

            if (alphabets.size() == 26) {
                return "pangram";
            } else {
                return "not pangram";
            }
        }

    }
}
