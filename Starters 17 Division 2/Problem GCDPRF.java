// Problem Code: GCDPRF
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader vk = new FastReader();

        int t =vk.nextInt();
        while(t-->0) {
           int n = vk.nextInt();
           ArrayList<Integer> arr = new ArrayList<>(n);
           for (int i=0;i<n;i++){
               arr.add(vk.nextInt());
           }
            boolean flag = true;

            for(int i = 1; i < n; i++){
                if (arr.get(i - 1) % arr.get(i) != 0){
                    flag = false;
                }
            }

            if(flag){
                for(int num: arr){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("-1");
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
