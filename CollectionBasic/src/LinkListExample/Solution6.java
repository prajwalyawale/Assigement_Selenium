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

public class Solution6 {

	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {

		HashMap<Character,Integer > map = new HashMap<>();
		HashMap<Character, Integer> map1 = new HashMap<>();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {

			if (map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
			} else {

				map.put(a.charAt(i), 1);
			}
		}
		// ----------------
		for (int i = 0; i < a.length(); i++) {
			if (map1.containsKey(b.charAt(i))) {
				map1.put(b.charAt(i), map1.get(b.charAt(i))+ 1);
			} else {

				map1.put(b.charAt(i), 1);
			}
		}

		for (int j = 0; j < b.length(); j++) {
			if (map.containsKey(b.charAt(j))) {
				if(!(map.get(b.charAt(j))==map1.get(b.charAt(j))))
				count=count +Math.abs(map.get(b.charAt(j))-map1.get(b.charAt(j)));
				map.remove(b.charAt(j));
				map1.remove(b.charAt(j));
			}
			else
				count++;

		}

		for (int j = 0; j < a.length(); j++) {
			if (map1.containsKey(a.charAt(j))) {
				if(!(map1.get(a.charAt(j))==map.get(a.charAt(j))))
					count=count +Math.abs(map1.get(a.charAt(j))-map.get(a.charAt(j)));
			}
				
			else 
			 count++;

		}
		

		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int res = makeAnagram("fcrxzwscanmligyxyvym",
				"jxwtrhvujlmrpdoqbisbwhmgpmeoke");
		System.out.println(res);

	}

}