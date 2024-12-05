import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First string: ");
        String str1 = scanner.nextLine();//"Listen";
        
        System.out.println("Enter Second string: ");
        String str2 = scanner.nextLine(); //"Silent";
        
        
        if (areAnagrams(str1, str2)) {
            System.out.println("\n\n Yes This strings are Anagram");
        } else {
            System.out.println("\n\n No This strings are not Anagram");
        }
    }

   
    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

       
        return Arrays.equals(str1Array, str2Array);
    }
}

