/*An anagram is a word or a phrase that can be created by rearranging the letters of another
given word or phrase. We ignore white spaces and letter case. The all letters of "Desperation"
can be rearranged to the phrase "A Rope Ends It".
Implement a Java program that checks the given Strings to determine whether
one is an anagram of the other.
*/

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Desperation";
        String s2 = "A Rope Ends It";

        String result = stringsAreAnagrams(s1,s2)? "is an anagram of" : "is not an anagram of";

        System.out.println("\"" + s1 + "\" " + result + " \"" + s2 + "\"");
    }

    public static boolean stringsAreAnagrams(String s1, String s2) {
        char[] a1 = s1.replaceAll("\\s+","").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s+","").toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);
    }
}
