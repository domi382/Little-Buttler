package de.d3.little;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exec {
	public String exec(String cmd) {
		String line;
	    String output = "";
	    try {
	        Process p = Runtime.getRuntime().exec(cmd);
	        BufferedReader input = new BufferedReader
	            (new InputStreamReader(p.getInputStream()));
	        while ((line = input.readLine()) != null) {
	            output += (line + '\n');
	        }
	        input.close();
	        }
	    catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return output;
	}
}
