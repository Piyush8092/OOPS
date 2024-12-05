import java.util.HashMap;

public class Program2 {
    public static void main(String[] args) {
        // Sample input
        String str = "102100211";
        
        System.out.println("\n Total substring: " + countEqual012Substrings(str));
    }


    public static int countEqual012Substrings(String str) {
        int countSubstrings = 0;
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            int count0 = 0, count1 = 0, count2 = 0;
            for (int j = i; j < n; j++) {
                // Update counts based on the current character
                if (str.charAt(j) == '0') {
                    count0++;
                } else if (str.charAt(j) == '1') {
                    count1++;
                } else if (str.charAt(j) == '2') {
                    count2++;
                }
                
                
                if (count0 == count1 && count1 == count2) {
                if(count0 != 0){
                  System.out.println("Substrings are: " + str.substring(i,j+1));
                }
                    countSubstrings++;
                }
            }
        }
        
        return countSubstrings;
    }
}

