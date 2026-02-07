import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reference = input.nextLine();
        String potential = input.nextLine();
        input.close();
        
        //Check if same size first
        if(reference.length() != potential.length())
            System.out.println("Not Anagrams");
        else
        {
            //Make sure they are the same capitalisation
            
            reference = reference.toLowerCase();
            potential = potential.toLowerCase();
            
            //Now have the string inputs, use a hash table
            
            Map<Character, Integer> frequency = new HashMap<>();
            
            for(int i = 0; i < reference.length(); i++)
            {
                //Idea, incrememnt if found in referebce, decremenet if found in potential
                char current = reference.charAt(i);
                char other = potential.charAt(i);
                if(frequency.containsKey(current))
                {
                    //Increment the value if found in reference
                    System.out.println("Found " + current + " again");
                    frequency.put(current, frequency.get(current)+1);
                }
                else
                {
                    //Add the character if not in table
                    System.out.println("Found " + current);
                    frequency.put(current, 1);
                }
                
                if(frequency.containsKey(other))
                {
                    //Decremenet the value if found in the potetnial
                    System.out.println("Found " + other + " in the potential again");
                    frequency.put(other, frequency.get(other)-1);
                }
                else
                {
                    //Add the character if not in table
                    System.out.println("Found " + other + " in the potential");
                    frequency.put(other, -1);
                }
                
                //Remove the value if it is 0 and in the map
                if(frequency.containsKey(current) && frequency.get(current) == 0)
                {
                    frequency.remove(current);
                    System.out.println("Removing " + current);
                }
                
                if(frequency.containsKey(other) && frequency.get(other) == 0)
                {
                    frequency.remove(other);
                    System.out.println("Removing " + other);
                }
            }
            //If it is an anagram, the map should be empty
            if(frequency.isEmpty())
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");
        }
    }
}