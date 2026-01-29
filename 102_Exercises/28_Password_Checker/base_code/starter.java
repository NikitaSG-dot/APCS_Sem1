import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		boolean str1 = false;
		boolean str2 = false;
		boolean str3 = false;
		boolean str4 = false;
		String word;
		int len;
		for ( int x = 0; x < passwords.length; x++)
		{
		    str1 = false;
		    str2 = false;
		    str3 = false;
		    str4 = false;
		    word = passwords[x];
          
		    len = word.length();
		    if (len >= 8)
		    {
		        str1 = true;
		    }
		    if (word.contains("!") || word.contains("@")|| word.contains("#")|| word.contains("$")|| word.contains("%")||word.contains("^")|| word.contains("&")|| word.contains("*"))
		    {
		        str2 = true;
		    }
		    if (str1 == true && str2 == true)
		    {
		        str3 = true;
		    }
		    if (str1 != true && str2 != true && str3 != true)
		    {
		        str4 = true;
		    }
		    if (str1 == true && str2 != true)
		    {
		        s1++;
		    }
		    if (str1 != true && str2 == true)
		    {
		        s2++;
		    }
		    if (str3 == true)
		    {
		        s3++;
		    }
		    if (str4 == true)
		    {
		        s4++;
		    }
		}
		System.out.println("There are "+s1+" passwords with strength 1.");
		System.out.println("There are "+s2+" passwords with strength 2.");
		System.out.println("There are "+s3+" passwords with strength 3.");
		System.out.println("There are "+s4+" passwords with no strength.");

		
	}
}
