package lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerOutput {
	public static void main( String args[] ) {
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            for( int i = 0; i < 3; ++i ) {
                System.out.println(br.readLine());
            }

        } catch( IOException e ) { e.printStackTrace(); }
        finally {
            if( br != null ) {
                try {
                    br.close();
                } catch( IOException e ) { e.printStackTrace(); }
            }
        }
    }
}
