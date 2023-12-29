// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/E


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AreaOfCircle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double r = Double.parseDouble(br.readLine());
        final double PI = 3.141592653;
        
        System.out.printf("%.9f", (PI * r * r));
        
        br.close();
    }
}
