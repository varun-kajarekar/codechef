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
            int k = vk.nextInt();
            String s1 = vk.nextLine();
            int temp = 0;
            char[] s= s1.toCharArray();

            char[] ans = new char[k];
            if(k%2==1){
                for(int i =k;i>=1;i-=2){
                    ans[i-1] = s[temp++];
                }
                for(int i=2;i<k;i+=2){
                    ans[i-1] = s[temp++];
                }
            }
            else{
                for(int i =k;i>=1;i-=2){
                    ans[i-1] = s[temp++];
                }
                for(int i=1;i<k;i+=2){
                    ans[i-1] = s[temp++];
                }
            }
            for (int i = 0; i < k; i++) {
                System.out.print(ans[i]);
            }
            for (int i = k; i < n; i++) {
                System.out.print(s[i]);
            }
            System.out.println();
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





    // To find prime numbers from 0 to n.
    public static void sieveOfEratosthenes(int n)
    {
        // Create a boolean array
        // "prime[0..n]" and
        // initialize all entries
        // it as true. A value in
        // prime[i] will finally be
        // false if i is Not a
        // prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++)
        {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true)
            {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        // Print all prime numbers
        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
    public static int Power(int x,int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return Power(x*x,n/2 );
        }
        else{
            return x * Power(x*x,n/2 );
        }
    }
}
