package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tabDelimeted {
public static void main(String[] a) throws IOException {
		
		String dataFileName = "C:\\Users\\anshu\\Desktop\\tab1.txt";

        /**
         * Creating a buffered reader to read the file
         */
        BufferedReader bReader = new BufferedReader(new FileReader(dataFileName));

        String line;

        /**
         * Looping the read block until all lines in the file are read.
         */
        while ((line = bReader.readLine()) != null) {

            /**
             * Splitting the content of tabbed separated line
             */
            String datavalue[] = line.split("\t");
            String value1 = datavalue[0];
            String value2 = datavalue[1];
            String value3 = datavalue[2];
            System.out.println(value1);
            System.out.println(value2);
            System.out.println(value3);
}	
		
		
	  }
	  

}
