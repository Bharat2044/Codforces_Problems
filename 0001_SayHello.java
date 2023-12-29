// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/A


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SayHello {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name = br.readLine();
        
        System.out.println("Hello, " + name);
        
        br.close();
    }
}
