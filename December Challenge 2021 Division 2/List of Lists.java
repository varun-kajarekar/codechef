

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    public static void main (String[] args) throws java.lang.Exception
	{
		FastReader vk = new FastReader();
        int t =vk.nextInt();
        while(t-->0) {
            int n =vk.nextInt();
            int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] =vk.nextInt();
        }
        int max = 1;
        int b = 1;
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            if(a[i] == a[i-1]){
                b++;
                max = Math.max(max, b);
            }
            else{
                b = 1;
            }
        }
        if(n==max){
            System.out.println("0");
            continue;
        }
        if(max==1){
            System.out.println("-1");
            continue;
        }
        System.out.println((n-max)+1);
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
