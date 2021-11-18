// Problem Code: NEWPIECE


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
            int A =vk.nextInt();
            int B =vk.nextInt();
            int C =vk.nextInt();
            int D =vk.nextInt();
            if (B==D&&A==C) {
                System.out.println("0");
            }
            else if ((A+B)%2!=(C+D)%2) {
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }
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
