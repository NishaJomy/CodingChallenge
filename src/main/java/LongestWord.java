import java.util.Scanner;

public class LongestWord {

        String LongestWord(String sen) {
            String[] senArray = sen.split("[^A-Za-z0-9]");

            int longestIndex = 0;
            String longestWord = "";

            for (int i = 0; i < senArray.length; i++) {
                //System.out.println(senArray[i]);
                if (senArray[i].length() > longestIndex) {
                    longestWord = senArray[i];
                    longestIndex = senArray[i].length();
                }
            }
            return longestWord;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            LongestWord c = new LongestWord();
            System.out.print(c.LongestWord(s.nextLine()));
        }

    }

