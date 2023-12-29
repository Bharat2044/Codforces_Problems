// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/C


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        long b = Long.parseLong(str[1]);
        
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " - " + b + " = " + (a - b));
        
        br.close();
    }
}
