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

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution5 {

	 // Complete the kangaroo function below.
    static int kangaroo(int x1, int v1, int x2, int v2) {
    	Boolean flag=true;
    	String result="NO";
    	int hcf = 0;
    	int g=v1>v2?v1:v2;
    	int v=g;
    	int s=v1<v2?v1:v2;
    	
    	
    	while(flag) {
    		
    		if(g%s==0) {
    			hcf=g;   
    			break;
    		}else
    			g=g+v;
    		    
    	}
    		
    	/*while(flag) {
    		
    		if((x1+v1)==(x2+v2)) {
    			    		
    			
    			result="YES";
    			break;
    			
    		}
    		else {
    			v1=v1+v1;
    			v2=v2+v2;
    		}
    			
    		
    	}*/
    	
    	return hcf;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int result = kangaroo(0,4, 5, 15);
        System.out.println(result);

       

        //scanner.close();
    }

}