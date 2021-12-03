import java.util.*;

import javax.swing.plaf.synth.SynthButtonUI;

import java.lang.*;
import java.time.Period;
import java.io.*;

class Codechef
{
    public static int add(int n){
        int out = n;
        while(n!=0){
            out = out+n-1;
            n--;
        }
        return out;
        
    }

    public static void solve(int a , int b){
        int out = a;
        while(b>0){
            out = add(out);
            b--;
        }
        System.out.println(out); 
    }


    
    public static void main (String[] args) throws java.lang.Exception
	{
		FastReader vk = new FastReader();
        int t =vk.nextInt();
        while(t-->0) {
            int b =vk.nextInt();
            int a =vk.nextInt();
            solve(a, b);
        }
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
