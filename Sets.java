import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        Set<String> pairs = new HashSet<>();
        int count = 0;
        //Write your code here
        for(int i = 0; i < pair_left.length; i++)
        {
            String full = "";
            if(pair_left[i].hashCode() > pair_right[i].hashCode())
                full = pair_left[i] + "SIGMA" + pair_right[i];
            else
                full = pair_right[i] + "SIGMA" + pair_left[i];
                
            if(pairs.contains(full))
            {
                count = count;
            }
            else
            {
                count++;
                pairs.add(full);
            }
            System.out.println(count);
        }

   }
}