// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/O


// TC = O(1), SC = O(1)
import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] sum = input.split("(?=\\D)|(?<=\\D)");
        
        long num1 = Integer.parseInt(sum[0]);
        char s = sum[1].charAt(0);
        long num2 = Integer.parseInt(sum[2]);
        
        switch (s) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
        }
        
        sc.close();
    }
} 