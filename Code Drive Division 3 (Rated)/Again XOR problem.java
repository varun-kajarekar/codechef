import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.time.Period;
import java.io.*;

class Codechef
{   
    static FastReader vk = new FastReader();

    
    public static void solve(int t){
        while(t-->0){
            int n = vk.nextInt() , k = vk.nextInt();
            String v = vk.nextLine();
            char[] a = v.toCharArray();
            int ans = 0;
            int x= a[0] - '0';
            for(int i=1;i<=n-k;i++){
                x^= (a[i] - '0' );
            }
            if(x == 1) ans++;
            for (int i = n-k+1; i < n; i++) {
                x^=(a[i-n+k-1] - '0');
                x^=(a[i] - '0');
                if(x == 1) ans++;
            }
            System.out.println(ans);
        }
    }


















    public static void main (String[] args) throws java.lang.Exception
	{
		
        int t =vk.nextInt();
        solve(t);
        // // System.out.println();
        
        
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
