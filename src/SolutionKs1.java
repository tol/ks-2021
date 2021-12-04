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
public class SolutionKs1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {


			int n = in.nextInt();
			int k = in.nextInt();
			String s=in.next();

			int min=0;
			int g=0;
			for (int j=0;j<n/2;j++){
				if (s.charAt(j)!=s.charAt(n-j-1)){
					g++;
				}
			}


			System.out.println("Case #" + i + ": " + abs(k-g));
			//System.out.println(s);
		}
	}
}

