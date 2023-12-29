// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/326907/problem/D


// Approach - 1: TC = O(t), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RangeSum {
  
    public static long sum(long n) {
        return (n * (n + 1) / 2) ;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");

            long l = Long.parseLong(str[0]);
            long r = Long.parseLong(str[1]);
            
            if(l > r) {
                long temp = l;
                l = r;
                r = temp;
            }
            
            long ans = sum(r) - sum(l-1);
            
            System.out.println(ans);
        }
        
        br.close();
    }
}