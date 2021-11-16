
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
		    int n = vk.nextInt();
		    int[] arr = new int[n];
		    int out=0;
		    for (int i =0;i<arr.length ;i++ ){
		        arr[i] = vk.nextInt();
		        if(arr[i]%2==1){
		            out++;
		        }
		    }
		    System.out.println(out/2);
		}
	}
}