// Question Link: https://codeforces.com/problemset/problem/4/A


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Watermelon {
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int w = Integer.parseInt(br.readLine());
        
        if((w > 2) && (w % 2 == 0))    
            System.out.println("YES");
        else
            System.out.println("NO");
        
        
        br.close();
    }
}