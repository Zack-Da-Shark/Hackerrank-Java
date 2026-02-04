import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

private static Scanner input = new Scanner(System.in);
public static int B = input.nextInt();
public static int H = input.nextInt();
public static boolean flag = (B > 0 && H > 0);
static{
    if(!flag){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        
    }//end of main

}//end of class

