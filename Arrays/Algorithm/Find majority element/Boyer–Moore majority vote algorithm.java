
package mainpkg;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] inp= br.readLine().split(" ");
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for (String i: inp)
		{
			arr.add(Integer.parseInt(i));
		}
		
		int m= arr.get(0);
		int counter=0;
		
		for (int i: arr)
		{
			if (counter==0 )
			{
				m=i;counter=1;
			}
			else if (m==i)
			{
				counter++;
			}
			else
			{
				counter--;
			}
		}
		
		System.out.print(m);

	}
}
