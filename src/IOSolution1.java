import static java.lang.Math.*;

import java.util.*;
import java.io.*;

/***
 * 2
 * 5 1
 * ABCAA
 * 4 2
 * ABAA
 */
public class IOSolution1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {


			//int n = in.nextInt();


			int k = in.nextInt();
			int[] pets=new int[k];

			for (int j = 0;  j< k; ++j) {
				pets[j] = in.nextInt();

			}

			Arrays.sort(pets);

			int food=1;
			int s=food;

			int last=pets[0];
			int j=1;
			while(j<pets.length){
				if(pets[j]!=last){
					food++;

				}
				s+=food;
				last=pets[j];

                j++;
			}


			System.out.println("Case #" + i + ": " + s);
			//System.out.println(s);
		}
	}
}

