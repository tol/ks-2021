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
public class Solution {


	public static void verifySolution (String s , int[] l){

		//for

	}


	public static String generateOdd(int s,char start){
		String sol="";
		for(char c = start; c <(start+s) ; ++c)
			sol+=c;

		System.out.println(sol);
		return sol;

	}

	public static String generateEven(int s,char start){
		String sol="";

		for(char c = (char)(s+start); c>start ; --c)
			sol+=c;

		System.out.println(sol);

		return sol;

	}

	//A BCDEF A
	//A ABCDB A

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {


			int n = in.nextInt();

			int[] sizes=new int[n];

			for (int j = 0;  j< n; ++j) {
				sizes[j] = in.nextInt();
			}

			char c = 'A';

			String s="";
			//s+=c;


			for (int j=n-1;j>=0;j--) {

				if (sizes[j] % 2 == 0) {
					s=generateEven(sizes[j],'A')+s;

				} else {
					s=generateOdd(sizes[j],'A')+s;
				}

			}
			s='A'+s;

			char[] sc = s.toCharArray();

			int index=0;
			for (int j = 0;  j< n-1; ++j) {

				index+=sizes[j];

				if (sizes[j] % 2 == 1) {

					sc[index]=(char)(s.charAt(index+1)+1);

				}


			}



			System.out.println("Case #" + i + ": " + String.valueOf(sc));
			//System.out.println(s);
		}
	}
}

