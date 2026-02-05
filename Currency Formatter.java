import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
        money.setRoundingMode(RoundingMode.HALF_UP);
        
        String us = money.format(payment);
        
        money = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        String india = money.format(payment);
        india =  "Rs." + india.substring(1);
        
        money = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = money.format(payment);
        
        money = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = money.format(payment);
        
        scanner.close();
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}