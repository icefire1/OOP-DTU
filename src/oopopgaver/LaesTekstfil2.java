
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopopgaver;

import java.io.*;

public class LaesTekstfil2
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader ind = new BufferedReader(new FileReader("skrevet fil.txt"));
		String linje = ind.readLine();
		int alderssum = 0;
		while (linje != null)
		{
			String[] bidder = linje.split(" ");     // opdel i bidder efter mellemrum
                        if (!bidder[0].startsWith("#"))
                            alderssum = alderssum + Integer.parseInt( bidder[2] ); // brug tredje bid
			linje = ind.readLine();
		}
		System.out.println("Summen af aldrene er: "+alderssum);
	}
}