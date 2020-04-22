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

public class Solution4 {

	// Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	
    	int i=0;
        int count=0;
    	while(i<s.length()-1) {
    		char ch=s.charAt(i);
    		if(ch==s.charAt(i+1)) 
    		count++;	
    		i++;   		
    			
    	
    	}

    	return count;

    }

   

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       /* int q = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
*/
            int result = alternatingCharacters("AAABBB");
            System.out.println(result);

           // bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        
    }

