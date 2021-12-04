import java.util.*;
import java.lang.*;
import java.time.Period;
import java.io.*;

class Codechef
{   
    static FastReader vk = new FastReader();

    public static void solve(int t){
        while(t-->0){
            int n = vk.nextInt();
            int m = vk.nextInt();
            String mn = "";
            if(m==n){
                for(int i=0;i<n+1;i++ ){
                    mn += "10";
                }
            }
            else if(m>n){
                for(int i=0;i<n+1;i++ ){
                    mn += "10";
                }
                for(int i=0;i<m-n-1;i++ ){
                    mn += "110";
                }
                mn+="1";
            }
            else{
                for(int i=0;i<m;i++ ){
                    mn += "01";
                }
                for(int i=0;i<n-m;i++ ){
                    mn += "010";
                }
            }
            System.out.println(mn.length());
            System.out.println(mn);
        }
    }

    public static void main (String[] args) throws java.lang.Exception
	{
		
        int t =vk.nextInt();
        solve(t);
        
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
