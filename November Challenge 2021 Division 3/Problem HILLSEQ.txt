
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = scn.nextInt();
		    }
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    int max_num = arr[0];
		    for(int i=0; i<n; i++){
		        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		        
		        max_num = Math.max(max_num, arr[i]);
		    }
		    
		    int max_freq = 0;
		    for(int key : map.keySet()){
		        max_freq = Math.max(max_freq, map.get(key));
		    }
		    
		    if(max_freq > 2  ||  (map.get(max_num) > 1)){
		        System.out.println("-1");
		    }
		    else{
		        ArrayList<Integer> al1 = new ArrayList<>();
		        ArrayList<Integer> al2 = new ArrayList<>();
		        
		        for(int key : map.keySet()){
		            if(map.get(key) > 1){
		                al1.add(key);
		            }
		            
		            al2.add(key);
		        }
		        
		        Collections.sort(al1);
		        Collections.sort(al2);
		        Collections.reverse(al2);
		        for(int i=0; i<al1.size(); i++){
		            System.out.print(al1.get(i) +  " ");
		        }
		        for(int i=0; i<al2.size(); i++){
		            System.out.print(al2.get(i) +  " ");
		        }
		        
		        System.out.println();
		    }
		    
		}
	}
}