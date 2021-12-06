import java.io.*;
import java.io.*;
import java.math.BigInteger;

class Codechef
{
  public static void main(String[] args) throws IOException
  {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t-->0)
	{
	    String[] s=br.readLine().split(" ");
	    int x=Integer.parseInt(s[0]);
	    int y=Integer.parseInt(s[1]);
		int c=(int)Math.ceil(x/9.0);
		int r=(int)Math.ceil(y/9.0);
		if(c==r)
		System.out.println("1 "+c);
		else if(c<r)
		{
			System.out.println("0 "+c);
		}
		else
		{
			System.out.println("1 "+r);
		}
	}
  }
}
