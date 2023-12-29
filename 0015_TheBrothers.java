// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/L


// TC = O(max(s1.length(), s2.length()), SC = O(max(s1.length(), s2.length())
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TheBrothers {
  
    public static boolean areBrothers(String s1, String s2) {
        String ans1 = "", ans2 = "";
        
        for(int i=s1.length()-1; i>=0; i--) {
            if(s1.charAt(i) != ' ') 
                ans1 += s1.charAt(i);
            else
                break;
        }
        
        for(int i=s2.length()-1; i>=0; i--) {
            if(s2.charAt(i) != ' ') 
                ans2 += s2.charAt(i);
            else
                break;
        }
        
        return ans1.equals(ans2);
    }
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s1 = br.readLine();
        String s2 = br.readLine();
        
        if(areBrothers(s1, s2)) {
            System.out.println("ARE Brothers");
        }
        else {
            System.out.println("NOT");
        }
        
        
        br.close();
    }
}