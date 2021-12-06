// TLE



import java.util.*;
import java.lang.*;
import java.time.Period;
import java.io.*;

class Codechef
{   
    static FastReader vk = new FastReader();

    public static void solve(int t){
        while(t-->0){
            int n =vk.nextInt();
            String sample = vk.next();
            char[] test = sample.toCharArray();
            if(n==1){
                System.out.println(sample);
            }
            else{

            char[] out12 = new char[n];

            for(int i=0;i<n-1;i++){
                char temp = test[i];
        
                for (int j = i+1; j < n; j++) {
                    if(temp=='R' && test[j]=='P' || temp=='P' && test[j]=='R'){
                        out12[i] ='P';
                        temp = 'P';
                    }
                    else if(temp=='R' && test[j]=='S' || temp=='S' && test[j]=='R'){
                        out12[i] = 'R';
                        temp = 'R';
                    }
                    else if(temp=='P' && test[j]=='S' || temp=='S' && test[j]=='P'){
                        out12[i] = 'S';
                        temp = 'S';
                    }
                    else if(temp==test[j]){
                        out12[i]=temp;
                    }
                }  
            }
            out12[n-1] = test[n-1];
            for(char c : out12){
                System.out.print(c);
            }
        }
        }
    }


















    public static void main (String[] args) throws java.lang.Exception
	{
		
        int t =vk.nextInt();
        solve(t);
        // System.out.println();
        
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
