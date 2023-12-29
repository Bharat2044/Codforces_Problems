// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/N


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Char {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char ch = br.readLine().charAt(0);
        
        if(ch >= 'A' && ch <= 'Z')
            System.out.println((char)(ch + 32));
        else
            System.out.println((char)(ch - 32));
        
        br.close();
    }
}