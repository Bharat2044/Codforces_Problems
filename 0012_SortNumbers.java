// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/T


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SortNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        
        int x = Math.min(a, (Math.min(b, c)));
        int y = Math.max(a, (Math.max(b, c)));
        int z = (a + b + c) - (x + y);
        
        System.out.println(x + "\n" + z + "\n" + y + "\n");
        System.out.println(a + "\n" + b + "\n" + c);
        
        br.close();
    }
}