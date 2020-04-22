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

public class Solution3 {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int level = 0; //Start at sea level
        int valleys = 0;
        boolean belowSea = false;
    	for(int i = 0; i < n; i++)
        {
            char slope = s.charAt(i);
            if(slope == 'U')//Uphill
                level++;
            else//Downhill
                level--;
            
            //Handle transitions
            if(!belowSea && level < 0)
            {
                valleys++;
                belowSea = true;
            }
            
            if(level >= 0)//We are back above sea level
                belowSea = false;
        }
        System.out.println(valleys);
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int result = countingValleys(4, "DDUU");

        System.out.println(result);
    }
}
