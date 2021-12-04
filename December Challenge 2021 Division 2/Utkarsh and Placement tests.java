import java.util.*;
import java.lang.*;
import java.time.Period;
import java.io.*;

class Codechef
{   
    static FastReader vk = new FastReader();

    public static void solve(int t){
        while(t-->0){
            String[] arr = new String[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = vk.next(); 
            }
            String st = vk.next(); 
            String nd = vk.next();
            int st1 = 0;
            int nd1 = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals(st)){
                    st1=i;         
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals(nd)){
                    nd1=j;          
                }
            }
            if(st1>nd1){
                System.out.println(nd);
            }
            else {
                System.out.println(st);
            }
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
