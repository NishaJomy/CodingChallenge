public class VowelConsonant {
    public static void checkVowel(char ch){
        String str = "aeiouAEIOU";
        if(str.indexOf(ch) != -1){
            System.out.println("The character is a vowel.");
        }
        else{
            System.out.println("The character is a consonant.");
        }
    }

    public static void main(String[] args) {
        checkVowel('i');
    }
}
