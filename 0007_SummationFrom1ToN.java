// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/G


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SummationFrom1ToN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        
        System.out.println((n * (n + 1)) / 2);
        
        br.close();
    }
}