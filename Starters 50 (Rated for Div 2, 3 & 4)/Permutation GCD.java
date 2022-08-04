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
		    int n = vk.nextInt();
		    int x = vk.nextInt();
		    
		    
		    
		    if(n>x){
		        System.out.println(-1);
		    }else if(n==x){
		        for (int i =1;i<n+1 ;i++ ){
		            System.out.print(i+" ");
		        } 
		        System.out.println();
		    }else{
		        System.out.print(x-n+1+" ");
		        for (int i =1;i<n+1 ;i++ ){
		            if(i!=x-n+1){
		                System.out.print(i+" ");
		            }
		        } 
		        System.out.println();
		    }
		    

		    
		}
	}
}
