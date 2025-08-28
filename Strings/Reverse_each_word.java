package Strings;

import java.util.*;

public class Reverse_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String rev = "";
        
        int i = 0;
        int j = 0;
        int n = s.length();
        
        while (j < n) {
            while (i < n && s.charAt(i) == ' ') {
                rev += ' ';
                i++;
                j = i;
            }
            
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }
            
            String word = "";
            for (int k = j - 1; k >= i; k--) {
                word += s.charAt(k);
            }
            rev += word;
            
            i = j;
        }
        
        System.out.println(rev);
        sc.close();
    }
}