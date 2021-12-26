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
		    int x = vk.nextInt();
		    int y = vk.nextInt();
		    int z = vk.nextInt();
		    if(x+y>z) System.out.println("TRAIN");
		    else if(x+y == z) System.out.println("EQUAL");
		    else System.out.println("PLANEBUS");
		}
	}
}
