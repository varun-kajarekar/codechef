//  Problem Code:CODVINDSEMI

import java.util.*;

import javax.swing.plaf.synth.SynthButtonUI;

import java.lang.*;
import java.io.*;

class Codechef
{
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


    public static void solve(int x , int y,int z){
        int out = z*2;
        int rem = y-x;
        if(out>=rem){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main (String[] args) throws java.lang.Exception
	{
		FastReader vk = new FastReader();
        int t =vk.nextInt();
        while(t-->0) {
            int a = vk.nextInt();
            int b = vk.nextInt();
            int c = vk.nextInt();
            solve(a,b,c);
        }
        
	}
}
