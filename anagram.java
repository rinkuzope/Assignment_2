import java.util.*;

public class anagram {
    public static void main(String[] args) {
        System.out.println("== Check if two words are anagram (ง︡'-'︠)ง==");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second word:");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }

       }
}


