package LinkListExample;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	
    	Map<Integer, Integer> map= new HashMap<Integer,Integer>();
    	for(int i=0;i<ar.length;i++) {
    		int a=ar[i];
    		if( map.containsKey(a) ) {
    			 map.put(a, map.get(a) + 1) ;
    		}else   			
    		    
    		    map.put(a, 1);
    	}
    	int count=0;
    	for(int i:map.keySet()) {
    		int j=map.get(i)/2;
    		count=count+j;
    	}
    	
    	return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        

        int[] ar = {1,2,1,2,1,3,3,4};
        

       

        int result = sockMerchant(8, ar);
        System.out.println(result);

    }
}