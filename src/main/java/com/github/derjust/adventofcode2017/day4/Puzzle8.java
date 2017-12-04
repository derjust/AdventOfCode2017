package com.github.derjust.adventofcode2017.day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Puzzle8 {

	public static void main(String[] args) throws IOException {

		PasswordChecker checker = new PasswordChecker();
		int sum = 0;
		
        try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/Puzzle8Input.txt")))) {
        	String inputLine;
            while ((inputLine = in.readLine()) != null) {

            	boolean isValid = checker.isValid(inputLine);
            	
            	if (isValid) {
            		sum++;
            	}
            }
        }
        
        System.out.println(sum);

	}

}
