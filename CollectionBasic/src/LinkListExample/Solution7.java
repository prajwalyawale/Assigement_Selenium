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

public class Solution7 {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {

		int result=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i]))
				map.put(ar[i], map.get(ar[i]) + 1);
			else
				map.put(ar[i], 1);

		}	
		
		int j=0;
		int g=ar[j];
		while(j<ar.length-1) {			
			if(ar[j+1]>g)
			g=ar[j+1];	
			j++;
		}
		
		result=map.get(g);

		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int result = birthdayCakeCandles(new int[] { 3, 2, 1, 3 });

		System.out.println(result);

		scanner.close();
	}

}