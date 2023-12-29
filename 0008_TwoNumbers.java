// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/H


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
        System.out.println("floor " + a + " / " + b + " = " + ((int)Math.floor((double)a / b)));
        System.out.println("ceil " + a + " / " + b + " = " + ((int)Math.ceil((double)a / b)));
        System.out.println("round " + a + " / " + b + " = " + ((int)Math.round((double)a / b)));
        
        br.close();
    }
}