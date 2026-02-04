import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while(true)
        {
            String line = "";
            if(input.hasNext())
                line = input.nextLine();
            if(line.equals(""))
            {
                break;
            }
            System.out.println(counter + " " + line);
            counter++;
        }
    }
}