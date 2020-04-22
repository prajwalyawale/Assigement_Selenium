package LinkListExample;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long l=0l;
    	StringBuffer b= new StringBuffer(s);
    	System.out.println(b);
    	
    	//char[] st= new char[(int) n];
    	long ln=s.length();
    	int j=0;
    	for(int i=s.length()-1;i<n-1;i++) {    		
    		b.append(s.charAt(j));
    		j++;    		
    		if(j==s.length())
    		j=0;	
    		
    		
    	}
    	System.out.println(b);
    	long n1=0l;
    	for(int i=0;i<b.length();i++) 
    	{
    		if('a'==b.charAt(i))
    			n1++;	
    			
    		
    	}
    	
    	return n1;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        long result = repeatedString("abc", 10);
        System.out.println(result);

       
}
}
