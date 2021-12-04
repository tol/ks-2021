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
public class Solution2 {


	/**
	 * 4
	 * 2 3 CJ?CC?
	 * 4 2 CJCJ
	 * 1 3 C?J
	 * 2 5 ??J???
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {


			int cj = in.nextInt();
			int jc = in.nextInt();
			String s=in.next();

			String res="";
			int n=s.length();
			char left='N';
			int cost=0;
			boolean start=false;
			for (int j=0;j<n;j++){
				if (s.charAt(j)=='?'){
					//
					start=true;
				}
				else{

					if (start){
						char right=s.charAt(j);
						if (left!='N'){
							if (left!=right){
								if (left=='C'){
									cost+=cj;
								}
								else {
									cost+=jc;
								}
							}
						}
					}
					start=false;
					left=s.charAt(j);
				}
			}

			for (int j=0;j<n-1;j++){
				if (s.charAt(j)=='C' && s.charAt(j+1)=='J'){
					cost+=cj;
				}
				if (s.charAt(j)=='J' && s.charAt(j+1)=='C'){
					cost+=jc;
				}

			}

			System.out.println("Case #" + i + ": " + cost);
			//System.out.println(s);
		}
	}
}

