// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/M


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CapitalOrSmallOrDigit {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char ch = br.readLine().charAt(0);
        
        if(ch >= '0' && ch <= '9')
            System.out.println("IS DIGIT");
        else {
            System.out.println("ALPHA");
            
            if(ch >= 'A' && ch <= 'Z')
                System.out.println("IS CAPITAL");
            else
                System.out.println("IS SMALL");
        }
        
        br.close();
    }
}