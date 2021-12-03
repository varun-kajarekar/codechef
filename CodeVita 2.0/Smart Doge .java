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
		// int z=Integer.parseInt(s[2]);
		System.out.println(x%y);
	}
  }
}
