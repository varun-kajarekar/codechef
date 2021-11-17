
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        FastReader vk = new FastReader();

        int t =vk.nextInt();
        while(t-->0) {
            int n = vk.nextInt();
            List<Long> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                long ai=vk.nextLong();
                arr.add(ai);
            }
            long result=0l;
            for(long i=0;i<=61;i++){
                long temp=0l;
                for(int j=0;j<n;j++){
                    if(((1l<<i) & arr.get(j))>0)
                        temp++;
                }
                if(temp%2==0l)
                    continue;

                if(i==61){
                    result=-1;
                    break;
                }
                result+=(1l<<i);
                for(int k=0;k<n;k++){
                    long ele=arr.get(k);
                    ele=ele+(1l<<i);
                    arr.set(k,ele);
                }
            }
            System.out.println(result);
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
