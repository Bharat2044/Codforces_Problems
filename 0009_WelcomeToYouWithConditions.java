// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/I


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WelcomeToYouWithConditions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
        if(a >= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        br.close();
    }
}