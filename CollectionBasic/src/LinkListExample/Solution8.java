package LinkListExample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//this olition is of greedy alogoirthm of hackerrank
//https://www.hackerrank.com/challenges/luck-balance/problem?filter=India&filter_on=country&h_l=interview&page=1&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=greedy-algorithms
public class Solution8 {

	// Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {

		List<Integer> a = new ArrayList<>();

		int count = 0;
		for (int j = 1; j < contests.length; j++) {

			if (contests[j][1] == 0)
				count = count + contests[j][0];

			else {
				a.add(contests[j][0]);
			}

		}
		
			
		
		

		Collections.sort(a);
		System.out.println("a size after sort " + a.size() + "first elemement" + a.get(0) +"2nd"+ a.get(1) + "3rd" +a.get(2) +"4th" +a.get(3) );
		
		List<Integer> b1 = new ArrayList<>();
		List<Integer> c1 = new ArrayList<>();

		if (k > 0) {
			b1 = a.subList(a.size() - k, a.size());
			c1 = a.subList(0, a.size() - k);

		}

		System.out.println("b1 size" + b1.size() + "first elemement" + b1.get(0) +"2nd"+ b1.get(1) + "3rd" +b1.get(2));
		Integer sum = b1.stream().collect(Collectors.summingInt(Integer::intValue));
		Integer minus = c1.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("sum" + sum);
		count = count + sum - minus;

		System.out.println("count is" + count + "list is" + a.size() + "first element" + a.get(0));

		return count;

	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);*/

        //int k = Integer.parseInt(nk[1]);

        int[][] contests = {
        		{10 ,1},
        		{ 90, 1} ,
        		{ 77, 0 },
        		{ 68, 0 },
        		{ 57, 0 },
        		{ 83, 1 },
        		{ 49, 0 },
        		{ 73, 0 },
        		{ 63, 0 },
        		{ 61, 0 },
        		{ 66, 0 {-truncated-}}
        };
        
        		
        

       /* for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }*/

        int result = luckBalance(3, contests);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }

}