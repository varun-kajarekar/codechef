
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void solveArray(){
        Scanner scn =new Scanner(System.in);
        int t=scn.nextInt();
		while(t-->0)
	    {
	        int n=scn.nextInt();
	        int m=scn.nextInt();
	        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
	        for(int i=1;i<=n;i++){
	            map.put(i,new ArrayList<>());
	        }
	        for(int i=1;i<n;i++){
	            if(m-->0)
	            map.get(i).add(i+1);
	        }
	        
	        for(int i=3;i<=n;i++){
	            for(int j=1;j<=i-2;j++){
	                if(m-->0)
	                map.get(i).add(j);
	                else
	                break;
	            }
	        }
	        
	        for(Integer key:map.keySet()){
	            ArrayList<Integer> list = map.get(key);
	            
	            for(int ele:list){
	                System.out.print(key + " " +ele);
	                System.out.println();
	            }
	        }
	        
	    }
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		solveArray();
	}
}
