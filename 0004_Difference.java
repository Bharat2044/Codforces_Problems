// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/D


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Difference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);
        long c = Long.parseLong(str[2]);
        long d = Long.parseLong(str[3]);
        
        System.out.println("Difference = " + ((a * b) - (c * d)));
        
        br.close();
    }
}
