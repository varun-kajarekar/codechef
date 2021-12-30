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
            int a = vk.nextInt();
            int b = vk.nextInt();
            int c = vk.nextInt();
            int d = vk.nextInt();
            if(a>=b) b+= c;
            else a+= c;
            if(a>=b) b+=d;
            else a+=d;


            if(a>=b) System.out.println("N");
            else System.out.println("S");
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
