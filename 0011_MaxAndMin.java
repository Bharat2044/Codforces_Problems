// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/K


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaxAndMin {
  
    public static int max(int a, int b, int c) {
        if(a >= b && a >= c)
            return a;
        else if(b >= c)
            return b;
        else
            return c;
    }
    
    public static int min(int a, int b, int c) {
        if(a <= b && a <= c)
            return a;
        else if(b <= c)
            return b;
        else
            return c;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        
        System.out.println(min(a, b, c) + " " + max(a, b, c));
        
        br.close();
    }
}