/* package codechef; // don't place package name! */
//Arif Basha
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvenSplits
{
    public static String zeroCount(int count) {
        String str = "";
        while(count-- != 0) str += '0';
        return str;
    }
    
    public static String oneCount(int count) {
        String str = "";
        while(count-- != 0) str += '1';
        return str;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner arif = new Scanner(System.in);
		int testCases = arif.nextInt();
		long number = 0;
		while(testCases-- != 0) {
	        int one = 0, zero = 0;
	        number = arif.nextInt();
	        arif.nextLine();
	        String str = arif.nextLine();
	        for(int i=0;i<str.length();i++) {
	            if(str.charAt(i) == '1')
	                 one++;
	            else 
	                 zero++;
	        }
	        if(number == 2)
	            System.out.println(str);
	        else {
	           // String str1 = "";
	           // while(zero-- != 0) str1 += '0';
	           // while(one-- != 0) str1 += '1';
	           // System.out.println(str1);
	           String zeroStr = zeroCount(zero);
	           String oneStr = oneCount(one);
	           
	           System.out.println(zeroStr+""+oneStr);
	        }
		       
		}
		
	}
}
