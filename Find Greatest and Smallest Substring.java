import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int k = input.nextInt();
        
        input.close();
        
        List<String> strings = new ArrayList<>();
        //Divide s into substrings of size k
        //compare their lixcorpgaical orders
        //return smallest amd largest
        for(int i = 0; i < s.length() + 1 - k; i++)
        {
            strings.add(s.substring(i, i + k));
        }
        
        Collections.sort(strings);
        
        
        System.out.println(strings.get(0));
        System.out.println(strings.get(strings.size()-1));
    }
}