import java.sql.SQLOutput;

public class LongestWord2 {
    public static void  findLongestWord(){
        String word = "";
        String longestWord = "";
        String str = "My name is Nisha";
        str+=" ";

     for(int i=0; i<str.length();i++){
         char ch = str.charAt(i);
         if(ch != ' '){
             word += ch;
         }else {
             if(word.length()>longestWord.length()){
                 longestWord =word;
             }
             word="";
         }
     }
        System.out.println("the longest word is "+longestWord);
    }

    public static void main(String[] args) {
        findLongestWord();
    }
}
