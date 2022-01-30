Input Format

A single double-precision number denoting payment.

Output Format

On the first line, print US: u where u is payment formatted for US currency.
On the second line, print India: i where i is payment formatted for Indian currency.
On the third line, print China: c where c is payment formatted for Chinese currency.
On the fourth line, print France: f, where f is payment formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale in = new Locale("en","in");
        String us = String.valueOf(NumberFormat.getCurrencyInstance(Locale.US).format(payment)); 
        String india = String.valueOf(NumberFormat.getCurrencyInstance(in).format(payment));
        String china = String.valueOf(NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        String france = String.valueOf(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
