// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/F


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DigitsSummation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        long n = Long.parseLong(str[0]);
        long m = Long.parseLong(str[1]);
        
        System.out.println((n % 10) + (m % 10));
        
        br.close();
    }
}