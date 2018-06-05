import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1, 3, -3, 6, 0, 10};
		int max = arr[0];
		for (int i = 0; i < 6; ++i) {
			if (arr[i] > max)
			  max = arr[i];
		}
		System.out.println(max);
		// your code goes here
	}
}
