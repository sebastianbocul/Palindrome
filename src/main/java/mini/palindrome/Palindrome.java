package mini.palindrome;

public class Palindrome {
    public static void main(String[] args) {

        String word = "madadm";
        System.out.println("Is word '"+word +"' a palindrome? " + IfPalindrome(word));


    }



    public static boolean IfPalindrome(String word){
        if(word == "" || word==null) return false;
        boolean isPalindrome = true;
        int length;
        length = word.length();
        char[] wordchar = word.toCharArray();

        for(int i =0;i<length/2;i++){
            if(wordchar[i]!=wordchar[length-i-1]) isPalindrome=false;
        }

        return isPalindrome;
    }
}
