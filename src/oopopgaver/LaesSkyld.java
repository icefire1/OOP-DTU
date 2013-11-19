/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopopgaver;

import java.io.*;

public class LaesSkyld
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader ind = new BufferedReader(new FileReader("skyld.txt"));
		String linje = ind.readLine();
                float sum;
		while (linje != null)
		{
                        sum = 0;
			String[] bidder = linje.split(" ");     // opdel i bidder efter mellemrum
                        if (!bidder[0].equals( "#" )) {
                            for (int i=1; i<bidder.length; i++) // Start i index 1
                                sum += Float.parseFloat(bidder[i]);
                            System.out.println(bidder[0] + " skylder: " + sum);
                        }
			linje = ind.readLine();
		}
	}
}