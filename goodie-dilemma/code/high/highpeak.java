package high;
import java.util.Arrays;
import java.util.Scanner;
 class highpeak {

 static int minDiff(int array[],int N,int M) {
		int result=Integer.MAX_VALUE;
		Arrays.sort(array);
		for(int i=0;i<=N-M;i++)
			result=Math.min(result, array[i+M-1]-array[i]);
		return result;
 }
 static int findelements(int res,int array[],int N,int M)
 {
	 int result=Integer.MAX_VALUE;
	 for(int i=0;i<=N;i++) {
		 result=Math.min(result, array[i+M-1]-array[i]);
		 if(res==result)
			 return i;
	 }
	 return 0;
	}
 public static void main (String[] args) {
	 int array[]= {7980,22349,99,2799,229900,11101,9999,2195,9800,4999};
	 String items[]= {"MI Band:999","Sandwich Toaster:2195","Cult Pass: 2799" ,"Scale: 4999", "Fitbit Plus: 7980","Microwave Oven: 9800","Alexa: 9999","Digital Camera:11101","Macbook pro:229900","IPods:22349"};
	 int N = array.length;
	 System.out.println("Enter the number of employee");
	 Scanner s =new Scanner(System.in);
	 int M=s.nextInt();
	 int result=minDiff(array,N,M);
	 System.out.println("Number of the employees:"+M);
	 int startindex=findelements(result,array,N,M);
	 System.out.println("Here the goodies that are selected for disribution are: ");
	for(int i=startindex;i<startindex+M;i++)
		System.out.println(items[i]);
		 System.out.println("And the difference between the chosen goodie with highest price and the lowest price is");
		 System.out.println(+result);
 }	 
 }
