import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hello, World!!", 'l'));
        System.out.println(findWordPosition("Hello", "ello"));
        System.out.println(stringReverse("plant"));
        System.out.println(isPalindrome("eye"));
        System.out.println(guessWord("grape"));
    }
    // 2
    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
    // 3
    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }
    //4
    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    //5
    public static Boolean isPalindrome(String str) {
        String reversed = stringReverse(str);
        return reversed.equals(str);
    }
    //6
    public static String guessWord(String str) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int randomNumber = random.nextInt(words.length);
        StringBuilder result = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            if (words[randomNumber].equals(str)) {
                result = new StringBuilder(words[randomNumber]);
            } else {
                for (int i = 0; i <= 15; i++) {
                    if (i < str.length() && i < words[randomNumber].length() && str.charAt(i) == words[randomNumber].charAt(i)) {
                        result.append(str.charAt(i));
                    } else {
                        result.append("#");
                    }
                }
            }
        }
        return result.toString();
    }
}