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
		int T = vk.nextInt();
		while(T-->0){
		   int N = vk.nextInt();
		   
		   if(N == 3){
		       System.out.print("3 2 1");
		   }else{
		       System.out.print(N+" "+(N-2)+" ");
		       for (int i =1;i<N-3 ;i++ ){
		          System.out.print(i+" ");
		       }
		       System.out.print((N-3)+" "+(N-1));
		   }
		   System.out.println();
		    

		}
	}
}
