
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner vk = new Scanner(System.in);
		int t =vk.nextInt();
		while(t-->0){
		    int x =vk.nextInt();    //petrol
		    int y =vk.nextInt();    //diesel
		    int a =vk.nextInt();    //petrol increse
		    int b =vk.nextInt();    //diesel increse
		    int k =vk.nextInt();    //total month
            
            int out1 =(k*a) + x;
            int out2 = (k*b) + y;
            if(out1>out2) System.out.println("DIESEL");
		    else if (out1<out2) System.out.println("PETROL");
		    else System.out.println("SAME PRICE");
		}
	}
}
