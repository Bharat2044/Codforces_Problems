// Question Link: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/B


// TC = O(1), SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BasicDataTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        long b = Long.parseLong(str[1]);
        char c = str[2].charAt(0);
        float d = Float.parseFloat(str[3]);
        double e = Double.parseDouble(str[4]);
        
        System.out.println(a + "\n" + b+ "\n"+ c + "\n" + d + "\n" + e);
        
        br.close();
    }
}
