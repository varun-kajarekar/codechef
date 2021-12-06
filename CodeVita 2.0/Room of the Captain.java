/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        while (sc.hasNextInt())
            list.add(sc.nextInt());
        HashMap<Integer,Integer> map=new HashMap<>();
        for (Integer i:list){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=0;
        for (Map.Entry<Integer,Integer> x: map.entrySet()){
            if(x.getValue()!=k)
                ans=x.getKey();
        }
        System.out.println(ans);
		
	}
}
