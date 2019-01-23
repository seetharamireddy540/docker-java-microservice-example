package com.ram.problemsolving;

import java.util.HashSet;

/**
 * Find a longest word in a dictionary that is a subsequencec of given string.
 *
 * Given a String S and a set of words D, find the longest word in D, that is a subsequence of S.
 *
 * Word W is a subsequence of S if some number characters, possibly zero can be deleted from S  to form
 * W without reordering the remaining characters.
 */
public class LongestWordInString {

    public static void main(String arg[]) {
        String s = "abcd";
        subsequence(s);
        System.out.println(st);

    }

    // set to store all the subsequences
    static HashSet<String> st = new HashSet<>();

    // It computes all the subsequence of an string
    static void subsequence(String str)
    {
        // iterate over the entire string
        for (int i = 0; i < str.length(); i++) {

            // iterate from the end of the string
            // to generate substrings
            for (int j = str.length(); j > i; j--) {
                String sub_str = str.substring(i, j);

                if (!st.contains(sub_str))
                    st.add(sub_str);

                // drop kth character in the substring
                // and if its not in the set then recur
                for (int k = 1; k < sub_str.length() - 1; k++) {
                    StringBuffer sb = new StringBuffer(sub_str);

                    // drop character from the string
                    sb.deleteCharAt(k);
                    if (!st.contains(sb))
                        ;
                    subsequence(sb.toString());
                }
            }
        }
    }
}
