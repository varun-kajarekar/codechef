/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner vk = new Scanner(System.in);
		int t = vk.nextInt();
		while(t-->0){
		    int x  = vk.nextInt();
		    int y  = vk.nextInt();
		    int out = Math.abs(x-y);
		    System.out.println((out+1)/2);
		}
	}
}
