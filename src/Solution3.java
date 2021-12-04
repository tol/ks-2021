import static java.lang.Math.*;

import java.util.*;
import java.io.*;

/***
 5
 4 6
 2 1
 7 12
 7 2
 2 1000
 6 18
 7 19
 7 13

 4 14
 6 6
 8 6
 */
public class Solution3 {

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
	/*	System.out.println("Reversed array is: \n");
		for (k = start;k < end+1; k++) {
			System.out.print(a[k]+";");
		}*/
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			int n = in.nextInt();
			int c = in.nextInt();
/*			Random ran = new Random();
			int n = ran.nextInt(10) ;
			int c = ran.nextInt(20) ;*/
			//System.out.println("c= "+c);
			//System.out.println("n= "+n);
			String r="";

			if (c>=n-1 ){
				int[] l=new int[n];
				for(int k=0;k<n;k++){

					l[k]=k+1;
				}

				int rev=c-(n-1);
				int start=0;
				int passes= 0;
				int end=n-1;
				while(rev>0 && start<=n-1){

                    int len=rev>1?start+rev:start+1;
                    if (len>end){
                    	len=end;
					}
                    rev=rev-(len-start+1)+1;
     				//System.out.println("rev list = "+(len-start+1));
					//System.out.println("rev  = "+rev);
					reverse(l,start,len);
					r="";
					for (int k = 0; k < n; k++) {
						r = r + l[k];
						if (k < n - 1) {
							r = r + " ";
						}
					}
						//System.out.println("l = "+r);
					if (passes%2==1) {
						start = start + 1;
					}else{
						end=end-1;
					}
					passes++;
				}
				if (rev==0) {
					r="";
					for (int k = 0; k < n; k++) {
						r = r + l[k];
						if (k < n - 1) {
							r = r + " ";
						}
					}
			/*	int c1=Solution1.reverseSort(l);
					System.out.println("c= "+c1);
					System.out.println("n= "+n);
					if (c!=c1){
						System.out.println("Wrong ansswer!");
					}*/
				} else{
					r="IMPOSSIBLE";
				}

			} else{

				r="IMPOSSIBLE";
			}



			System.out.println("Case #" + i + ": " + r);
			//System.out.println(s);
		}
	}
}

