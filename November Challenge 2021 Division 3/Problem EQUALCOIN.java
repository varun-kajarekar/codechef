
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner vk = new Scanner(System.in);
	    int t = vk.nextInt();
	    while(t-->0){
	        long x = vk.nextInt();
	        long y = vk.nextInt();
	        if(x==0 && y%2==0){
	            System.out.println("YES");
	            continue;
	        }
	        else if(x==0 && y%2!=0){
	            System.out.println("NO");
	            continue;
	        }
	        if((x+(2*y))%2==0) System.out.println("YES");
	        else System.out.println("NO");
	    }
	}
}
