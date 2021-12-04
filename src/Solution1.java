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
public class Solution1 {

	public static int  min(int[] arr, int start){
		int min=arr[start];
		int mini=start;
		for (int i=start;i<arr.length;i++){
			if (arr[i]<min){
				mini=i;
				min=arr[i];
			}
		}
		return mini;
	}

	static void reverse1(int  a[])
	{
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}

	static void reverse(int a[], int start, int end)
	{
		int i, k, t;
		int n=end-start+1;
		//System.out.println("start: "+ start+" end"+end);
		for (i = 0; i < n / 2; i++) {
			t = a[i+start];
			a[i+start] = a[n - i - 1+start];
			a[n - i - 1+start] = t;
		}

		/*printing the reversed array*/
/*		System.out.println("Reversed array is: \n");
		for (k = start;k < end+1; k++) {
			System.out.print(a[k]+";");
		}*/
	}

	public static  int  reverseSort(int a[]){
		int cost=0;
		for (int i=0;i<a.length-1;i++){
			int j=min(a,i);
			//System.out.println("j = "+j);

			cost+=j-i+1;
			System.out.println("cost = "+cost);
			reverse(a,i,j);

			System.out.print("L=:");
			for (int k = 0;k < a.length;k++) {
				System.out.print(a[k]+";");
			}


			System.out.println("-------");

		}

	/*	System.out.println("Sorted array is: \n");
		for (int k = 0;k < a.length;k++) {
			System.out.print(a[k]+";");
		}*/

		return cost;
	}
	/**
	 * Reversort(L):
	 *   for i := 1 to length(L) - 1
	 *     j := position with the minimum value in L between i and length(L), inclusive
	 *     Reverse(L[i..j])
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {


			int n = in.nextInt();
			int[] arr= new int[n];

			for (int j=0;j<n;j++){
				arr[j]=in.nextInt();
			}

/**
3
4
4 2 1 3
2
1 2
7
7 6 5 4 3 2 1

 2
 6
 3 4 5 6 1 3
 */


			System.out.println("Case #" + i + ": " + reverseSort(arr));
			//System.out.println(s);
		}
	}
}

